package itfmod.itf.item;

import itfmod.itf.ITFItemArmor;
import itfmod.repo.ITFCreativeTabs;
import itfmod.repo.ITFMaterials;
import net.minecraft.inventory.EntityEquipmentSlot;

public class ItemFoxyBoots extends ITFItemArmor
{
	public ItemFoxyBoots()
	{
		super("foxy_boots", ITFMaterials.FOXY_MATERIAL_ARMOR, 4, EntityEquipmentSlot.FEET);
		this.setCreativeTab(ITFCreativeTabs.CREATIVE_TAB_ITF_MOD);
	}
	
	@Override
	public int getOrderId()
	{
		return 2003;
	}
}
