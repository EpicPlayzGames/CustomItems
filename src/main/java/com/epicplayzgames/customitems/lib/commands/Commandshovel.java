package com.epicplayzgames.customitems.lib.commands;

import com.epicplayzgames.customitems.lib.items.DiamondShovel;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.PlayerInventory;

public class Commandshovel implements CommandExecutor {

    DiamondShovel diamondShovel = new DiamondShovel();

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (sender instanceof Player player) {

            if (player.hasPermission("customitems.diamondshovel")) {

                if (args.length == 0 ) {

                    PlayerInventory playerInventory = player.getInventory();

                    playerInventory.addItem(diamondShovel.diamondShovel());

                }

            } else {

                System.out.println("You are unable to execute that command.");

            }

        }

        return true;
    }
}
