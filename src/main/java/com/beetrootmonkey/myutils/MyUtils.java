package com.beetrootmonkey.myutils;

import com.beetrootmonkey.myutils.block.ModBlocks;
import com.beetrootmonkey.myutils.client.ModTab;
import com.beetrootmonkey.myutils.item.ModItems;
import com.beetrootmonkey.myutils.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION, acceptedMinecraftVersions = Reference.MC_VERSIONS)
public class MyUtils {

	public static final ModTab creativeTab = new ModTab();
	
	@SidedProxy(serverSide = "com.beetrootmonkey.myutils.proxy.CommonProxy", clientSide = "com.beetrootmonkey.myutils.proxy.ClientProxy")
	public static CommonProxy proxy;

	@Mod.Instance(Reference.MOD_ID)
	public static MyUtils instance;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(Reference.MOD_NAME + " is loading!");
		ModItems.init();
		ModBlocks.init();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {

	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}
