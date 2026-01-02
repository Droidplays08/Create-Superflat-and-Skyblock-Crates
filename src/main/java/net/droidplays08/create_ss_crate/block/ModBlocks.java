package net.droidplays08.create_ss_crate.block;

import net.droidplays08.create_ss_crate.Create_SS_Crate;
import net.droidplays08.create_ss_crate.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Create_SS_Crate.MOD_ID);

    public static final RegistryObject<Block> DIRT_CRATE = registerBlock("dirt_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.WOOD)
            ));
    public static final RegistryObject<Block> WOOD_CRATE = registerBlock("wood_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.WOOD)
            ));
    public static final RegistryObject<Block> STARTER_CRATE = registerBlock("starter_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.WOOD)
            ));
    public static final RegistryObject<Block> STONE_CRATE = registerBlock("stone_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.WOOD)
            ));
    public static final RegistryObject<Block> NETHER_CRATE = registerBlock("nether_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.WOOD)
            ));
    public static final RegistryObject<Block> ORE_CRATE = registerBlock("ore_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.WOOD)
            ));
    public static final RegistryObject<Block> BLAZING_NETHER_CRATE = registerBlock("blazing_nether_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.WOOD)
            ));
    public static final RegistryObject<Block> FARMER_CRATE = registerBlock("farmer_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.WOOD)
            ));
    public static final RegistryObject<Block> CREATE_STONE_CRATE = registerBlock("create_stone_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.WOOD)
            ));
    public static final RegistryObject<Block> NETHERITE_CRATE = registerBlock("netherite_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.WOOD)
            ));
    public static final RegistryObject<Block> SCULK_CRATE = registerBlock("sculk_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.WOOD)
            ));
    public static final RegistryObject<Block> SHERD_CRATE = registerBlock("sherd_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.WOOD)
            ));
    public static final RegistryObject<Block> SNIFFER_CRATE = registerBlock("sniffer_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.WOOD)
            ));
    public static final RegistryObject<Block> DEEP_DARK_CRATE = registerBlock("deep_dark_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.WOOD)));

    public static final RegistryObject<Block> OCEAN_CRATE = registerBlock("ocean_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.WOOD)));

    public static final RegistryObject<Block> ANDESITE_CRATE_SHELL = registerBlock("andesite_crate_shell",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.WOOD)));

    public static final RegistryObject<Block> BRASS_CRATE_SHELL = registerBlock("brass_crate_shell",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.WOOD)));

    public static final RegistryObject<Block> INCOMPLETE_BRASS_CRATE_SHELL = registerBlock("incomplete_brass_crate_shell",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.WOOD)));

    public static final RegistryObject<Block> INCOMPLETE_ANDESITE_CRATE_SHELL = registerBlock("incomplete_andesite_crate_shell",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.WOOD)));

    public static final RegistryObject<Block> INCOMPLETE_NETHERITE_CRATE = registerBlock("incomplete_netherite_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.WOOD)));

    public static final RegistryObject<Block> INCOMPLETE_SNIFFER_CRATE = registerBlock("incomplete_sniffer_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.WOOD)));

    public static final RegistryObject<Block> INCOMPLETE_SHERD_CRATE = registerBlock("incomplete_sherd_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.WOOD)));
    public static final RegistryObject<Block> INCOMPLETE_SCULK_CRATE = registerBlock("incomplete_sculk_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.WOOD)));
    public static final RegistryObject<Block> INCOMPLETE_DEEP_DARK_CRATE = registerBlock("incomplete_deep_dark_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.WOOD)));

    public static final RegistryObject<Block> INCOMPLETE_OCEAN_CRATE = registerBlock("incomplete_ocean_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.WOOD)));

    public static final RegistryObject<Block> UNAWAKENED_STRONGHOLD_CRATE_SHELL = registerBlock("unawakened_stronghold_crate_shell",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.WOOD)));

    public static final RegistryObject<Block> INCOMPLETE_UNAWAKENED_STRONGHOLD_CRATE_SHELL = registerBlock("incomplete_unawakened_stronghold_crate_shell",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.WOOD)));

    public static final RegistryObject<Block> AWAKENED_STRONGHOLD_CRATE_SHELL = registerBlock("awakened_stronghold_crate_shell",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.WOOD)));

    public static final RegistryObject<Block> STRONGHOLD_STAIR_CRATE = registerBlock("stronghold_stair_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.WOOD)));

    public static final RegistryObject<Block> STRONGHOLD_CORRIDOR_CRATE = registerBlock("stronghold_corridor_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.WOOD)));

    public static final RegistryObject<Block> STRONGHOLD_FOUNTAIN_CRATE = registerBlock("stronghold_fountain_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.WOOD)));

    public static final RegistryObject<Block> STRONGHOLD_JAIL_CELL_CRATE = registerBlock("stronghold_jail_cell_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.WOOD)));

    public static final RegistryObject<Block> STRONGHOLD_LIBRARY_CRATE = registerBlock("stronghold_library_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.WOOD)));

    public static final RegistryObject<Block> STRONGHOLD_PORTAL_ROOM_CRATE = registerBlock("stronghold_portal_room_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.WOOD)));

    public static final RegistryObject<Block> STRONGHOLD_STOREROOM_CRATE = registerBlock("stronghold_storeroom_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.WOOD)));

    public static final RegistryObject<Block> STRONGHOLD_CRATE = registerBlock("stronghold_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.WOOD)));

    public static final RegistryObject<Block> INCOMPLETE_STRONGHOLD_CRATE = registerBlock("incomplete_stronghold_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.WOOD)));

    public static final RegistryObject<Block> END_PORTAL_PLACER_CRATE = registerBlock("end_portal_placer_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.WOOD)));

    public static final RegistryObject<Block> END_PORTAL_BREAKER_CRATE = registerBlock("end_portal_breaker_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.WOOD)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
