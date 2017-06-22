// Copyright Mitchell Fujs 2017

package com.mitchfujs.additionalBeverages;

import com.mitchfujs.additionalBeverages.items.ItemABGlassBottle;
import com.mitchfujs.additionalBeverages.proxy.CommonProxy;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = AdditionalBeverages.MODID, version = AdditionalBeverages.VERSION)
public class AdditionalBeverages
{
    public static final String MODID = "additionalbeverages";
    public static final String MODNAME = "additionalbeverages";
    public static final String VERSION = "0.1";
    
    @SidedProxy(clientSide="com.mitchfujs.additionalBeverages.proxy.ClientProxy", serverSide="com.mitchfujs.additionalBeverages.proxy.ServerProxy")
    public static CommonProxy proxy;
    
    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) { // item creation goes here
    	//glass bottle
    	ItemABGlassBottle abglassbottle = new ItemABGlassBottle();
    	//abglassbottle.setRegistryName(MODID, "abglass_bottle");
    	GameRegistry.register(abglassbottle, new ResourceLocation(MODID,"abglass_bottle"));
    	proxy.preinit(event);
    }
    
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) { // recipe creation goes here
    	RecipeHelper.addShaped(Items.GLASS_BOTTLE, 3, 3, null, Blocks.GLASS, null, Blocks.GLASS, null, Blocks.GLASS, Blocks.GLASS, Blocks.GLASS, Blocks.GLASS);
    	//RecipeHelper.addShaped(Items.GLASS_BOTTLE, 3, 3, new Object[] { " G ", "G G", "GGG", 'G', Blocks.GLASS});
    }
}