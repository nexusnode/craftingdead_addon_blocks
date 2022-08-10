package ga.hallzmine.cityblocks.data.loot;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.LootTable.Builder;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSet;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

public class CityBlocksLootTableProvider extends LootTableProvider {
  public CityBlocksLootTableProvider(DataGenerator dataGenerator) {
    super(dataGenerator);
  }

  @Override
  protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, Builder>>>, LootContextParamSet>> getTables() {
    ImmutableList.Builder<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootContextParamSet>> builder =
        ImmutableList.builder();
    builder.add(Pair.of(CityBlocksBlockLoot::new, LootContextParamSets.BLOCK));
    return builder.build();
  }

  @Override
  protected void validate(Map<ResourceLocation, LootTable> map,
      ValidationContext validationTracker) {
    //TODO: Validate?
  }
}
