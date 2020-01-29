package com.suntz.tm.register;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.Objects;

@Mod.EventBusSubscriber
public class ModelRegister {

    @SubscribeEvent
    public static void registerItemModels(ModelRegistryEvent event) {
        registerItemModel(ItemsRegister.MINERAL_APPLE);
        registerItemModel(ItemsRegister.MINERAL_SWORD);
        registerItemModel(ItemsRegister.MINERAL_SHIELD);
    }

    //注册Item物品模型
    private static void registerItemModel(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Objects.requireNonNull(item.getRegistryName()), "inventory"));
    }
}
