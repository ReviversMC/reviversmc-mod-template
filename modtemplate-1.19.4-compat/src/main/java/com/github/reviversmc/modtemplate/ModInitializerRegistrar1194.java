package com.github.reviversmc.modtemplate;

public class ModInitializerRegistrar1194 extends ModInitializerRegistrar {
	@Override
	public void onInitialize() {
		if (isCompatible("1.19.4", "1.19.4")) {
			ModInitializerInvoker.setInitializer(new Mod1194());
		}
	}
}
