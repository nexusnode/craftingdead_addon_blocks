package ga.hallzmine.cityblocks.data.loot;

import java.util.stream.Collectors;
import org.jetbrains.annotations.NotNull;
import ga.hallzmine.cityblocks.world.BlockRegistryHandler;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public class CityBlocksBlockLoot extends BlockLoot {

  @Override
  protected void addTables() {
    for (RegistryObject<Block> entry : BlockRegistryHandler.BLOCKS.getEntries()) {
      this.dropSelf(entry.get());
    }
  }

  @Override
  @NotNull
  protected Iterable<Block> getKnownBlocks() {
    return BlockRegistryHandler.BLOCKS.getEntries().stream().map(RegistryObject::get)
        .collect(Collectors.toSet());
  }
}
