package net.ilmitico001.minegicka.datagen;

import net.ilmitico001.minegicka.block.ModBlocks;
import net.ilmitico001.minegicka.item.ModItems;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {

    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        add(ModBlocks.MYTHRIL_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.MYTHRIL_ORE.get(), ModItems.RAW_MYTHRIL.get(),1,4));
        dropSelf(ModBlocks.MYTHRIL_BLOCK.get());
        dropSelf(ModBlocks.RAW_MYTHRIL_BLOCK.get());
        dropSelf(ModBlocks.MARBLE.get());
        dropSelf(ModBlocks.MARBLE_SLAB.get());
        dropSelf(ModBlocks.MARBLE_STAIRS.get());
        dropSelf(ModBlocks.MARBLE_WALL.get());
        dropSelf(ModBlocks.POLISHED_MARBLE.get());
        dropSelf(ModBlocks.POLISHED_MARBLE_SLAB.get());
        dropSelf(ModBlocks.POLISHED_MARBLE_STAIRS.get());
        dropSelf(ModBlocks.POLISHED_MARBLE_WALL.get());
        dropSelf(ModBlocks.MARBLE_BRICKS.get());
        dropSelf(ModBlocks.MARBLE_BRICKS_SLAB.get());
        dropSelf(ModBlocks.MARBLE_BRICKS_STAIRS.get());
        dropSelf(ModBlocks.MARBLE_BRICKS_WALL.get());
        dropSelf(ModBlocks.MARBLE_TILES.get());
        dropSelf(ModBlocks.MARBLE_TILES_SLAB.get());
        dropSelf(ModBlocks.MARBLE_TILES_STAIRS.get());
        dropSelf(ModBlocks.MARBLE_TILES_WALL.get());



    }

    protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock, LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
