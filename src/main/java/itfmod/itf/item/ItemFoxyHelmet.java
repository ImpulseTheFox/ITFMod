package itfmod.itf.item;

import itfmod.itf.ITFItemArmor;
import itfmod.repo.ITFCreativeTabs;
import itfmod.repo.ITFMaterials;
import net.minecraft.inventory.EntityEquipmentSlot;

public class ItemFoxyHelmet extends ITFItemArmor
{
	public ItemFoxyHelmet()
	{
		super("foxy_helmet", ITFMaterials.FOXY_MATERIAL_ARMOR, 4, EntityEquipmentSlot.HEAD);
		this.setCreativeTab(ITFCreativeTabs.CREATIVE_TAB_ITF_MOD);
	}
	
	@Override
	public int getOrderId()
	{
		return 2000;
	}
}
