package net.droidplays08.create_ss_crate.block;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.Registries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.EndPortalFrameBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.SpawnerBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.level.BlockEvent;

@EventBusSubscriber(modid = "create_ss_crate")
public final class SpecialCrate {
    @SubscribeEvent

    public static void onBlockBreak(BlockEvent.BreakEvent event) {
        if (!(event.getLevel() instanceof ServerLevel level)) {
            return;
        }

        BlockPos pos = event.getPos();
        BlockState brokenState = event.getState();

        boolean specialCrate = brokenState.is(ModBlocks.BARN_SPAWNER_CRATE)
                || brokenState.is(ModBlocks.END_PORTAL_PLACER_CRATE)
                || brokenState.is(ModBlocks.END_PORTAL_BREAKER_CRATE);

        if (specialCrate && hasSilkTouch(level, event.getPlayer().getMainHandItem())) {
            return;
        }

        if (brokenState.is(ModBlocks.BARN_SPAWNER_CRATE)) {
            event.setCanceled(true);
            PlaceBarnSpawner(level, pos);
            return;
        }

        if (brokenState.is(ModBlocks.END_PORTAL_PLACER_CRATE)) {
            if (canPlaceEndPortalFrames(level, pos)) {
                // Stop vanilla from removing the log, then remove it ourselves so the portal center is clear.
                event.setCanceled(true);
                level.setBlock(pos, Blocks.AIR.defaultBlockState(), 3);
                placeEndPortalFrames(level, pos);
            } else if (event.getPlayer() instanceof ServerPlayer player) {
                // Do not cancel the break here. Vanilla will break and drop the oak log normally.
                notifyPortalPlacementFailed(player);
            }
        }

        if (brokenState.is(ModBlocks.END_PORTAL_BREAKER_CRATE)) {
            event.setCanceled(true);
            level.setBlock(pos, Blocks.AIR.defaultBlockState(),3);
            breakEndPortalFrame(level, pos);
        }
    }

    private static boolean hasSilkTouch (ServerLevel level, ItemStack stack) {
        return stack.getEnchantmentLevel(
                level.registryAccess()
                        .registryOrThrow(Registries.ENCHANTMENT)
                        .getHolderOrThrow(Enchantments.SILK_TOUCH)
        ) > 0;
    }

    private static void PlaceBarnSpawner(ServerLevel level, BlockPos pos) {
        level.setBlock(pos, Blocks.SPAWNER.defaultBlockState(), 3);

        BlockEntity blockEntity = level.getBlockEntity(pos);
        if (!(blockEntity instanceof SpawnerBlockEntity spawner)) {
            return;
        }

        CompoundTag spawnerTag = new CompoundTag();

        // These are the normal vanilla spawner values.
        spawnerTag.putShort("Delay", (short) 20);
        spawnerTag.putShort("MinSpawnDelay", (short) 200);
        spawnerTag.putShort("MaxSpawnDelay", (short) 800);
        spawnerTag.putShort("SpawnCount", (short) 4);
        spawnerTag.putShort("MaxNearbyEntities", (short) 6);
        spawnerTag.putShort("RequiredPlayerRange", (short) 16);
        spawnerTag.putShort("SpawnRange", (short) 4);

        // The current first mob is a pig. Future cycles choose from SpawnPotentials below.
        CompoundTag spawnData = new CompoundTag();
        CompoundTag currentEntity = new CompoundTag();
        currentEntity.putString("id", "minecraft:pig");
        spawnData.put("entity", currentEntity);
        spawnerTag.put("SpawnData", spawnData);

        // All weights are 1, so each animal has the same chance of being selected.
        ListTag spawnPotentials = new ListTag();
        spawnPotentials.add(makeSpawnPotential("minecraft:chicken", 1));
        spawnPotentials.add(makeSpawnPotential("minecraft:cow", 1));
        spawnPotentials.add(makeSpawnPotential("minecraft:pig", 1));
        spawnPotentials.add(makeSpawnPotential("minecraft:sheep", 1));
        spawnerTag.put("SpawnPotentials", spawnPotentials);

        spawner.loadCustomOnly(spawnerTag, level.registryAccess());
        spawner.setChanged();
        level.sendBlockUpdated(pos, level.getBlockState(pos), level.getBlockState(pos), 3);
    }

