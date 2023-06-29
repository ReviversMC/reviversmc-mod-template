package com.github.reviversmc.modtemplate;

import net.fabricmc.api.ModInitializer;

public class ModInitializerInvoker implements ModInitializer {
	private static ModInitializer initializer;
	private static boolean waitingForInitializerToBeSet;

	public static void setInitializer(ModInitializer in) {
		initializer = in;

		if (waitingForInitializerToBeSet) {
			waitingForInitializerToBeSet = false;
			initializer.onInitialize();
		}
	}

	@Override
	public void onInitialize() {
		if (initializer == null) {
			waitingForInitializerToBeSet = true;
		} else {
			initializer.onInitialize();
		}
	}
}
