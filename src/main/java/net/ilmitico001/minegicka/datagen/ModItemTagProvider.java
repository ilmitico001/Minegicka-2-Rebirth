package net.ilmitico001.minegicka.datagen;

import net.ilmitico001.minegicka.Minegicka;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ItemTagsProvider;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {

    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, Minegicka.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {




    }
}
