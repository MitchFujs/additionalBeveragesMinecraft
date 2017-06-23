package com.mitchfujs.additionalBeverages.items;

import com.mitchfujs.additionalBeverages.AdditionalBeverages;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {
	public static ItemABGlassBottle glassBottle;
	
	public static void init() {
		glassBottle = new ItemABGlassBottle();
		
		GameRegistry.register(ModItems.glassBottle, new ResourceLocation(AdditionalBeverages.MODID, "glassbottle"));
	}
	
	@SideOnly(Side.CLIENT)
	public static void initModels() {
		glassBottle.initModel();
	}
}
