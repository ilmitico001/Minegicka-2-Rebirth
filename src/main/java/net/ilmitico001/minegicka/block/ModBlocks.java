package net.ilmitico001.minegicka.block;


import net.ilmitico001.minegicka.Minegicka;
import net.ilmitico001.minegicka.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;


public class ModBlocks {



    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Minegicka.MOD_ID);



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

    public static final DeferredBlock<Block> MARBLE = registerBlock("marble", Block::new, BlockBehaviour.Properties.of().mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.DEEPSLATE));
    public static final DeferredBlock<StairBlock> MARBLE_STAIRS = registerBlock("marble_stairs", properties -> new StairBlock(MARBLE.get().defaultBlockState(), properties), BlockBehaviour.Properties.of().mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.DEEPSLATE));
    public static final DeferredBlock<SlabBlock> MARBLE_SLAB = registerBlock("marble_slab", SlabBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.DEEPSLATE));
    public static final DeferredBlock<WallBlock> MARBLE_WALL = registerBlock("marble_wall", WallBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.DEEPSLATE));


    public static final DeferredBlock<Block> POLISHED_MARBLE = registerBlock("polished_marble", Block::new, BlockBehaviour.Properties.of().mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.POLISHED_DEEPSLATE));
    public static final DeferredBlock<StairBlock> POLISHED_MARBLE_STAIRS = registerBlock("polished_marble_stairs", properties -> new StairBlock(POLISHED_MARBLE.get().defaultBlockState(), properties), BlockBehaviour.Properties.of().mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.POLISHED_DEEPSLATE));
    public static final DeferredBlock<SlabBlock> POLISHED_MARBLE_SLAB = registerBlock("polished_marble_slab", SlabBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.POLISHED_DEEPSLATE));
    public static final DeferredBlock<WallBlock> POLISHED_MARBLE_WALL = registerBlock("polished_marble_wall", WallBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.POLISHED_DEEPSLATE));

    public static final DeferredBlock<Block> MARBLE_BRICKS = registerBlock("marble_bricks", Block::new, BlockBehaviour.Properties.of().mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.DEEPSLATE_BRICKS));
    public static final DeferredBlock<StairBlock> MARBLE_BRICKS_STAIRS = registerBlock("marble_bricks_stairs", properties -> new StairBlock(MARBLE_BRICKS.get().defaultBlockState(), properties), BlockBehaviour.Properties.of().mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.DEEPSLATE_BRICKS));
    public static final DeferredBlock<SlabBlock> MARBLE_BRICKS_SLAB = registerBlock("marble_bricks_slab", SlabBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.DEEPSLATE_BRICKS));
    public static final DeferredBlock<WallBlock> MARBLE_BRICKS_WALL = registerBlock("marble_bricks_wall", WallBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.DEEPSLATE_BRICKS));

    public static final DeferredBlock<Block> MARBLE_TILES = registerBlock("marble_tiles", Block::new, BlockBehaviour.Properties.of().mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.DEEPSLATE_TILES));
    public static final DeferredBlock<StairBlock> MARBLE_TILES_STAIRS = registerBlock("marble_tiles_stairs", properties -> new StairBlock(MARBLE_TILES.get().defaultBlockState(), properties), BlockBehaviour.Properties.of().mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.DEEPSLATE_TILES));
    public static final DeferredBlock<SlabBlock> MARBLE_TILES_SLAB = registerBlock("marble_tiles_slab", SlabBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.DEEPSLATE_TILES));
    public static final DeferredBlock<WallBlock> MARBLE_TILES_WALL = registerBlock("marble_tiles_wall", WallBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.DEEPSLATE_TILES));



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
