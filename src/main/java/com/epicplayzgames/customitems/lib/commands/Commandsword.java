package com.epicplayzgames.customitems.lib.commands;

import com.epicplayzgames.customitems.lib.items.DiamondSword;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.PlayerInventory;

public class Commandsword implements CommandExecutor {

    private final DiamondSword diamondSword = new DiamondSword();

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (sender instanceof Player player) {

            if (player.hasPermission("customitems.diamondsword")) {

                if (args.length == 0) {

                    PlayerInventory playerInventory = player.getInventory();
                    playerInventory.addItem(diamondSword.diamondSword());

                }

            } else {

                System.out.println("You are unable to execute that command.");

            }

        }

        return true;
    }
}
