package itfmod.itf.item;

import itfmod.itf.ITFItemArmor;
import itfmod.repo.ITFCreativeTabs;
import itfmod.repo.ITFMaterials;
import net.minecraft.inventory.EntityEquipmentSlot;

public class ItemFoxyLeggings extends ITFItemArmor
{
	public ItemFoxyLeggings()
	{
		super("foxy_leggings", ITFMaterials.FOXY_MATERIAL_ARMOR, 4, EntityEquipmentSlot.LEGS);
		this.setCreativeTab(ITFCreativeTabs.CREATIVE_TAB_ITF_MOD);
	}
	
	@Override
	public int getOrderId()
	{
		return 2002;
	}
}
