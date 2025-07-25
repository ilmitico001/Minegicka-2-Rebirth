package net.ilmitico001.minegicka.item;

import net.ilmitico001.minegicka.Minegicka;
import net.ilmitico001.minegicka.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Minegicka.MOD_ID);


    public static final Supplier<CreativeModeTab> MINEGICKA_ITEMS_TAB = CREATIVE_MODE_TAB.register("creative_mode_tab_items",() -> CreativeModeTab.builder()
        .title(Component.translatable("creativetab."+Minegicka.MOD_ID+".creative_mode_tab_items"))
        .icon( () -> new ItemStack(ModItems.ZIO_PERA.get() ) )
        .displayItems((itemDisplayParameters, output) -> {
            output.accept(ModItems.TORRISIBACIAMI.get());
            output.accept(ModItems.ZIO_PERA.get());
            output.accept(ModItems.RAW_MYTHRIL.get());
            output.accept(ModItems.MYTHRIL_INGOT.get());
            output.accept(ModItems.FIERY_COAL.get());


            output.accept(ModItems.WAND.get());
        })
        .build()
    );

    public static final Supplier<CreativeModeTab> MINEGICKA_BLOCKS_TAB = CREATIVE_MODE_TAB.register("creative_mode_tab_blocks",() -> CreativeModeTab.builder()
            .title(Component.translatable("creativetab."+Minegicka.MOD_ID+".creative_mode_tab_blocks"))
            .icon( () -> new ItemStack(ModBlocks.ZIO_PERA_BLOCK.get() ) )
            .displayItems((itemDisplayParameters, output) -> {
                output.accept(ModBlocks.TORRISIBACIAMI_BLOCK.get());
                output.accept(ModBlocks.ZIO_PERA_BLOCK.get());
                output.accept(ModBlocks.MYTHRIL_ORE.get());
                output.accept(ModBlocks.RAW_MYTHRIL_BLOCK.get());
                output.accept(ModBlocks.MYTHRIL_BLOCK.get());



            })
            .build()
    );







    public static void register(IEventBus eventBus) { CREATIVE_MODE_TAB.register(eventBus); }
}
