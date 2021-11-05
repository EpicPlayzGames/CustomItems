package com.epicplayzgames.customitems.lib.items;

import com.epicplayzgames.customitems.lib.utils.CreateItemUtils;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

public class DiamondSword {

    public ItemStack diamondSword() {
        return CreateItemUtils.createItem(
                Material.DIAMOND_SWORD,
                ChatColor.RED + "Epic Sword!",
                ChatColor.GOLD + "Custom Item by EpicPlayzGames.",
                Enchantment.FIRE_ASPECT,
                Enchantment.KNOCKBACK,
                15,
                true
        );

    }

}
