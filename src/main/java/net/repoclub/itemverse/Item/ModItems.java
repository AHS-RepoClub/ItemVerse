package net.repoclub.itemverse.Item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.repoclub.itemverse.ItemVerse;

public class ModItems {

    public static final Item MEDLEY = registerItem("medley", new Item(new Item.Settings()));

    public static final Item MEAT_HELMET = registerItem("meat_helmet",
            new ArmorItem(ModArmorMaterials.MEDLEY_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(10))));

    public static final Item MEAT_CHESTPLATE = registerItem("meat_chestplate",
            new ArmorItem(ModArmorMaterials.MEDLEY_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(10))));

    public static final Item MEAT_LEGGINGS = registerItem("meat_leggings",
            new ArmorItem(ModArmorMaterials.MEDLEY_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(10))));

    public static final Item MEAT_BOOTS = registerItem("meat_boots",
            new ArmorItem(ModArmorMaterials.MEDLEY_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(10))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ItemVerse.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ItemVerse.LOGGER.info("Registering Mod Items for " + ItemVerse.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(MEDLEY);
        });
    }
}
