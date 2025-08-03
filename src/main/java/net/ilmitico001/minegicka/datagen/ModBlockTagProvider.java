package net.ilmitico001.minegicka.datagen;

import net.ilmitico001.minegicka.Minegicka;
import net.ilmitico001.minegicka.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {


    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, Minegicka.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.MYTHRIL_ORE.get())
                .add(ModBlocks.RAW_MYTHRIL_BLOCK.get())
                .add(ModBlocks.MYTHRIL_BLOCK.get())
                .add(ModBlocks.MARBLE.get())
                .add(ModBlocks.MARBLE_SLAB.get())
                .add(ModBlocks.MARBLE_STAIRS.get())
                .add(ModBlocks.MARBLE_WALL.get())
                .add(ModBlocks.POLISHED_MARBLE.get())
                .add(ModBlocks.POLISHED_MARBLE_SLAB.get())
                .add(ModBlocks.POLISHED_MARBLE_STAIRS.get())
                .add(ModBlocks.POLISHED_MARBLE_WALL.get())
                .add(ModBlocks.MARBLE_BRICKS.get())
                .add(ModBlocks.MARBLE_BRICKS_SLAB.get())
                .add(ModBlocks.MARBLE_BRICKS_STAIRS.get())
                .add(ModBlocks.MARBLE_BRICKS_WALL.get())
                .add(ModBlocks.MARBLE_TILES.get())
                .add(ModBlocks.MARBLE_TILES_SLAB.get())
                .add(ModBlocks.MARBLE_TILES_STAIRS.get())
                .add(ModBlocks.MARBLE_TILES_WALL.get())



        ;




        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.MYTHRIL_ORE.get());





        tag(BlockTags.WALLS)
                .add(ModBlocks.MARBLE_WALL.get())
                .add(ModBlocks.POLISHED_MARBLE_WALL.get())
                .add(ModBlocks.MARBLE_BRICKS_WALL.get())
                .add(ModBlocks.MARBLE_TILES_WALL.get())

        ;










    }
}
