package net.ilmitico001.minegicka.block;


import net.ilmitico001.minegicka.Minegicka;
import net.ilmitico001.minegicka.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;


public class ModBlocks {



    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Minegicka.MOD_ID);








   /* public static final DeferredBlock<Block> TORRISIBACIAMI_BLOCK = BLOCKS.register(
            "torrisibaciami_block",
            registryName -> new Block(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .destroyTime(2.0f)
                    .explosionResistance(10.0f)
                    .sound(SoundType.GRAVEL)
                    .lightLevel(state -> 7)

    ));*/
    public static final DeferredBlock<Block> TORRISIBACIAMI_BLOCK = registerBlock(
            "torrisibaciami_block",
            Block::new,
            BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.AMETHYST)


    );

    public static final DeferredBlock<Block> ZIO_PERA_BLOCK = registerBlock(
            "zio_pera_block",
            Block::new,
            BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.STONE)


    );

    public static final DeferredBlock<Block> MYTHRIL_ORE = registerBlock(
            "mythril_ore",
            properties -> new DropExperienceBlock(UniformInt.of(2,4), properties),
            BlockBehaviour.Properties.of()
                    .strength(4.0F, 3.0F)
                    .explosionResistance(10f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)


    );

    public static final DeferredBlock<Block> RAW_MYTHRIL_BLOCK = registerBlock(
            "raw_mythril_block",
            Block::new,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.RAW_IRON)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(5.0F, 6.0F)
    );

    public static final DeferredBlock<Block> MYTHRIL_BLOCK = registerBlock(
            "mythril_block",
            Block::new,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.METAL)
                    .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                    .requiresCorrectToolForDrops()
                    .strength(5.0F, 6.0F)
                    .sound(SoundType.METAL)
    );









    private static <T extends Block> DeferredBlock<T> registerBlock(String name,
                                                                    Function<BlockBehaviour.Properties, ? extends T> blockFactory,
                                                                    BlockBehaviour.Properties blockProperties) {
        DeferredBlock<T> block = BLOCKS.registerBlock(name, blockFactory, blockProperties);
        registerBlockItem(name, block);
        return block;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.registerSimpleBlockItem(name,block);
    }





    public static void register(IEventBus eventBus) {BLOCKS.register(eventBus);}

}
