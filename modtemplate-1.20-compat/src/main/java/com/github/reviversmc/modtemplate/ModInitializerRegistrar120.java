package com.github.reviversmc.modtemplate;

public class ModInitializerRegistrar120 extends ModInitializerRegistrar {
	@Override
	public void onInitialize() {
		if (isCompatible("1.20", INFINITY)) {
			ModInitializerInvoker.setInitializer(new Mod120());
		}
	}
}
