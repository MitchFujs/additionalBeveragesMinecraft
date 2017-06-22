package com.mitchfujs.additionalBeverages.proxy;

import com.mitchfujs.additionalBeverages.items.ModItems;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void preinit(FMLPreInitializationEvent event) {
		super.preinit(event);
		ModItems.initModels();
	}
	
	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
	}
}
