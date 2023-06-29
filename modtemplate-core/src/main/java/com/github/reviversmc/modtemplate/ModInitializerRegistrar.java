package com.github.reviversmc.modtemplate;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.Version;
import net.fabricmc.loader.api.VersionParsingException;

public abstract class ModInitializerRegistrar implements ModInitializer {
	protected static final String INFINITY = "*";

	protected boolean isCompatible(String inclusiveLowerBounds, String inclusiveUpperBounds) {
		boolean compatible = false;
		Version mcVersion = FabricLoader.getInstance()
				.getModContainer("minecraft")
				.get()
				.getMetadata()
				.getVersion();

		try {
			if (mcVersion.compareTo(Version.parse(inclusiveLowerBounds)) >= 0) {
				if (inclusiveUpperBounds.equals(INFINITY)
						|| mcVersion.compareTo(Version.parse(inclusiveUpperBounds)) <= 0) {
					compatible = true;
				}
			}
		} catch (VersionParsingException e) {
			Mod.LOGGER.error("Unable to parse version(s):");
			e.printStackTrace();
		}

		return compatible;
	}
}
