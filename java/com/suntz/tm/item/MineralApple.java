package com.suntz.tm.item;

import com.suntz.tm.TmMainClass;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class MineralApple extends ItemFood {

    private String myName = "mineral_apple";

    public MineralApple() {
        super(10, 1.0f, false);
        this.setRegistryName("mineral_apple");
        this.setTranslationKey(TmMainClass.MODID + ":" + myName);
        this.setAlwaysEdible();
        this.setCreativeTab(CreativeTabs.MISC);
    }

    @Override
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        if (!worldIn.isRemote) {
            player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 400, 1));
            player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 6000, 0));
            player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 6000, 0));
            player.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 2400, 3));
        }
        super.onFoodEaten(stack, worldIn, player);
    }
}
