package itfmod.itf;

import itfmod.ITFMod;
import itfmod.itf.creativetab.CreativeTabITFMod;
import itfmod.ref.ITFCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Represents a block
 */
public abstract class ITFBlock extends Block implements OrderedItem
{
	/**
	 * Creates a new block and sets it to the {@link CreativeTabITFMod}
	 *
	 * @param name name of the block
	 * @param materialIn material of the block
	 */
	public ITFBlock(String name, Material materialIn)
	{
		super(materialIn);
		this.setRegistryName(ITFMod.MODID, name);
		this.setUnlocalizedName(this.getRegistryName().toString());
		this.setCreativeTab(ITFCreativeTabs.CREATIVE_TAB_ITF_MOD);
	}
}
