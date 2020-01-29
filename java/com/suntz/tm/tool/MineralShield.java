package com.suntz.tm.tool;

import com.suntz.tm.TmMainClass;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.ItemShield;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

public class MineralShield extends ItemShield {
    private String myName = "mineral_shield";

    public MineralShield() {

        this.setRegistryName(myName);

        //本地化
        this.setTranslationKey(TmMainClass.MODID + ":" + myName);
        //最大堆叠
        this.setMaxStackSize(1);
        this.setCreativeTab(CreativeTabs.MISC);

        this.addPropertyOverride(new ResourceLocation(""), new IItemPropertyGetter() {
            @SideOnly(Side.CLIENT)
            public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn) {
                return entityIn != null && entityIn.isHandActive() && entityIn.getActiveItemStack() == stack ? 1.0F : 0.0F;
            }
        });
    }

    @Override
    public boolean isShield(ItemStack stack, @Nullable EntityLivingBase entity) {
        return true;
    }
}
