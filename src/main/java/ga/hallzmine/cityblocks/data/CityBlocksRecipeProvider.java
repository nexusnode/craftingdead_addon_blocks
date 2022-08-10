package ga.hallzmine.cityblocks.data;

import java.util.Objects;
import java.util.function.Consumer;
import org.jetbrains.annotations.NotNull;
import ga.hallzmine.cityblocks.world.ItemRegistryHandler;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.data.recipes.SingleItemRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.Tags;

public class CityBlocksRecipeProvider extends RecipeProvider {

  public CityBlocksRecipeProvider(DataGenerator dataGenerator) {
    super(dataGenerator);
  }

  @Override
  protected void buildCraftingRecipes(@NotNull Consumer<FinishedRecipe> consumer) {
    ShapedRecipeBuilder.shaped(ItemRegistryHandler.CONCRETE_BARRIER_ITEM.get(), 5).pattern(" # ")
        .pattern(" # ").pattern("###").define('#', Items.GRAY_CONCRETE)
        .unlockedBy("has_item", has(Items.GRAY_CONCRETE)).save(consumer);
    ShapedRecipeBuilder.shaped(ItemRegistryHandler.ROAD_BARRIER_ITEM.get(), 3).pattern(" # ")
        .pattern("i i").define('#', Items.RED_WOOL).define('i', Items.IRON_INGOT)
        .unlockedBy("has_item", has(Items.IRON_INGOT)).save(consumer);
    ShapedRecipeBuilder.shaped(ItemRegistryHandler.ROAD_BLANK_SLAB_ITEM.get(), 6).pattern("###")
        .define('#', ItemRegistryHandler.ROAD_BLANK_ITEM.get())
        .unlockedBy("has_item", has(ItemRegistryHandler.ROAD_BLANK_ITEM.get())).save(consumer);
    ShapedRecipeBuilder.shaped(ItemRegistryHandler.ROAD_BROKEN_ITEM.get(), 8).pattern("###")
        .pattern("#i#").pattern("###").define('#', ItemRegistryHandler.ROAD_BLANK_ITEM.get())
        .define('i', Tags.Items.DYES_WHITE)
        .unlockedBy("has_item", has(ItemRegistryHandler.ROAD_BLANK_ITEM.get())).save(consumer);
    ShapedRecipeBuilder.shaped(ItemRegistryHandler.ROAD_BROKEN_SLAB_ITEM.get(), 6).pattern("###")
        .define('#', ItemRegistryHandler.ROAD_BROKEN_ITEM.get())
        .unlockedBy("has_item", has(ItemRegistryHandler.ROAD_BLANK_ITEM.get())).save(consumer);
    ShapedRecipeBuilder.shaped(ItemRegistryHandler.ROAD_SOLID_ITEM.get(), 7).pattern("###")
        .pattern("i#i").pattern("###").define('#', ItemRegistryHandler.ROAD_BLANK_ITEM.get())
        .define('i', Tags.Items.DYES_WHITE)
        .unlockedBy("has_item", has(ItemRegistryHandler.ROAD_BLANK_ITEM.get())).save(consumer);
    ShapedRecipeBuilder.shaped(ItemRegistryHandler.ROAD_SOLID_SLAB_ITEM.get(), 6).pattern("###")
        .define('#', ItemRegistryHandler.ROAD_SOLID_ITEM.get())
        .unlockedBy("has_item", has(ItemRegistryHandler.ROAD_BLANK_ITEM.get())).save(consumer);
    ShapedRecipeBuilder.shaped(ItemRegistryHandler.SANDBAG_ITEM.get(), 5).pattern("#i#")
        .pattern(" # ").define('#', Items.STRING).define('i', Items.SAND)
        .unlockedBy("has_item", has(Items.SAND)).save(consumer);
    ShapedRecipeBuilder.shaped(ItemRegistryHandler.SANDBAG_SLAB_ITEM.get(), 6).pattern("###")
        .define('#', ItemRegistryHandler.SANDBAG_ITEM.get())
        .unlockedBy("has_item", has(ItemRegistryHandler.SANDBAG_ITEM.get())).save(consumer);
    ShapedRecipeBuilder.shaped(ItemRegistryHandler.STEEL_POLE_BARRIER_ITEM.get(), 3).pattern("#i#")
        .pattern("# #").define('#', Items.IRON_INGOT).define('i', Items.IRON_BARS)
        .unlockedBy("has_item", has(Items.IRON_INGOT)).save(consumer);
    ShapedRecipeBuilder.shaped(ItemRegistryHandler.STOP_SIGN_ITEM.get()).pattern("#").pattern("i")
        .pattern("i").define('#', Items.RED_CONCRETE).define('i', Items.IRON_BARS)
        .unlockedBy("has_item", has(Items.IRON_BARS)).save(consumer);

    ShapelessRecipeBuilder.shapeless(ItemRegistryHandler.CONCRETE_BARRIER_SLAB_ITEM.get())
        .requires(ItemRegistryHandler.CONCRETE_BARRIER_ITEM.get())
        .requires(ItemRegistryHandler.ROAD_BLANK_SLAB_ITEM.get())
        .unlockedBy("has_item", has(ItemRegistryHandler.CONCRETE_BARRIER_ITEM.get()))
        .save(consumer);
    ShapelessRecipeBuilder.shapeless(ItemRegistryHandler.POLE_BARRIER_ITEM.get())
        .requires(ItemRegistryHandler.POLE_BARRIER_UNLIT_ITEM.get()).requires(Items.REDSTONE_TORCH)
        .unlockedBy("has_item", has(ItemRegistryHandler.POLE_BARRIER_UNLIT_ITEM.get()))
        .save(consumer);
    ShapelessRecipeBuilder.shapeless(ItemRegistryHandler.POLE_BARRIER_UNLIT_ITEM.get())
        .requires(ItemRegistryHandler.STEEL_POLE_BARRIER_ITEM.get()).requires(Items.RED_WOOL)
        .unlockedBy("has_item", has(ItemRegistryHandler.STEEL_POLE_BARRIER_ITEM.get()))
        .save(consumer);
    ShapelessRecipeBuilder.shapeless(ItemRegistryHandler.ROAD_BLANK_ITEM.get(), 4)
        .requires(Items.GRAY_CONCRETE).requires(Items.GRAY_CONCRETE)
        .unlockedBy("has_item", has(Items.GRAY_CONCRETE)).save(consumer);
    ShapelessRecipeBuilder.shapeless(ItemRegistryHandler.STEEL_POLE_BARRIER_SLAB_ITEM.get())
        .requires(ItemRegistryHandler.STEEL_POLE_BARRIER_ITEM.get())
        .requires(ItemRegistryHandler.ROAD_BLANK_SLAB_ITEM.get())
        .unlockedBy("has_item", has(ItemRegistryHandler.ROAD_BLANK_ITEM.get())).save(consumer);
    ShapelessRecipeBuilder.shapeless(ItemRegistryHandler.STRIPED_CONCRETE_BARRIER_ITEM.get())
        .requires(ItemRegistryHandler.CONCRETE_BARRIER_ITEM.get()).requires(Items.RED_WOOL)
        .unlockedBy("has_item", has(ItemRegistryHandler.ROAD_BLANK_ITEM.get())).save(consumer);
    ShapelessRecipeBuilder.shapeless(ItemRegistryHandler.STRIPED_CONCRETE_BARRIER_SLAB_ITEM.get())
        .requires(ItemRegistryHandler.STRIPED_CONCRETE_BARRIER_ITEM.get())
        .requires(ItemRegistryHandler.ROAD_BLANK_SLAB_ITEM.get())
        .unlockedBy("has_item", has(ItemRegistryHandler.ROAD_BLANK_ITEM.get())).save(consumer);

    SingleItemRecipeBuilder
        .stonecutting(Ingredient.of(ItemRegistryHandler.ROAD_BLANK_ITEM.get()),
            ItemRegistryHandler.ROAD_BLANK_SLAB_ITEM.get(), 2)
        .unlockedBy("has_item", has(ItemRegistryHandler.ROAD_BLANK_ITEM.get())).save(consumer,
            shapeSuffix(ItemRegistryHandler.ROAD_BLANK_SLAB_ITEM.get(), "stonecutting"));
    SingleItemRecipeBuilder
        .stonecutting(Ingredient.of(ItemRegistryHandler.ROAD_BROKEN_ITEM.get()),
            ItemRegistryHandler.ROAD_BROKEN_SLAB_ITEM.get(), 2)
        .unlockedBy("has_item", has(ItemRegistryHandler.ROAD_BLANK_ITEM.get())).save(consumer,
            shapeSuffix(ItemRegistryHandler.ROAD_BROKEN_SLAB_ITEM.get(), "stonecutting"));
    SingleItemRecipeBuilder
        .stonecutting(Ingredient.of(ItemRegistryHandler.ROAD_SOLID_ITEM.get()),
            ItemRegistryHandler.ROAD_SOLID_SLAB_ITEM.get(), 2)
        .unlockedBy("has_item", has(ItemRegistryHandler.ROAD_BLANK_ITEM.get())).save(consumer,
            shapeSuffix(ItemRegistryHandler.ROAD_SOLID_SLAB_ITEM.get(), "stonecutting"));
  }

  private String shapeSuffix(ItemLike path, String suffix) {
    return Objects.requireNonNull(path.asItem().getRegistryName()).toString() + '_' + suffix;
  }
}
