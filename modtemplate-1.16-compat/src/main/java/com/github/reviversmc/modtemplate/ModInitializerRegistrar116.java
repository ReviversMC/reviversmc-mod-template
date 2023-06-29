package com.github.reviversmc.modtemplate;

public class ModInitializerRegistrar116 extends ModInitializerRegistrar {
	@Override
	public void onInitialize() {
		if (isCompatible("1.16", "1.16.5")) {
			ModInitializerInvoker.setInitializer(new Mod116());
		}
	}
}
