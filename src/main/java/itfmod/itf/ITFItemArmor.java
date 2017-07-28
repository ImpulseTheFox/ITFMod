package itfmod.itf;

import itfmod.ITFMod;
import itfmod.itf.creativetab.CreativeTabITFMod;
import itfmod.ref.ITFCreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

/**
 * Represents a part of armor
 */
public abstract class ITFItemArmor extends ItemArmor implements OrderedItem
{
	/**
	 * Creates a new part of armor and sets it to the {@link CreativeTabITFMod}
	 *
	 * @param name name of the part of armor
	 * @param materialIn material of the part of armor
	 * @param renderIndexIn renderIndex of the part of armor
	 * @param equipmentSlotIn equipmentSlot of the part of armor
	 */
	public ITFItemArmor(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn)
	{
		super(materialIn, renderIndexIn, equipmentSlotIn);
		this.setRegistryName(ITFMod.MODID, name);
		this.setUnlocalizedName(this.getRegistryName().toString());
		this.setCreativeTab(ITFCreativeTabs.CREATIVE_TAB_ITF_MOD);
	}
}
