// Copyright Mitchell Fujs 2017

package com.mitchfujs.additionalBeverages;

import com.mitchfujs.additionalBeverages.items.ItemABGlassBottle;
import com.mitchfujs.additionalBeverages.items.ModItems;
import com.mitchfujs.additionalBeverages.proxy.CommonProxy;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
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
    	//abglassbottle.setRegistryName(MODID, "abglass_bottle");
    	
    	proxy.preinit(event);
    	GameRegistry.register(ModItems.glassBottle, new ResourceLocation(MODID,"abglass_bottle"));
    }
    
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) { // recipe creation goes here
    	ItemStack amount = new ItemStack(ModItems.glassBottle);
    	amount.setCount(6);
    	RecipeHelper.addShaped(amount, 3, 3, null, Blocks.GLASS, null, Blocks.GLASS, null, Blocks.GLASS, Blocks.GLASS, Blocks.GLASS, Blocks.GLASS);
    	//RecipeHelper.addShaped(Items.GLASS_BOTTLE, 3, 3, new Object[] { " G ", "G G", "GGG", 'G', Blocks.GLASS});
    }
}