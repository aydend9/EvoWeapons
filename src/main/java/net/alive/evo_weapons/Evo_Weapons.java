package net.alive.evo_weapons;

import net.alive.evo_weapons.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Evo_Weapons implements ModInitializer {
	public static final String MOD_ID = "evo_weapons";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
	}
}