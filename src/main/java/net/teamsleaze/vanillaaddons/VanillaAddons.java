package net.teamsleaze.vanillaaddons;

import net.fabricmc.api.ModInitializer;
import net.teamsleaze.vanillaaddons.block.ModBlocks;
import net.teamsleaze.vanillaaddons.item.ModItems;
import net.teamsleaze.vanillaaddons.potion.ModPotions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VanillaAddons implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("vanillaaddons");

	public static final String[] MOD_ID = {"vanillaaddons", "VanillaAddons"};


	@Override
	public void onInitialize() {
		LOGGER.info(VanillaAddons.MOD_ID[1] + " initialized!");

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModPotions.registerModPotions();
	}
}
