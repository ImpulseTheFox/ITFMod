package itfmod.itf.item;

import itfmod.itf.ITFItemArmor;
import itfmod.repo.ITFCreativeTabs;
import itfmod.repo.ITFMaterials;
import net.minecraft.inventory.EntityEquipmentSlot;

public class ItemFoxyChestplate extends ITFItemArmor
{
	public ItemFoxyChestplate()
	{
		super("foxy_chestplate", ITFMaterials.FOXY_MATERIAL_ARMOR, 4, EntityEquipmentSlot.CHEST);
		this.setCreativeTab(ITFCreativeTabs.CREATIVE_TAB_ITF_MOD);
	}
	
	@Override
	public int getOrderId()
	{
		return 2001;
	}
}
