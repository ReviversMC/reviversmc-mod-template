package com.github.reviversmc.modtemplate;

public class ModInitializerRegistrar1193 extends ModInitializerRegistrar {
	@Override
	public void onInitialize() {
		if (isCompatible("1.19.3", "1.19.3")) {
			ModInitializerInvoker.setInitializer(new Mod1193());
		}
	}
}
