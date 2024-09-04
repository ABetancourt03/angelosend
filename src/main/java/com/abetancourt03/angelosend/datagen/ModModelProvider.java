package com.abetancourt03.angelosend.datagen;

import com.abetancourt03.angelosend.block.ModBlocks;
import com.abetancourt03.angelosend.item.EnderiteUpgradeSmithingTemplateItem;
import com.abetancourt03.angelosend.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ENDERITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_ENDERITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ENDERITE_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.ENDERITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_ENDERITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDERITE_SCRAP, Models.GENERATED);
        itemModelGenerator.register(EnderiteUpgradeSmithingTemplateItem.ENDERITE_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDERITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDERITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDERITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDERITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDERITE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDERITE_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDERITE_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDERITE_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDERITE_BOOTS, Models.GENERATED);
    }
}
