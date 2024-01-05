package com.novum.christmaschaos.block;

import com.novum.christmaschaos.ChristmasChaos;
import com.novum.christmaschaos.block.custom.ElfFlagBlock;
import com.novum.christmaschaos.block.custom.FudgeBlock;
import com.novum.christmaschaos.block.custom.SantaFlagBlock;
import com.novum.christmaschaos.block.custom.SnowMineBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static Block SNOW_MINE = registerBlock("snow_mine",
            new SnowMineBlock(FabricBlockSettings.copyOf(Blocks.SNOW_BLOCK).sounds(BlockSoundGroup.GRASS)));
    public static Block FUDGE_BLOCK = registerBlock("fudge_block",
            new FudgeBlock(FabricBlockSettings.copyOf(Blocks.MUD).velocityMultiplier(0.3f)));

    public static Block SANTA_FLAG = registerBlock("santa_flag",
            new SantaFlagBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));

    public static Block ELF_FLAG = registerBlock("elf_flag",
            new ElfFlagBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(ChristmasChaos.MOD_ID, name), block);

    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(ChristmasChaos.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        ChristmasChaos.LOGGER.info("Registering Mod Blocks for " + ChristmasChaos.MOD_ID);
    }
}
