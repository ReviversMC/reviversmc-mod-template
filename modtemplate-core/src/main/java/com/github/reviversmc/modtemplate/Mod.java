package com.github.reviversmc.modtemplate;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import net.fabricmc.api.ModInitializer;

public class Mod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger("Mod");
	public static ModConfig config;

	@Override
	public void onInitialize() {
		AutoConfig.register(ModConfig.class, JanksonConfigSerializer::new);
		config = AutoConfig.getConfigHolder(ModConfig.class).getConfig();
	}
}
