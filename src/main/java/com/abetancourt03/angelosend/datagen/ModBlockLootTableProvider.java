package com.abetancourt03.angelosend.datagen;

import com.abetancourt03.angelosend.block.ModBlocks;
import com.abetancourt03.angelosend.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModBlockLootTableProvider extends FabricBlockLootTableProvider {
    public ModBlockLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.ENDERITE_BLOCK);
        addDrop(ModBlocks.RAW_ENDERITE_BLOCK);

        addDrop(ModBlocks.ENDERITE_ORE, drops(ModBlocks.ENDERITE_ORE, ModItems.RAW_ENDERITE));
    }
}
