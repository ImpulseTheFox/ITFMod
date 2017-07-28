package itfmod.itf.item;

import itfmod.itf.ITFItemAxe;
import itfmod.repo.ITFCreativeTabs;
import itfmod.repo.ITFMaterials;
import net.minecraft.item.ItemStack;

import static itfmod.repo.Names.NAME_ITEM_FOXY_AXE;

public class ItemFoxyAxeEnhanced extends ITFItemAxe
{
	public ItemFoxyAxeEnhanced()
	{
		super(NAME_ITEM_FOXY_AXE, ITFMaterials.FOXY_MATERIAL, ITFMaterials.FOXY_MATERIAL.getDamageVsEntity(), -3.0F);
		this.setCreativeTab(ITFCreativeTabs.CREATIVE_TAB_ITF_MOD);
	}
	
	@Override
	public boolean hasEffect(ItemStack stack)
	{
		return true;
	}
	
	@Override
	public int getOrderId()
	{
		return 1003;
	}
}
