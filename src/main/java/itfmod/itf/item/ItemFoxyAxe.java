package itfmod.itf.item;

import itfmod.itf.Enhanceable;
import itfmod.itf.ITFItemAxe;
import itfmod.ref.ITFCreativeTabs;
import itfmod.ref.ITFItems;
import itfmod.ref.ITFMaterials;
import net.minecraft.item.Item;

import static itfmod.ref.Names.NAME_ITEM_FOXY_AXE_ENHANCED;

/**
 * Enhanced version: {@link ItemFoxyAxeEnhanced}
 */
public class ItemFoxyAxe extends ITFItemAxe implements Enhanceable
{
	public ItemFoxyAxe()
	{
		super(NAME_ITEM_FOXY_AXE_ENHANCED, ITFMaterials.FOXY_MATERIAL_ENHANCED, ITFMaterials.FOXY_MATERIAL_ENHANCED.getDamageVsEntity(), 0.0F);
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
