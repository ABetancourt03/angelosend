package com.abetancourt03.angelosend.item;

import com.abetancourt03.angelosend.AngelosEnd;
import com.abetancourt03.angelosend.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ENDERITE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(AngelosEnd.MOD_ID, "enderite_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.ENDERITE_INGOT))
                    .displayName(Text.translatable("itemgroup.angelosend.enderite_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.ENDERITE_INGOT);
                        entries.add(ModItems.RAW_ENDERITE);
                        entries.add(ModItems.ENDERITE_SCRAP);
                        entries.add(EnderiteUpgradeSmithingTemplateItem.ENDERITE_UPGRADE_SMITHING_TEMPLATE);
                    }).build());

    public static final ItemGroup ENDERITE_BLOCKS_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(AngelosEnd.MOD_ID, "enderite_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.ENDERITE_BLOCK))
                    .displayName(Text.translatable("itemgroup.angelosend.enderite_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.ENDERITE_BLOCK);
                        entries.add(ModBlocks.RAW_ENDERITE_BLOCK);
                        entries.add(ModBlocks.ENDERITE_ORE);
                    }).build());

    public static final ItemGroup ENDERITE_TOOLS_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(AngelosEnd.MOD_ID, "enderite_tools"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.ENDERITE_PICKAXE))
                    .displayName(Text.translatable("itemgroup.angelosend.enderite_tools"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.ENDERITE_PICKAXE);
                        entries.add(ModItems.ENDERITE_AXE);
                        entries.add(ModItems.ENDERITE_SHOVEL);
                        entries.add(ModItems.ENDERITE_HOE);
                    }).build());

    public static final ItemGroup ENDERITE_EQUIPMENT_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(AngelosEnd.MOD_ID, "enderite_equipment"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.ENDERITE_SWORD))
                    .displayName(Text.translatable("itemgroup.angelosend.enderite_equipment"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.ENDERITE_SWORD);
                        entries.add(ModItems.ENDERITE_HELMET);
                        entries.add(ModItems.ENDERITE_CHESTPLATE);
                        entries.add(ModItems.ENDERITE_LEGGINGS);
                        entries.add(ModItems.ENDERITE_BOOTS);
                    }).build());

    public static void registerItemGroups() {
        AngelosEnd.LOGGER.info("Registering Item Groups for " + AngelosEnd.MOD_ID);
    }
}