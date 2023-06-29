package com.github.reviversmc.modtemplate;

public class ModInitializerRegistrar117 extends ModInitializerRegistrar {
	@Override
	public void onInitialize() {
		if (isCompatible("1.17", "1.18.1")) {
			ModInitializerInvoker.setInitializer(new Mod117());
		}
	}
}
