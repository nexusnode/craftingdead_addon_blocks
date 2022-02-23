package ga.hallzmine.cityblocks.baseBlocks;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;

public class HiddenBlockItemBase extends BlockItem {
    public HiddenBlockItemBase(Block block) {
        super(block, new Item.Properties().rarity(Rarity.EPIC));
    }
}
