package com.beetrootmonkey.myutils.item;

import com.beetrootmonkey.myutils.MyUtils;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

	public static ItemBase ingotCopper;

	public static void init() {
		ingotCopper = register(new ItemBase("ingotCopper").setCreativeTab((MyUtils.creativeTab)));
	}

	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);

		if (item instanceof ItemModelProvider) {
			((ItemModelProvider) item).registerItemModel(item);
		}

		return item;
	}
}