    private static CompoundTag makeSpawnPotential(String entityId, int weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Spawner weight must be at least 1.");
        }

        CompoundTag entry = new CompoundTag();
        entry.putInt("weight", weight);

        CompoundTag data = new CompoundTag();
        CompoundTag entity = new CompoundTag();
        entity.putString("id", entityId);
        data.put("entity", entity);

        entry.put("data", data);
        return entry;
    }

    private static boolean canPlaceEndPortalFrames(ServerLevel level, BlockPos center) {
        // x takes these values in order: -1, 0, 1.
        // This checks the three north frame blocks (z = -2) and three south frame blocks (z = 2).
        for (int x = -1; x <= 1; x++) {
            if (!level.getBlockState(center.offset(x, 0, -2)).isAir()) return false;
            if (!level.getBlockState(center.offset(x, 0, 2)).isAir()) return false;
        }

        // z takes these values in order: -1, 0, 1.
        // This checks the three west frame blocks (x = -2) and three east frame blocks (x = 2).
        for (int z = -1; z <= 1; z++) {
            if (!level.getBlockState(center.offset(-2, 0, z)).isAir()) return false;
            if (!level.getBlockState(center.offset(2, 0, z)).isAir()) return false;
        }

        return true;
    }

    private static void placeEndPortalFrames(ServerLevel level, BlockPos center) {
        // Every frame points inward toward the center of the future portal.
        BlockState northRow = portalFrame(Direction.SOUTH);
        BlockState southRow = portalFrame(Direction.NORTH);
        BlockState westRow = portalFrame(Direction.EAST);
        BlockState eastRow = portalFrame(Direction.WEST);

        // Place the north and south rows of three frames.
        for (int x = -1; x <= 1; x++) {
            level.setBlock(center.offset(x, 0, -2), northRow, 3);
            level.setBlock(center.offset(x, 0, 2), southRow, 3);
        }

        // Place the west and east columns of three frames.
        for (int z = -1; z <= 1; z++) {
            level.setBlock(center.offset(-2, 0, z), westRow, 3);
            level.setBlock(center.offset(2, 0, z), eastRow, 3);
        }
    }

    private static BlockState portalFrame(Direction facing) {
        // Frames begin with no Eye of Ender. Vanilla creates the portal after the player adds all 12 Eyes.
        return Blocks.END_PORTAL_FRAME.defaultBlockState()
                .setValue(EndPortalFrameBlock.FACING, facing)
                .setValue(EndPortalFrameBlock.HAS_EYE, false);
    }

    private static void breakEndPortalFrame(ServerLevel level, BlockPos center) {
        for (int x = -2; x <= 2; x++) {
            for (int y = -2; y <= 2; y++) {
                for (int z = -2; z <= 2; z++) {
                    BlockPos target = center.offset(x, y, z);

                    BlockState state = level.getBlockState(target);
                    if (state.is(Blocks.END_PORTAL_FRAME) || state.is(Blocks.END_PORTAL)) {
                        // false means destroyed blocks do not drop as items.
                        level.destroyBlock(target, false);
                    }
                }
            }
        }
    }

    private static void notifyPortalPlacementFailed(ServerPlayer player) {
        // sendSystemMessage is a direct, player-only alternative to a targeted /tellraw command.
        player.sendSystemMessage(
                Component.translatable("message.create_ss_crate.end_portal_placer_crate_blocked")
                        .withStyle(ChatFormatting.RED)
        );

        // This is equivalent to /playsound minecraft:entity.villager.no player <player>.
        // The first 1.0F is volume; the second is pitch. Both are normal values.
        player.playNotifySound(SoundEvents.VILLAGER_NO, SoundSource.PLAYERS, 1.0F, 1.0F);
    }

    private SpecialCrate() {
    }
}
