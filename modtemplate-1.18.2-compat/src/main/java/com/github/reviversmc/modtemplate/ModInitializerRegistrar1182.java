package com.github.reviversmc.modtemplate;

public class ModInitializerRegistrar1182 extends ModInitializerRegistrar {
	@Override
	public void onInitialize() {
		if (isCompatible("1.18.2", "1.18.2")) {
			ModInitializerInvoker.setInitializer(new Mod1182());
		}
	}
}
