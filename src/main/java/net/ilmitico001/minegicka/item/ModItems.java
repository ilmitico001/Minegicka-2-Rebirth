package net.ilmitico001.minegicka.item;


import net.ilmitico001.minegicka.Minegicka;
import net.ilmitico001.minegicka.item.custom.FuelItem;
import net.ilmitico001.minegicka.item.custom.WandItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Minegicka.MOD_ID);

    public static final DeferredItem<Item> TORRISIBACIAMI = ITEMS.registerItem("torrisibaciami",Item::new, new Item.Properties());
    public static final DeferredItem<Item> ZIO_PERA = ITEMS.registerItem("zio_pera",Item::new, new Item.Properties());
    public static final DeferredItem<Item> RAW_MYTHRIL = ITEMS.registerItem("raw_mythril",Item::new, new Item.Properties());
    public static final DeferredItem<Item> MYTHRIL_INGOT = ITEMS.registerItem("mythril_ingot",Item::new, new Item.Properties());
    public static final DeferredItem<Item> WAND = ITEMS.registerItem("wand",
            (properties) -> new WandItem(properties,100),
              new Item.Properties());

    public static final DeferredItem<Item> FIERY_COAL = ITEMS.registerItem("fiery_coal",
            (properties) -> new FuelItem(properties,3200),
            new Item.Properties());


    public static void register(IEventBus eventBus) {ITEMS.register(eventBus);}
}
