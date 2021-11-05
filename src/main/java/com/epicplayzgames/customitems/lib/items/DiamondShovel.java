package com.epicplayzgames.customitems.lib.items;

import com.epicplayzgames.customitems.lib.utils.CreateItemUtils;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

public class DiamondShovel {

    public ItemStack diamondShovel() {

        return CreateItemUtils.createItem(
                Material.DIAMOND_SHOVEL,
                ChatColor.RED + "Epic Shovel!",
                ChatColor.GOLD + "Custom Item by EpicPlayzGames",
                Enchantment.DIG_SPEED,
                15,
                true
        );

    }

}
