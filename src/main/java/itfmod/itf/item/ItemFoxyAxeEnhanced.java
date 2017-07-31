package itfmod.itf.item;

import static itfmod.ref.Names.*;
import itfmod.itf.ITFItemAxe;
import itfmod.ref.ITFCreativeTabs;
import itfmod.ref.ITFMaterials;
import net.minecraft.item.ItemStack;

/**
 * Enhanced version of {@link ItemFoxyAxe}
 */
public class ItemFoxyAxeEnhanced extends ITFItemAxe
{
	public ItemFoxyAxeEnhanced()
	{
		super(NAME_ITEM_FOXY_AXE_ENHANCED, ITFMaterials.FOXY_MATERIAL_ENHANCED, ITFMaterials.FOXY_MATERIAL_ENHANCED.getDamageVsEntity(), -3.0F);
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
