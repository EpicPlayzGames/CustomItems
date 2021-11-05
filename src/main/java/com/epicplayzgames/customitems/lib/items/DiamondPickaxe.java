package com.epicplayzgames.customitems.lib.items;

import com.epicplayzgames.customitems.lib.utils.CreateItemUtils;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

public class DiamondPickaxe {

    public ItemStack diamondPickaxe() {

        return CreateItemUtils.createItem(
                Material.DIAMOND_PICKAXE,
                ChatColor.RED + "Epic Pickaxe!",
                ChatColor.GOLD + "Custom Item by EpicPlayzGames",
                Enchantment.DIG_SPEED,
                15,
                true
        );

    }

    public ItemStack silkPickaxe() {
        return CreateItemUtils.createItem(
                Material.DIAMOND_PICKAXE,
                ChatColor.RED + "Epic Silk Pickaxe!",
                ChatColor.GOLD + "Custom Item by EpicPlayzGames",
                Enchantment.DIG_SPEED,
                Enchantment.SILK_TOUCH,
                7,
                true
        );

    }

}
