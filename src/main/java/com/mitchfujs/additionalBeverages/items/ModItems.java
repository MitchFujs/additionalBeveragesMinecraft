package com.mitchfujs.additionalBeverages.items;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {
	public static ItemABGlassBottle glassBottle;
	
	public static void init() {
		glassBottle = new ItemABGlassBottle();
	}
	
	@SideOnly(Side.CLIENT)
	public static void initModels() {
		glassBottle.initModel();
	}
}
