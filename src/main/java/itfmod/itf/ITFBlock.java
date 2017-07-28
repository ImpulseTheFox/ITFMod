package itfmod.itf;

import itfmod.ITFMod;
import itfmod.repo.ITFCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public abstract class ITFBlock extends Block implements OrderedItem
{
	public ITFBlock(String name, Material materialIn)
	{
		super(materialIn);
		this.setRegistryName(ITFMod.MODID, name);
		this.setUnlocalizedName(this.getRegistryName().toString());
		this.setCreativeTab(ITFCreativeTabs.CREATIVE_TAB_ITF_MOD);
	}
}
