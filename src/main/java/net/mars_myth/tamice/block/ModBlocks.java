package net.mars_myth.tamice.block;

import net.mars_myth.tamice.TotallyNotAHorrorMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {



    public static final Block INTERDIMENSIONAL_GATEWAY = registerBlock("interdimensional_gateway",
            new Block(AbstractBlock.Settings.copy(Blocks.END_PORTAL_FRAME).hardness(1000).strength(1000f)));



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(TotallyNotAHorrorMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(TotallyNotAHorrorMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        TotallyNotAHorrorMod.LOGGER.info("Registering Mod Blocks for " + TotallyNotAHorrorMod.MOD_ID);
    }
}
