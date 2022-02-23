package ga.hallzmine.cityblocks.baseBlocks;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Block;

public class HiddenBlockItemBase extends BlockItem {

  public HiddenBlockItemBase(Block block) {
    super(block, new Item.Properties().rarity(Rarity.EPIC));
  }
}
