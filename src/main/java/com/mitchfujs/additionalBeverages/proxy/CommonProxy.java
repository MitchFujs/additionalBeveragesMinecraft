package com.mitchfujs.additionalBeverages.proxy;

import com.mitchfujs.additionalBeverages.items.ModItems;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	
	public void preinit(FMLPreInitializationEvent event) {
		ModItems.init();
	}
	
	public void init(FMLInitializationEvent event) {
	}
}
