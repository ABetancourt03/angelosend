package com.abetancourt03.angelosend.item;

import com.abetancourt03.angelosend.AngelosEnd;
import net.minecraft.item.SmithingTemplateItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;

import java.util.List;

public class EnderiteUpgradeSmithingTemplateItem {
    private static final Text ENDERITE_TITLE_TEXT = Text.translatable(AngelosEnd.createTranslationKey("text", "title")).formatted(Formatting.GRAY);
    private static final Text ENDERITE_APPLIES_TO_TEXT = Text.translatable(AngelosEnd.createTranslationKey("text", "applies_to")).formatted(Formatting.BLUE);
    private static final Text ENDERITE_INGREDIENTS_TEXT = Text.translatable(AngelosEnd.createTranslationKey("text", "ingredients")).formatted(Formatting.BLUE);
    private static final Text ENDERITE_BASE_SLOT_DESCRIPTION_TEXT = Text.translatable(AngelosEnd.createTranslationKey("text", "base_slot_description"));
    private static final Text ENDERITE_ADDITIONS_SLOT_DESCRIPTION_TEXT = Text.translatable(AngelosEnd.createTranslationKey("text", "additions_slot_description"));

    private static final Identifier EMPTY_ARMOR_SLOT_HELMET_TEXTURE = new Identifier("item/empty_armor_slot_helmet");
    private static final Identifier EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE = new Identifier("item/empty_armor_slot_chestplate");
    private static final Identifier EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE = new Identifier("item/empty_armor_slot_leggings");
    private static final Identifier EMPTY_ARMOR_SLOT_BOOTS_TEXTURE = new Identifier("item/empty_armor_slot_boots");
    private static final Identifier EMPTY_SLOT_SWORD_TEXTURE = new Identifier("item/empty_slot_sword");
    private static final Identifier EMPTY_SLOT_PICKAXE_TEXTURE = new Identifier("item/empty_slot_pickaxe");
    private static final Identifier EMPTY_SLOT_AXE_TEXTURE = new Identifier("item/empty_slot_axe");
    private static final Identifier EMPTY_SLOT_SHOVEL_TEXTURE = new Identifier("item/empty_slot_shovel");
    private static final Identifier EMPTY_SLOT_HOE_TEXTURE = new Identifier("item/empty_slot_hoe");
    private static final Identifier EMPTY_SLOT_INGOT_TEXTURE = new Identifier("item/empty_slot_ingot");

    public static final SmithingTemplateItem ENDERITE_UPGRADE_SMITHING_TEMPLATE = createTemplate();

    public static void register() {
        Registry.register(Registries.ITEM, AngelosEnd.id("enderite_upgrade_smithing_template"), ENDERITE_UPGRADE_SMITHING_TEMPLATE);
    }

    private static SmithingTemplateItem createTemplate() {
        return new SmithingTemplateItem(
                ENDERITE_APPLIES_TO_TEXT,
                ENDERITE_INGREDIENTS_TEXT,
                ENDERITE_TITLE_TEXT,
                ENDERITE_BASE_SLOT_DESCRIPTION_TEXT,
                ENDERITE_ADDITIONS_SLOT_DESCRIPTION_TEXT,
                getUpgradeEmptyBaseSlotTextures(),
                getUpgradeEmptyAdditionsSlotTextures()
        );
    }

    public static List<Identifier> getUpgradeEmptyBaseSlotTextures() {
        return List.of(
                EMPTY_ARMOR_SLOT_HELMET_TEXTURE,
                EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE,
                EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE,
                EMPTY_ARMOR_SLOT_BOOTS_TEXTURE,
                EMPTY_SLOT_SWORD_TEXTURE,
                EMPTY_SLOT_PICKAXE_TEXTURE,
                EMPTY_SLOT_AXE_TEXTURE,
                EMPTY_SLOT_SHOVEL_TEXTURE,
                EMPTY_SLOT_HOE_TEXTURE
        );
    }

    public static List<Identifier> getUpgradeEmptyAdditionsSlotTextures() {
        return List.of(
                EMPTY_SLOT_INGOT_TEXTURE
        );
    }
}
