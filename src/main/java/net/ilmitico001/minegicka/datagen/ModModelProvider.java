package net.ilmitico001.minegicka.datagen;

import net.ilmitico001.minegicka.Minegicka;
import net.ilmitico001.minegicka.block.ModBlocks;
import net.ilmitico001.minegicka.item.ModItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.core.Holder;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.stream.Stream;

public class ModModelProvider extends ModelProvider {
    public ModModelProvider(PackOutput output) {
        super(output, Minegicka.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {


        itemModels.generateFlatItem(ModItems.RAW_MYTHRIL.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.MYTHRIL_INGOT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.FIERY_COAL.get(), ModelTemplates.FLAT_ITEM);

        itemModels.generateFlatItem(ModItems.WAND.get(), ModelTemplates.FLAT_HANDHELD_ITEM);


        blockModels.createTrivialCube(ModBlocks.MYTHRIL_ORE.get());
        blockModels.createTrivialCube(ModBlocks.RAW_MYTHRIL_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.MYTHRIL_BLOCK.get());

        blockModels.family(ModBlocks.MARBLE.get())
                .slab(ModBlocks.MARBLE_SLAB.get())
                .stairs(ModBlocks.MARBLE_STAIRS.get())
                .wall(ModBlocks.MARBLE_WALL.get())
        ;
        blockModels.family(ModBlocks.POLISHED_MARBLE.get())
                .slab(ModBlocks.POLISHED_MARBLE_SLAB.get())
                .stairs(ModBlocks.POLISHED_MARBLE_STAIRS.get())
                .wall(ModBlocks.POLISHED_MARBLE_WALL.get())
        ;
        blockModels.family(ModBlocks.MARBLE_BRICKS.get())
                .slab(ModBlocks.MARBLE_BRICKS_SLAB.get())
                .stairs(ModBlocks.MARBLE_BRICKS_STAIRS.get())
                .wall(ModBlocks.MARBLE_BRICKS_WALL.get())
        ;
        blockModels.family(ModBlocks.MARBLE_TILES.get())
                .slab(ModBlocks.MARBLE_TILES_SLAB.get())
                .stairs(ModBlocks.MARBLE_TILES_STAIRS.get())
                .wall(ModBlocks.MARBLE_TILES_WALL.get())
        ;

    }


    @Override
    protected Stream<? extends Holder<Block>> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream();
    }

    @Override
    protected Stream<? extends Holder<Item>> getKnownItems() {
        return ModItems.ITEMS.getEntries().stream();
    }
}
