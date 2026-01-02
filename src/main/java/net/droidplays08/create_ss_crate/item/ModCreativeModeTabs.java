package net.droidplays08.create_ss_crate.item;

import net.droidplays08.create_ss_crate.Create_SS_Crate;
import net.droidplays08.create_ss_crate.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Create_SS_Crate.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CREATE_SS_CRATE_TAB = CREATIVE_MODE_TABS.register("create_ss_crate_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.DIRT_CRATE.get()))
                    .title(Component.translatable("creativetab.create_ss_crate_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.DIRT_CRATE.get());
                        output.accept(ModBlocks.WOOD_CRATE.get());
                        output.accept(ModBlocks.STARTER_CRATE.get());
                        output.accept(ModBlocks.STONE_CRATE.get());
                        output.accept(ModBlocks.ORE_CRATE.get());
                        output.accept(ModBlocks.FARMER_CRATE.get());
                        output.accept(ModBlocks.CREATE_STONE_CRATE.get());
                        output.accept(ModBlocks.NETHER_CRATE.get());
                        output.accept(ModBlocks.BLAZING_NETHER_CRATE.get());
                        output.accept(ModBlocks.INCOMPLETE_NETHERITE_CRATE.get());
                        output.accept(ModBlocks.NETHERITE_CRATE.get());
                        output.accept(ModBlocks.INCOMPLETE_SCULK_CRATE.get());
                        output.accept(ModBlocks.SCULK_CRATE.get());
                        output.accept(ModBlocks.INCOMPLETE_DEEP_DARK_CRATE.get());
                        output.accept(ModBlocks.DEEP_DARK_CRATE.get());
                        output.accept(ModBlocks.INCOMPLETE_SNIFFER_CRATE.get());
                        output.accept(ModBlocks.SNIFFER_CRATE.get());
                        output.accept(ModBlocks.INCOMPLETE_OCEAN_CRATE.get());
                        output.accept(ModBlocks.OCEAN_CRATE.get());
                        output.accept(ModBlocks.INCOMPLETE_SHERD_CRATE.get());
                        output.accept(ModBlocks.SHERD_CRATE.get());
                        output.accept(ModBlocks.INCOMPLETE_ANDESITE_CRATE_SHELL.get());
                        output.accept(ModBlocks.ANDESITE_CRATE_SHELL.get());
                        output.accept(ModBlocks.INCOMPLETE_BRASS_CRATE_SHELL.get());
                        output.accept(ModBlocks.BRASS_CRATE_SHELL.get());
                        output.accept(ModBlocks.INCOMPLETE_UNAWAKENED_STRONGHOLD_CRATE_SHELL.get());
                        output.accept(ModBlocks.UNAWAKENED_STRONGHOLD_CRATE_SHELL.get());
                        output.accept(ModBlocks.AWAKENED_STRONGHOLD_CRATE_SHELL.get());
                        output.accept(ModItems.INCOMPLETE_STRONGHOLD_CORRIDOR_CRATE_CHUNK.get());
                        output.accept(ModItems.STRONGHOLD_CORRIDOR_CRATE_CHUNK.get());
                        output.accept(ModBlocks.STRONGHOLD_CORRIDOR_CRATE.get());
                        output.accept(ModItems.INCOMPLETE_STRONGHOLD_FOUNTAIN_CRATE_CHUNK.get());
                        output.accept(ModItems.STRONGHOLD_FOUNTAIN_CRATE_CHUNK.get());
                        output.accept(ModBlocks.STRONGHOLD_FOUNTAIN_CRATE.get());
                        output.accept(ModItems.INCOMPLETE_STRONGHOLD_JAIL_CELL_CRATE_CHUNK.get());
                        output.accept(ModItems.STRONGHOLD_JAIL_CELL_CRATE_CHUNK.get());
                        output.accept(ModBlocks.STRONGHOLD_JAIL_CELL_CRATE.get());
                        output.accept(ModItems.INCOMPLETE_STRONGHOLD_LIBRARY_CRATE_CHUNK.get());
                        output.accept(ModItems.STRONGHOLD_LIBRARY_CRATE_CHUNK.get());
                        output.accept(ModBlocks.STRONGHOLD_LIBRARY_CRATE.get());
                        output.accept(ModItems.INCOMPLETE_STRONGHOLD_PORTAL_ROOM_CRATE_CHUNK.get());
                        output.accept(ModItems.STRONGHOLD_PORTAL_ROOM_CRATE_CHUNK.get());
                        output.accept(ModBlocks.STRONGHOLD_PORTAL_ROOM_CRATE.get());
                        output.accept(ModItems.INCOMPLETE_STRONGHOLD_STAIR_CRATE_CHUNK.get());
                        output.accept(ModItems.STRONGHOLD_STAIR_CRATE_CHUNK.get());
                        output.accept(ModBlocks.STRONGHOLD_STAIR_CRATE.get());
                        output.accept(ModItems.INCOMPLETE_STRONGHOLD_STOREROOM_CRATE_CHUNK.get());
                        output.accept(ModItems.STRONGHOLD_STOREROOM_CRATE_CHUNK.get());
                        output.accept(ModBlocks.STRONGHOLD_STOREROOM_CRATE.get());
                        output.accept(ModBlocks.INCOMPLETE_STRONGHOLD_CRATE.get());
                        output.accept(ModBlocks.STRONGHOLD_CRATE.get());
                        output.accept(ModBlocks.END_PORTAL_PLACER_CRATE.get());
                        output.accept(ModBlocks.END_PORTAL_BREAKER_CRATE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
