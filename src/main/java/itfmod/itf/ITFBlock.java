package itfmod.itf;

import itfmod.ITFMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public abstract class ITFBlock extends Block implements OrderedItem
{
	public ITFBlock(String name, Material materialIn)
	{
		super(materialIn);
		this.setRegistryName(ITFMod.MODID, name);
		this.setUnlocalizedName(this.getRegistryName().toString());
	}
}
