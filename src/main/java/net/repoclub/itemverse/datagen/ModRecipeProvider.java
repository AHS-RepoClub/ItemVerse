package net.repoclub.itemverse.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.repoclub.itemverse.Item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MEDLEY, 1)
                .input(Items.BEEF)
                .input(Items.MUTTON)
                .input(Items.RABBIT)
                .input(Items.PORKCHOP)
                .input(Items.CHICKEN)
                .input(ItemTags.FISHES)
                .criterion(hasItem(Items.BEEF), conditionsFromItem(Items.BEEF))
                .offerTo(recipeExporter);

        /*SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.BLOOD_SEED),
                        Ingredient.ofItems(Items.LEATHER_HELMET),
                        Ingredient.ofItems(ModItems.MEDLEY),
                        RecipeCategory.MISC,
                        ModItems.MEAT_HELMET
                )
                .offerTo(recipeExporter, getItemPath(ModItems.MEAT_HELMET) + "_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.BLOOD_SEED),
                        Ingredient.ofItems(Items.LEATHER_CHESTPLATE),
                        Ingredient.ofItems(ModItems.MEDLEY),
                        RecipeCategory.MISC,
                        ModItems.MEAT_CHESTPLATE
                )
                .offerTo(recipeExporter, getItemPath(ModItems.MEAT_CHESTPLATE) + "_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.BLOOD_SEED),
                        Ingredient.ofItems(Items.LEATHER_LEGGINGS),
                        Ingredient.ofItems(ModItems.MEDLEY),
                        RecipeCategory.MISC,
                        ModItems.MEAT_LEGGINGS
                )
                .offerTo(recipeExporter, getItemPath(ModItems.MEAT_LEGGINGS) + "_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.BLOOD_SEED),
                        Ingredient.ofItems(Items.LEATHER_BOOTS),
                        Ingredient.ofItems(ModItems.MEDLEY),
                        RecipeCategory.MISC,
                        ModItems.MEAT_BOOTS
                )
                .offerTo(recipeExporter, getItemPath(ModItems.MEAT_BOOTS) + "_smithing");*/
    }
}
