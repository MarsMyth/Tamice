package net.mars_myth.tamice;

import net.fabricmc.api.ModInitializer;

import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.mars_myth.tamice.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TotallyNotAHorrorMod implements ModInitializer {
	public static final String MOD_ID = "horror-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);



	@Override
	public void onInitialize() {
		LOGGER.info("This is not a horror mod");


		ModBlocks.registerModBlocks();

	}
}