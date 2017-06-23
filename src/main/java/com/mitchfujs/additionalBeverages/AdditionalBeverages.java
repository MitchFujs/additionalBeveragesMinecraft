// Copyright Mitchell Fujs 2017

package com.mitchfujs.additionalBeverages;

import com.mitchfujs.additionalBeverages.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = AdditionalBeverages.MODID, version = AdditionalBeverages.VERSION)
public class AdditionalBeverages {
	public static final String MODID = "additionalbeverages";
	public static final String MODNAME = "Additional Beverages";
	public static final String VERSION = "0.1";

	@SidedProxy(clientSide = "com.mitchfujs.additionalBeverages.proxy.ClientProxy", serverSide = "com.mitchfujs.additionalBeverages.proxy.ServerProxy")
	public static CommonProxy proxy;

	@Mod.EventHandler
	public void preinit(FMLPreInitializationEvent event) { // item creation goes here
		proxy.preinit(event);
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) { // recipe creation goes here
		
	}
}