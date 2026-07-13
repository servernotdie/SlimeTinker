package io.github.sefiraat.slimetinker.runnables;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.events.TickEvents;
import io.github.sefiraat.slimetinker.events.friend.EventFriend;
import io.github.sefiraat.slimetinker.events.friend.TraitEventType;
import io.github.sefiraat.slimetinker.modifiers.Modifications;
import io.github.sefiraat.slimetinker.scheduler.SlimeScheduler;
import io.github.sefiraat.slimetinker.utils.ItemUtils;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import javax.annotation.Nonnull;
import java.util.HashMap;
import java.util.Map;

import static io.github.sefiraat.slimetinker.events.friend.EventChannels.checkArmour;
import static io.github.sefiraat.slimetinker.events.friend.EventChannels.checkTool;
import static io.github.sefiraat.slimetinker.events.friend.EventChannels.settlePotionEffects;

public class EffectTick implements Runnable {

    @Override
    public void run() {
        for (Player player : SlimeTinker.getInstance().getServer().getOnlinePlayers()) {
            SlimeScheduler.runAtEntity(player, () -> tickPlayer(player));
        }
    }

    private void tickPlayer(@Nonnull Player player) {
        ItemStack heldItem = player.getInventory().getItemInMainHand();

        Map<PotionEffectType, Integer> potionEffects = new HashMap<>();
        EventFriend friend = new EventFriend(player, TraitEventType.TICK);

        checkTool(friend);
        checkArmour(friend);

        checkModifications(heldItem, potionEffects);

        if (!friend.isCancelEvent()) {
            settlePotionEffects(friend);
        }

        for (Map.Entry<PotionEffectType, Integer> entry : potionEffects.entrySet()) {
            player.addPotionEffect(new PotionEffect(entry.getKey(), SlimeTinker.RUNNABLE_TICK_RATE + 20, entry.getValue(), false, true, true));
        }
        TickEvents.magnetic(friend);
    }

    private void checkModifications(ItemStack heldItem, Map<PotionEffectType, Integer> potionEffects) {
        if (!ItemUtils.isTool(heldItem)) {
            return;
        }

        Map<String, Integer> modLevels = Modifications.getAllModLevels(heldItem);
        for (Map.Entry<String, Integer> entry : modLevels.entrySet()) {
            if (Material.REDSTONE.toString().equals(entry.getKey())) {
                modRedstone(entry.getValue(), potionEffects);
            }
        }

    }

    private void modRedstone(int level, @Nonnull Map<PotionEffectType, Integer> potionEffects) {
        if (potionEffects.containsKey(PotionEffectType.HASTE)) {
            potionEffects.put(PotionEffectType.HASTE, potionEffects.get(PotionEffectType.HASTE) + level);
        } else {
            potionEffects.put(PotionEffectType.HASTE, level);
        }
    }
}
