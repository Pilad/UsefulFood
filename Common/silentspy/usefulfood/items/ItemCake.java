package silentspy.usefulfood.items;

import java.util.Random;

import silentspy.usefulfood.*;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.*;

public class ItemCake extends ItemReed {

	public ItemCake(int var1, Block var2) 
	{
		super(var1, var2);
		this.setMaxStackSize(1);
		this.setTabToDisplayOn(CreativeTabs.tabFood);
	}
	
	public boolean hasEffect(ItemStack var1)
    {
		if (var1.getItem().shiftedIndex == UsefulFoodContent.magiccakeitem.shiftedIndex) {
	        return true;
	    	} else {
	    	return false;
	    }
    }

    /**
     * Return an item rarity from EnumRarity
     */
    public EnumRarity getRarity(ItemStack var1)
    {
    	if (var1.getItem().shiftedIndex == UsefulFoodContent.magiccakeitem.shiftedIndex) {
        return EnumRarity.epic;
    	} else {
    	return EnumRarity.common;
    	}
    }

	public String getTextureFile()
	{
		return mod_usefulfood.itemtextures;
	}
}
