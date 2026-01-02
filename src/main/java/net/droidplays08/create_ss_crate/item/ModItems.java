package net.droidplays08.create_ss_crate.item;

import net.droidplays08.create_ss_crate.CreateSSCrate;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(CreateSSCrate.MODID);

    public static final DeferredItem<Item> INCOMPLETE_STRONGHOLD_STAIR_CRATE_CHUNK = ITEMS.register("incomplete_stronghold_stair_crate_chunk",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STRONGHOLD_STAIR_CRATE_CHUNK = ITEMS.register("stronghold_stair_crate_chunk",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_STRONGHOLD_CORRIDOR_CRATE_CHUNK = ITEMS.register("incomplete_stronghold_corridor_crate_chunk",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STRONGHOLD_CORRIDOR_CRATE_CHUNK = ITEMS.register("stronghold_corridor_crate_chunk",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_STRONGHOLD_FOUNTAIN_CRATE_CHUNK = ITEMS.register("incomplete_stronghold_fountain_crate_chunk",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STRONGHOLD_FOUNTAIN_CRATE_CHUNK = ITEMS.register("stronghold_fountain_crate_chunk",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_STRONGHOLD_JAIL_CELL_CRATE_CHUNK = ITEMS.register("incomplete_stronghold_jail_cell_crate_chunk",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STRONGHOLD_JAIL_CELL_CRATE_CHUNK = ITEMS.register("stronghold_jail_cell_crate_chunk",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_STRONGHOLD_LIBRARY_CRATE_CHUNK = ITEMS.register("incomplete_stronghold_library_crate_chunk",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STRONGHOLD_LIBRARY_CRATE_CHUNK = ITEMS.register("stronghold_library_crate_chunk",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_STRONGHOLD_PORTAL_ROOM_CRATE_CHUNK = ITEMS.register("incomplete_stronghold_portal_room_crate_chunk",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STRONGHOLD_PORTAL_ROOM_CRATE_CHUNK = ITEMS.register("stronghold_portal_room_crate_chunk",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_STRONGHOLD_STOREROOM_CRATE_CHUNK = ITEMS.register("incomplete_stronghold_storeroom_crate_chunk",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STRONGHOLD_STOREROOM_CRATE_CHUNK = ITEMS.register("stronghold_storeroom_crate_chunk",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
