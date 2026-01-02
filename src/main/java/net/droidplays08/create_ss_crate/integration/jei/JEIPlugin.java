package net.droidplays08.create_ss_crate.integration.jei;

import com.simibubi.create.AllBlocks;
import com.simibubi.create.AllItems;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.registration.IRecipeRegistration;
import net.droidplays08.create_ss_crate.Create_SS_Crate;
import net.droidplays08.create_ss_crate.block.ModBlocks;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

import java.util.List;

@JeiPlugin
public class JEIPlugin implements IModPlugin {

    public void registerRecipes(IRecipeRegistration registration) {
        registration.addIngredientInfo(List.of(
                new ItemStack(ModBlocks.DIRT_CRATE.get()), new ItemStack(Items.DIRT), new ItemStack(Items.OAK_SAPLING), new ItemStack(Items.BONE_MEAL)),
                VanillaTypes.ITEM_STACK,
                Component.translatable("create_ss_crate.jei.info.dirt_crate"));
        registration.addIngredientInfo(List.of(
                        new ItemStack(ModBlocks.WOOD_CRATE.get()), new ItemStack(Items.DIRT), new ItemStack(Items.COBBLESTONE), new ItemStack(Items.ICE), new ItemStack(Items.LAVA_BUCKET)),
                VanillaTypes.ITEM_STACK,
                Component.translatable("create_ss_crate.jei.info.wood_crate"));
        registration.addIngredientInfo(List.of(
                        new ItemStack(ModBlocks.STARTER_CRATE.get()), new ItemStack(Items.OAK_LOG), new ItemStack(Items.DIRT), new ItemStack(Items.IRON_NUGGET), new ItemStack(Items.COAL)),
                VanillaTypes.ITEM_STACK,
                Component.translatable("create_ss_crate.jei.info.starter_crate"));
        registration.addIngredientInfo(List.of(
                        new ItemStack(ModBlocks.STONE_CRATE.get()), new ItemStack(Items.ANDESITE), new ItemStack(Items.DIORITE), new ItemStack(Items.GRANITE), new ItemStack(Items.COBBLED_DEEPSLATE), new ItemStack(Items.CALCITE), new ItemStack(Items.TUFF), new ItemStack(Items.POINTED_DRIPSTONE)),
                VanillaTypes.ITEM_STACK,
                Component.translatable("create_ss_crate.jei.info.stone_crate"));
        registration.addIngredientInfo(List.of(
                        new ItemStack(ModBlocks.ORE_CRATE.get()), new ItemStack(Items.DIAMOND), new ItemStack(Items.AMETHYST_SHARD), new ItemStack(Items.LAPIS_LAZULI), new ItemStack(Items.IRON_INGOT), new ItemStack(Items.COPPER_INGOT), new ItemStack(Items.COAL), new ItemStack(Items.GOLD_INGOT), new ItemStack(Items.COBBLESTONE), new ItemStack(Items.OBSIDIAN), new ItemStack(Items.IRON_NUGGET), new ItemStack(Items.DIRT), new ItemStack(Items.GRAVEL), new ItemStack(AllItems.ZINC_INGOT.get())),
                VanillaTypes.ITEM_STACK,
                Component.translatable("create_ss_crate.jei.info.ore_crate"));
        registration.addIngredientInfo(List.of(
                        new ItemStack(ModBlocks.FARMER_CRATE.get()), new ItemStack(Items.SUGAR_CANE), new ItemStack(Items.CACTUS), new ItemStack(Items.MOSS_BLOCK), new ItemStack(Items.BAMBOO), new ItemStack(Items.KELP), new ItemStack(Items.PUMPKIN_SEEDS), new ItemStack(Items.MELON_SEEDS), new ItemStack(Items.GLOW_BERRIES), new ItemStack(Items.SWEET_BERRIES), new ItemStack(Items.COCOA_BEANS), new ItemStack(Items.BROWN_MUSHROOM), new ItemStack(Items.RED_MUSHROOM)),
                VanillaTypes.ITEM_STACK,
                Component.translatable("create_ss_crate.jei.info.farmer_crate"));
        registration.addIngredientInfo(List.of(
                        new ItemStack(ModBlocks.CREATE_STONE_CRATE.get())),
                VanillaTypes.ITEM_STACK,
                Component.translatable("create_ss_crate.jei.info.create_stone_crate"));
        registration.addIngredientInfo(List.of(
                        new ItemStack(ModBlocks.NETHER_CRATE.get()), new ItemStack(Items.NETHERRACK), new ItemStack(Items.MAGMA_BLOCK), new ItemStack(Items.SOUL_SAND), new ItemStack(Items.SOUL_SOIL), new ItemStack(Items.CRIMSON_NYLIUM), new ItemStack(Items.WARPED_NYLIUM)),
                VanillaTypes.ITEM_STACK,
                Component.translatable("create_ss_crate.jei.info.nether_crate"));
        registration.addIngredientInfo(List.of(
                        new ItemStack(ModBlocks.BLAZING_NETHER_CRATE.get()), new ItemStack(AllBlocks.BLAZE_BURNER), new ItemStack(Items.BLAZE_ROD), new ItemStack(Items.NETHERRACK), new ItemStack(Items.MAGMA_BLOCK), new ItemStack(Items.GLOWSTONE), new ItemStack(Items.NETHER_WART)),
                VanillaTypes.ITEM_STACK,
                Component.translatable("create_ss_crate.jei.info.blazing_nether_crate"));
        registration.addIngredientInfo(List.of(
                        new ItemStack(ModBlocks.NETHERITE_CRATE.get()), new ItemStack(Items.NETHERRACK), new ItemStack(Items.RIB_ARMOR_TRIM_SMITHING_TEMPLATE), new ItemStack(Items.WITHER_SKELETON_SKULL), new ItemStack(Items.ANCIENT_DEBRIS), new ItemStack(Items.SOUL_SAND), new ItemStack(Items.MAGMA_BLOCK), new ItemStack(Items.NETHER_WART), new ItemStack(Items.BLAZE_ROD), new ItemStack(Items.LAVA_BUCKET), new ItemStack(Items.SADDLE), new ItemStack(Items.IRON_HORSE_ARMOR), new ItemStack(Items.GOLDEN_HORSE_ARMOR), new ItemStack(Items.DIAMOND_HORSE_ARMOR), new ItemStack(Items.MUSIC_DISC_PIGSTEP), new ItemStack(Items.GOLD_INGOT), new ItemStack(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE)),
                VanillaTypes.ITEM_STACK,
                Component.translatable("create_ss_crate.jei.info.netherite_crate"));
        registration.addIngredientInfo(List.of(
                        new ItemStack(ModBlocks.SCULK_CRATE.get()), new ItemStack(Items.SCULK), new ItemStack(Items.SCULK_SHRIEKER), new ItemStack(Items.SCULK_SENSOR), new ItemStack(Items.SCULK_VEIN), new ItemStack(Items.DEEPSLATE), new ItemStack(Items.STONE), new ItemStack(Items.COBWEB)),
                VanillaTypes.ITEM_STACK,
                Component.translatable("create_ss_crate.jei.info.sculk_crate"));
        registration.addIngredientInfo(List.of(
                        new ItemStack(ModBlocks.DEEP_DARK_CRATE.get()), new ItemStack(Items.VEX_ARMOR_TRIM_SMITHING_TEMPLATE), new ItemStack(Items.SENTRY_ARMOR_TRIM_SMITHING_TEMPLATE), new ItemStack(Items.WARD_ARMOR_TRIM_SMITHING_TEMPLATE), new ItemStack(Items.SNOUT_ARMOR_TRIM_SMITHING_TEMPLATE), new ItemStack(Items.SILENCE_ARMOR_TRIM_SMITHING_TEMPLATE), new ItemStack(Items.DEEPSLATE), new ItemStack(Items.TUFF), new ItemStack(Items.GRAVEL), new ItemStack(Items.SCULK), new ItemStack(Items.SCULK_CATALYST), new ItemStack(Items.SCULK_SENSOR), new ItemStack(Items.SPORE_BLOSSOM), new ItemStack(Items.DIAMOND_HOE), new ItemStack(Items.ECHO_SHARD), new ItemStack(Items.DISC_FRAGMENT_5)),
                VanillaTypes.ITEM_STACK,
                Component.translatable("create_ss_crate.jei.info.deep_dark_crate"));
        registration.addIngredientInfo(List.of(
                        new ItemStack(ModBlocks.SNIFFER_CRATE.get()), new ItemStack(Items.HOST_ARMOR_TRIM_SMITHING_TEMPLATE), new ItemStack(Items.SHAPER_ARMOR_TRIM_SMITHING_TEMPLATE), new ItemStack(Items.RAISER_ARMOR_TRIM_SMITHING_TEMPLATE), new ItemStack(Items.WAYFINDER_ARMOR_TRIM_SMITHING_TEMPLATE), new ItemStack(Items.SNIFFER_EGG), new ItemStack(Items.DIRT), new ItemStack(Items.GRAVEL), new ItemStack(Items.TERRACOTTA), new ItemStack(Items.MUSIC_DISC_RELIC), new ItemStack(Items.DEAD_BUSH), new ItemStack(Items.BEETROOT_SEEDS)),
                VanillaTypes.ITEM_STACK,
                Component.translatable("create_ss_crate.jei.info.sniffer_crate"));
        registration.addIngredientInfo(List.of(
                        new ItemStack(ModBlocks.OCEAN_CRATE.get()), new ItemStack(Items.COAST_ARMOR_TRIM_SMITHING_TEMPLATE), new ItemStack(Items.DUNE_ARMOR_TRIM_SMITHING_TEMPLATE), new ItemStack(Items.WILD_ARMOR_TRIM_SMITHING_TEMPLATE), new ItemStack(Items.TIDE_ARMOR_TRIM_SMITHING_TEMPLATE), new ItemStack(Items.COAL), new ItemStack(Items.EMERALD), new ItemStack(Items.LAPIS_LAZULI), new ItemStack(Items.DIRT), new ItemStack(Items.SAND), new ItemStack(Items.GRAVEL), new ItemStack(Items.TNT), new ItemStack(Items.PRISMARINE), new ItemStack(Items.DARK_PRISMARINE), new ItemStack(Items.MUSIC_DISC_OTHERSIDE), new ItemStack(Items.HEART_OF_THE_SEA), new ItemStack(Items.NAUTILUS_SHELL)),
                VanillaTypes.ITEM_STACK,
                Component.translatable("create_ss_crate.jei.info.ocean_crate"));
        registration.addIngredientInfo(List.of(
                        new ItemStack(ModBlocks.SHERD_CRATE.get()), new ItemStack(Items.SHEAF_POTTERY_SHERD), new ItemStack(Items.SHELTER_POTTERY_SHERD), new ItemStack(Items.SKULL_POTTERY_SHERD), new ItemStack(Items.SNORT_POTTERY_SHERD), new ItemStack(Items.ANGLER_POTTERY_SHERD), new ItemStack(Items.ARCHER_POTTERY_SHERD), new ItemStack(Items.ARMS_UP_POTTERY_SHERD), new ItemStack(Items.BLADE_POTTERY_SHERD), new ItemStack(Items.BREWER_POTTERY_SHERD), new ItemStack(Items.BURN_POTTERY_SHERD), new ItemStack(Items.DANGER_POTTERY_SHERD), new ItemStack(Items.EXPLORER_POTTERY_SHERD), new ItemStack(Items.FRIEND_POTTERY_SHERD), new ItemStack(Items.HEART_POTTERY_SHERD), new ItemStack(Items.HEARTBREAK_POTTERY_SHERD), new ItemStack(Items.HOWL_POTTERY_SHERD), new ItemStack(Items.MINER_POTTERY_SHERD), new ItemStack(Items.MOURNER_POTTERY_SHERD), new ItemStack(Items.PLENTY_POTTERY_SHERD), new ItemStack(Items.PRIZE_POTTERY_SHERD)),
                VanillaTypes.ITEM_STACK,
                Component.translatable("create_ss_crate.jei.info.sherd_crate"));
        registration.addIngredientInfo(List.of(
                        new ItemStack(ModBlocks.STRONGHOLD_CORRIDOR_CRATE.get())),
                VanillaTypes.ITEM_STACK,
                Component.translatable("create_ss_crate.jei.info.stronghold_corridor_crate"));
        registration.addIngredientInfo(List.of(
                        new ItemStack(ModBlocks.STRONGHOLD_FOUNTAIN_CRATE.get())),
                VanillaTypes.ITEM_STACK,
                Component.translatable("create_ss_crate.jei.info.stronghold_fountain_crate"));
        registration.addIngredientInfo(List.of(
                        new ItemStack(ModBlocks.STRONGHOLD_JAIL_CELL_CRATE.get())),
                VanillaTypes.ITEM_STACK,
                Component.translatable("create_ss_crate.jei.info.stronghold_jail_cell_crate"));
        registration.addIngredientInfo(List.of(
                        new ItemStack(ModBlocks.STRONGHOLD_LIBRARY_CRATE.get())),
                VanillaTypes.ITEM_STACK,
                Component.translatable("create_ss_crate.jei.info.stronghold_library_crate"));
        registration.addIngredientInfo(List.of(
                        new ItemStack(ModBlocks.STRONGHOLD_PORTAL_ROOM_CRATE.get())),
                VanillaTypes.ITEM_STACK,
                Component.translatable("create_ss_crate.jei.info.stronghold_portal_room_crate"));
        registration.addIngredientInfo(List.of(
                        new ItemStack(ModBlocks.STRONGHOLD_STAIR_CRATE.get())),
                VanillaTypes.ITEM_STACK,
                Component.translatable("create_ss_crate.jei.info.stronghold_stair_crate"));
        registration.addIngredientInfo(List.of(
                        new ItemStack(ModBlocks.STRONGHOLD_STOREROOM_CRATE.get())),
                VanillaTypes.ITEM_STACK,
                Component.translatable("create_ss_crate.jei.info.stronghold_storeroom_crate"));
        registration.addIngredientInfo(List.of(
                        new ItemStack(ModBlocks.STRONGHOLD_CRATE.get()), new ItemStack(Items.END_PORTAL_FRAME), new ItemStack(Items.COBWEB), new ItemStack(Items.BOOKSHELF), new ItemStack(Items.WRITABLE_BOOK), new ItemStack(Items.ENCHANTED_BOOK), new ItemStack(Items.ENDER_PEARL), new ItemStack(Items.IRON_INGOT), new ItemStack(Items.GOLD_INGOT), new ItemStack(Items.NAME_TAG), new ItemStack(Items.COMPASS), new ItemStack(Items.END_STONE), new ItemStack(Items.STONE_BRICKS), new ItemStack(Items.EYE_ARMOR_TRIM_SMITHING_TEMPLATE), new ItemStack(Items.PAPER)),
                VanillaTypes.ITEM_STACK,
                Component.translatable("create_ss_crate.jei.info.stronghold_crate"));
        registration.addIngredientInfo(List.of(
                        new ItemStack(ModBlocks.END_PORTAL_PLACER_CRATE.get())),
                VanillaTypes.ITEM_STACK,
                Component.translatable("create_ss_crate.jei.info.end_portal_placer_crate"));
        registration.addIngredientInfo(List.of(
                        new ItemStack(ModBlocks.END_PORTAL_BREAKER_CRATE.get())),
                VanillaTypes.ITEM_STACK,
                Component.translatable("create_ss_crate.jei.info.end_portal_breaker_crate"));
    }


    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(Create_SS_Crate.MOD_ID, "jei_plugin");
    }
}
