package com.epicplayzgames.customitems.lib.commands;

import com.epicplayzgames.customitems.lib.items.DiamondPickaxe;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.PlayerInventory;

public class Commandpickaxe implements CommandExecutor {

    DiamondPickaxe diamondPickaxe = new DiamondPickaxe();

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (sender instanceof Player player) {

            if (player.hasPermission("customitems.diamondpickaxe")) {

                if (args.length == 0) {

                    PlayerInventory playerInventory = player.getInventory();
                    playerInventory.addItem(diamondPickaxe.diamondPickaxe());

                } else if (args.length == 1) {

                    if (args[0].equalsIgnoreCase("silk")) {

                        PlayerInventory playerInventory = player.getInventory();
                        playerInventory.addItem(diamondPickaxe.silkPickaxe());

                    } else {

                        player.sendMessage("Incorrect Command Usage. /pickaxe silk");

                    }
                }

            } else {

                System.out.println("You are unable to execute this command.");

            }

        }

        return true;
    }

}
