package net.repoclub.itemverse.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.item.ArmorItem;
import net.repoclub.itemverse.Item.ModItems;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {}

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MEAT_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MEAT_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MEAT_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MEAT_BOOTS));
    }
}
