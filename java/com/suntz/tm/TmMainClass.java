package com.suntz.tm;

import com.suntz.tm.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = TmMainClass.MODID, name = TmMainClass.NAME, version = TmMainClass.VERSION)
public class TmMainClass {
    public static final String MODID = "tm";
    public static final String NAME = "test";
    public static final String VERSION = "1.0";

    @Mod.Instance(TmMainClass.MODID)
    public static TmMainClass instance;

    @SidedProxy(clientSide = "com.suntz.tm.proxy.ClientProxy", serverSide = "com.suntz.tm.proxy.CommonProxy")
    public static CommonProxy proxy;

    public static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
