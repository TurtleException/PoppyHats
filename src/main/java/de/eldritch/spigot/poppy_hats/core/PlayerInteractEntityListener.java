package de.eldritch.spigot.poppy_hats.core;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class PlayerInteractEntityListener implements Listener {
    @EventHandler
    public void onPlayerInteractEntity(PlayerInteractEntityEvent event) {
        // return if the clicked entity is not a player
        if (!(event.getRightClicked() instanceof Player clickedPlayer)) return;

        // return if the clicked player already has a helmet
        if (clickedPlayer.getInventory().getHelmet() != null) return;

        PlayerInventory inventory = event.getPlayer().getInventory();
        ItemStack       itemStack = inventory.getItem(event.getHand());

        // return if the player did not click with an item
        if (itemStack == null) return;

        // return if the material is not a valid hat
        if (!Hats.isHat(itemStack.getType())) return;


        /* ----- Passed all guards ----- */

        int amount = itemStack.getAmount();

        // set hat
        clickedPlayer.getInventory().setHelmet(new ItemStack(itemStack.getType()));

        // remove one item
        if (amount > 1) {
            itemStack.setAmount(amount - 1);
        } else {
            itemStack = null;
        }

        inventory.setItem(event.getHand(), itemStack);
    }
}
