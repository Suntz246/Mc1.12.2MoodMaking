package com.suntz.tm.register;

import com.suntz.tm.item.MineralApple;
import com.suntz.tm.tool.MineralShield;
import com.suntz.tm.tool.MineralSword;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class ItemsRegister {

    //Item
    public static final MineralApple MINERAL_APPLE = new MineralApple();

    //Tool
    public static final MineralSword MINERAL_SWORD = new MineralSword();
    public static final MineralShield MINERAL_SHIELD = new MineralShield();

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                MINERAL_APPLE,
                MINERAL_SWORD,
                MINERAL_SHIELD
        );
    }
}
