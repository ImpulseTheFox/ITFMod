package itfmod.itf.item;

import static itfmod.ref.Names.*;
import itfmod.itf.Enhanceable;
import itfmod.itf.ITFItemAxe;
import itfmod.ref.ITFCreativeTabs;
import itfmod.ref.ITFItems;
import itfmod.ref.ITFMaterials;
import net.minecraft.item.Item;

/**
 * Enhanced version: {@link ItemFoxyAxeEnhanced}
 */
public class ItemFoxyAxe extends ITFItemAxe implements Enhanceable
{
	public ItemFoxyAxe()
	{
		super(NAME_ITEM_FOXY_AXE, ITFMaterials.FOXY_MATERIAL, ITFMaterials.FOXY_MATERIAL.getDamageVsEntity(), 0.0F);
		this.setCreativeTab(ITFCreativeTabs.CREATIVE_TAB_ITF_MOD);
	}
	
	@Override
	public int getOrderId()
	{
		return 1002;
	}
	
	@Override
	public Item getEnhancedItem()
	{
		return ITFItems.FOXY_AXE_ENHANCED;
	}
}
