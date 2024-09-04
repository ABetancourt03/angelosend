package com.abetancourt03.angelosend.item;

import com.abetancourt03.angelosend.AngelosEnd;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ENDERITE_INGOT = registerItem("enderite_ingot", new Item(new FabricItemSettings()));
    public static final Item RAW_ENDERITE = registerItem("raw_enderite", new Item(new FabricItemSettings()));
    public static final Item ENDERITE_SCRAP = registerItem("enderite_scrap", new Item(new FabricItemSettings()));

    public static final Item ENDERITE_SWORD = registerItem("enderite_sword",
            new SwordItem(ModToolMaterial.ENDERITE, 4, -2.4f, new FabricItemSettings()));
    public static final Item ENDERITE_PICKAXE = registerItem("enderite_pickaxe",
            new PickaxeItem(ModToolMaterial.ENDERITE, 1, -2.8f, new FabricItemSettings()));
    public static final Item ENDERITE_AXE = registerItem("enderite_axe",
            new AxeItem(ModToolMaterial.ENDERITE, 6, -3f, new FabricItemSettings()));
    public static final Item ENDERITE_SHOVEL = registerItem("enderite_shovel",
            new ShovelItem(ModToolMaterial.ENDERITE, 2, -3f, new FabricItemSettings()));
    public static final Item ENDERITE_HOE = registerItem("enderite_hoe",
            new HoeItem(ModToolMaterial.ENDERITE, -4, 0f, new FabricItemSettings()));

    public static final Item ENDERITE_HELMET = registerItem("enderite_helmet",
            new ArmorItem(ModArmorMaterials.ENDERITE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item ENDERITE_CHESTPLATE = registerItem("enderite_chestplate",
            new ArmorItem(ModArmorMaterials.ENDERITE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item ENDERITE_LEGGINGS = registerItem("enderite_leggings",
            new ArmorItem(ModArmorMaterials.ENDERITE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item ENDERITE_BOOTS = registerItem("enderite_boots",
            new ArmorItem(ModArmorMaterials.ENDERITE, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AngelosEnd.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AngelosEnd.LOGGER.info("Registering Mod Items for " + AngelosEnd.MOD_ID);
    }
}
