package com.epicplayzgames.customitems.lib.utils;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class CreateItemUtils {

    public static ItemStack createItem(
            Material material,
            String displayName,
            String lore,
            Enchantment enchantment,
            int level,
            boolean ignoreLevelRestriction) {

        ItemStack itemStack = new ItemStack(material);

        ItemMeta swordMeta = itemStack.getItemMeta();
        swordMeta.setDisplayName(displayName);
        swordMeta.setUnbreakable(true);
        swordMeta.addEnchant(enchantment, level, ignoreLevelRestriction);

        ArrayList<String> itemLore = new ArrayList<>();
        itemLore.add(lore);
        swordMeta.setLore(itemLore);

        itemStack.setItemMeta(swordMeta);


        return itemStack;
    }

    public static ItemStack createItem(
            Material material,
            String displayName,
            String lore,
            Enchantment enchantment1,
            int level1,
            Enchantment enchantment2,
            int level2,
            boolean ignoreLevelRestriction) {

        ItemStack itemStack = new ItemStack(material);

        ItemMeta swordMeta = itemStack.getItemMeta();
        swordMeta.setDisplayName(displayName);
        swordMeta.setUnbreakable(true);
        swordMeta.addEnchant(enchantment1, level1, ignoreLevelRestriction);
        swordMeta.addEnchant(enchantment2, level2, ignoreLevelRestriction);

        ArrayList<String> itemLore = new ArrayList<>();
        itemLore.add(lore);
        swordMeta.setLore(itemLore);

        itemStack.setItemMeta(swordMeta);


        return itemStack;
    }

}
