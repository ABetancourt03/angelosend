package com.abetancourt03.angelosend;

import com.abetancourt03.angelosend.datagen.*;
import com.abetancourt03.angelosend.world.ModConfiguredFeatures;
import com.abetancourt03.angelosend.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class AngelosEndDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModRecipeProvider::new);
		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModBlockLootTableProvider::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModWorldGeneratorProvider::new);
	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ModConfiguredFeatures::boostrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, ModPlacedFeatures::boostrap);
	}
}
