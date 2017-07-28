package itfmod.itf.item;

import itfmod.itf.ITFItemSword;
import itfmod.ref.ITFMaterials;
import net.minecraft.item.ItemStack;

import static itfmod.ref.Names.NAME_ITEM_FOXY_SWORD_ENHANCED;

/**
 * Enhanced version of {@link ItemFoxySword}
 */
public class ItemFoxySwordEnhanced extends ITFItemSword
{
	public ItemFoxySwordEnhanced()
	{
		super(NAME_ITEM_FOXY_SWORD_ENHANCED, ITFMaterials.FOXY_MATERIAL_ENHANCED);
	}
	
	@Override
	public boolean hasEffect(ItemStack stack)
	{
		return true;
	}
	
	@Override
	public int getOrderId()
	{
		return 1005;
	}
}
