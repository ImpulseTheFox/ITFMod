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
			
			//After Item has landed
			
			String name = ent.getName();
			final String PREFIX = "item.item." + ITFMod.MODID + ':';
			if (!name.startsWith(PREFIX)) return; //return if dropped item is not from this mod
			
			World world = ent.getEntityWorld();
			BlockPos pos = new BlockPos(ent.posX, ent.posY - 1, ent.posZ);
			IBlockState blockUnder = world.getBlockState(pos);
			if (!(blockUnder.getBlock() instanceof BlockFoxyAltar)) return; //return if dropped item is not on an altar
			
			Item item = ent.getItem().getItem();
			if (item instanceof Enhanceable)
			{
				Enhanceable eItem = (Enhanceable) item;
				
				ent.setDead(); //kill old item
				world.spawnEntity(new EntityLightningBolt(world, pos.getX(), pos.getY(), pos.getZ(), true)); //spawn lightning
				world.spawnEntity(new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(eItem.getEnhancedItem()))); //spawn enhanced item
				world.setBlockState(pos, ITFBlocks.FOXY_ALTAR_DISABLED.getDefaultState()); //disable altar
			}
		}).start();
	}
}
