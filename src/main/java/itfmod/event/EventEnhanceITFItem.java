package itfmod.event;

import itfmod.ITFMod;
import itfmod.itf.Enhanceable;
import itfmod.itf.block.BlockFoxyAltar;
import itfmod.ref.ITFBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.item.ItemTossEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * The event of enhancing an item
 */
public class EventEnhanceITFItem
{
	@SubscribeEvent
	public void onItemToss(ItemTossEvent e)
	{
		EntityItem ent = e.getEntityItem();
		final int INTERVAL = 1000;
		
		new Thread(() ->
		{
			String name = ent.getName();
			final String PREFIX = "item.item." + ITFMod.MODID + ':';
			if (!name.startsWith(PREFIX)) return; //return if dropped item is not from this mod
			
			while(!ent.isCollidedVertically)
			{
				try
				{
					Thread.sleep(INTERVAL);
				}
				catch(InterruptedException ex)
				{
					break;
				}
			}
			
			//After item has landed
			
			World world = ent.getEntityWorld();
			BlockPos posUnder = new BlockPos(ent.posX, ent.posY - 1, ent.posZ);
			IBlockState blockUnder = world.getBlockState(posUnder);
			if (!(blockUnder.getBlock() instanceof BlockFoxyAltar)) return; //return if dropped item is not on an altar
			
			ItemStack itemStack = ent.getItem();
			Item item = itemStack.getItem();
			if (!(item instanceof Enhanceable)) return; //return if dropped item is not enhanceable
			
			Enhanceable eItem = (Enhanceable) item;
			BlockPos pos = new BlockPos(ent.posX, ent.posY, ent.posZ);
			
			ItemStack newItemStack = new ItemStack(eItem.getEnhancedItem()); //create new ItemStack
			
			//TODO copy previous enchantments and NBT tags
			
			ent.setDead(); //kill old item
			world.spawnEntity(new EntityLightningBolt(world, pos.getX(), pos.getY(), pos.getZ(), true)); //spawn lightning effect
			world.spawnEntity(new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), newItemStack)); //spawn enhanced item
			world.setBlockState(posUnder, ITFBlocks.FOXY_ALTAR_DISABLED.getDefaultState()); //disable altar
			
		}).start();
	}
}
