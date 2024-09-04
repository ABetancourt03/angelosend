package com.abetancourt03.angelosend.block;

import com.abetancourt03.angelosend.AngelosEnd;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block ENDERITE_BLOCK = registerBlock("enderite_block",
            new Block(AbstractBlock.Settings.create().strength(7f)
                    .requiresTool().sounds(BlockSoundGroup.NETHERITE)));

    public static final Block RAW_ENDERITE_BLOCK = registerBlock("raw_enderite_block",
            new Block(AbstractBlock.Settings.create().strength(6f)
                    .requiresTool()));

    public static final Block ENDERITE_ORE = registerBlock("enderite_ore",
            new ExperienceDroppingBlock(AbstractBlock.Settings.create().strength(6f).requiresTool(),
                    UniformIntProvider.create(2, 5)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(AngelosEnd.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(AngelosEnd.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        AngelosEnd.LOGGER.info("Registering Mod Blocks for " + AngelosEnd.MOD_ID);
    }
}
