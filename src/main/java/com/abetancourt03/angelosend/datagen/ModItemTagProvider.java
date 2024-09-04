package com.abetancourt03.angelosend.datagen;

import com.abetancourt03.angelosend.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.SWORDS).add(ModItems.ENDERITE_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES).add(ModItems.ENDERITE_PICKAXE);
        getOrCreateTagBuilder(ItemTags.AXES).add(ModItems.ENDERITE_AXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS).add(ModItems.ENDERITE_SHOVEL);
        getOrCreateTagBuilder(ItemTags.HOES).add(ModItems.ENDERITE_HOE);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(
                        ModItems.ENDERITE_HELMET,
                        ModItems.ENDERITE_CHESTPLATE,
                        ModItems.ENDERITE_LEGGINGS,
                        ModItems.ENDERITE_BOOTS
                );
    }
}
