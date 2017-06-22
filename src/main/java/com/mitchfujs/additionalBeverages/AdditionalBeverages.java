package com.mitchfujs.additionalBeverages;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = AdditionalBeverages.MODID, version = AdditionalBeverages.VERSION)
public class AdditionalBeverages
{
    public static final String MODID = "additionalbeverages";
    public static final String MODNAME = "additionalbeverages";
    public static final String VERSION = "0.1";
    
    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) { // item creation goes here
    	//glass bottle
    	ItemABGlassBottle abglassbottle = new ItemABGlassBottle();
    	abglassbottle.setRegistryName(MODID, "glass_bottle");
    	GameRegistry.register(abglassbottle);
    }
    
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) { // recipe creation goes here
    	RecipeHelper.addShaped(Items.GLASS_BOTTLE, 3, 3, null, Blocks.GLASS, null, Blocks.GLASS, null, Blocks.GLASS, Blocks.GLASS, Blocks.GLASS, Blocks.GLASS);
    	//RecipeHelper.addShaped(Items.GLASS_BOTTLE, 3, 3, new Object[] { " G ", "G G", "GGG", 'G', Blocks.GLASS});
    }
}