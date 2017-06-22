package com.mitchfujs.additionalBeverages;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;

public class ItemABGlassBottle extends Item {
	
	ItemABGlassBottle() {
		super();
		setUnlocalizedName("glass_bottle");
		setCreativeTab(CreativeTabs.FOOD);
		MinecraftForge.EVENT_BUS.register(this);
	}
}
