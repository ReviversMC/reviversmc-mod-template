package com.github.reviversmc.modtemplate;

public class ModInitializerRegistrar119 extends ModInitializerRegistrar {
	@Override
	public void onInitialize() {
		if (isCompatible("1.19", "1.19.2")) {
			ModInitializerInvoker.setInitializer(new Mod119());
		}
	}
}
