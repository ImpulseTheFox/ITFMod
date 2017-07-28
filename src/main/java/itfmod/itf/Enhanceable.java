package itfmod.itf;

import net.minecraft.item.Item;

/**
 * Should be implemented in (item) classes with an existing enhanced version
 */
public interface Enhanceable
{
	/**
	 * Returns the enhanced version of this item.
	 *
	 * @return the enhanced version of this item
	 */
	Item getEnhancedItem();
}
