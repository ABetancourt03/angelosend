package com.abetancourt03.angelosend;

import com.abetancourt03.angelosend.block.ModBlocks;
import com.abetancourt03.angelosend.item.EnderiteUpgradeSmithingTemplateItem;
import com.abetancourt03.angelosend.item.ModItemGroups;
import com.abetancourt03.angelosend.item.ModItems;
import com.abetancourt03.angelosend.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AngelosEnd implements ModInitializer {
	public static final String MOD_ID = "angelosend";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
		EnderiteUpgradeSmithingTemplateItem.register();
		ModWorldGeneration.generateModWorldGen();
	}

	public static Identifier id(String path) {
		return new Identifier(MOD_ID, path);
	}

	public static String createTranslationKey(String type, String path) {
		return type + '.' + MOD_ID + '.' + path;
	}
}