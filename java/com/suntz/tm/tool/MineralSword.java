package com.suntz.tm.tool;

import com.suntz.tm.TmMainClass;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class MineralSword extends ItemSword {

    private String myName = "mineral_sword";
    public static Item.ToolMaterial MINERAL_SWORD_TOOLMATERIAL = EnumHelper.addToolMaterial("MINERALSWORD", 3, 4700, 8.0F, 20.0F, 10);

    public MineralSword() {
        super(MINERAL_SWORD_TOOLMATERIAL);
        //注册物品名
        this.setRegistryName(myName);
        //本地化
        this.setTranslationKey(TmMainClass.MODID + ":" + myName);
        this.setCreativeTab(CreativeTabs.MISC);

    }

}
