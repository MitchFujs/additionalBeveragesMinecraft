package com.mitchfujs.additionalBeverages.items;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemABGlassBottle extends Item {
	public ItemABGlassBottle() {
		super();
		setRegistryName("abglass_bottle");
		setUnlocalizedName("abglass_bottle");
		setCreativeTab(CreativeTabs.FOOD);
		//setTextureName("abglass_bottle");
		//MinecraftForge.EVENT_BUS.register(this);
	}
	
	@SideOnly(Side.CLIENT)
	public void initModel() {
		//ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
	}
	
}