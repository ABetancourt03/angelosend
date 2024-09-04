package com.abetancourt03.angelosend.datagen;

import com.abetancourt03.angelosend.block.ModBlocks;
import com.abetancourt03.angelosend.item.EnderiteUpgradeSmithingTemplateItem;
import com.abetancourt03.angelosend.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> ENDERITE_SMELTABLES = List.of(
            ModItems.RAW_ENDERITE,
            ModBlocks.ENDERITE_ORE
    );

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, ENDERITE_SMELTABLES, RecipeCategory.MISC, ModItems.ENDERITE_SCRAP,
                1f, 200, "enderite");
        offerBlasting(exporter, ENDERITE_SMELTABLES, RecipeCategory.MISC, ModItems.ENDERITE_SCRAP,
                1f, 100, "enderite");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RAW_ENDERITE, RecipeCategory.MISC,
                ModBlocks.RAW_ENDERITE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.ENDERITE_INGOT, RecipeCategory.MISC,
                ModBlocks.ENDERITE_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ENDERITE_INGOT, 1)
                .pattern("CSP")
                .pattern("SES")
                .pattern("PSC")
                .input('S', ModItems.ENDERITE_SCRAP)
                .input('C', Items.CHORUS_FLOWER)
                .input('P', Items.POPPED_CHORUS_FRUIT)
                .input('E', Blocks.END_STONE)
                .criterion(hasItem(ModItems.ENDERITE_SCRAP), conditionsFromItem(ModItems.ENDERITE_SCRAP))
                .offerTo(exporter, new Identifier("enderite_ingot_from_crafting_table"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, EnderiteUpgradeSmithingTemplateItem.ENDERITE_UPGRADE_SMITHING_TEMPLATE, 2)
                .pattern("#S#")
                .pattern("#E#")
                .pattern("###")
                .input('#', ModItems.ENDERITE_INGOT)
                .input('E', Blocks.END_STONE)
                .input('S', EnderiteUpgradeSmithingTemplateItem.ENDERITE_UPGRADE_SMITHING_TEMPLATE)
                .criterion(hasItem(ModItems.ENDERITE_INGOT), conditionsFromItem(ModItems.ENDERITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(EnderiteUpgradeSmithingTemplateItem.ENDERITE_UPGRADE_SMITHING_TEMPLATE)));
    }
}