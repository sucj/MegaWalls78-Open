package icu.suc.megawalls78.util;

import com.google.common.collect.Maps;
import icu.suc.megawalls78.identity.Identity;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Map;
import java.util.UUID;

public class PlayerUtil {

    private static final Map<UUID, Location> LAST_DEATH_LOCATIONS = Maps.newHashMap();

    public static boolean isValidAllies(Player origin, Entity entity) {
        return false;
    }

    @NotNull
    public static Identity getIdentity(Player player) {
        return null;
    }

    public static void setStarvation(Player player, float saturationLevel) {
    }

    @NotNull
    public static ItemStack getPlayerMainHand(Player player) {
        return null;
    }

    @Nullable
    public static UUID getKiller(PlayerDeathEvent event) {
        return null;
    }

    public static void increaseFoodLevel(Player player, int level) {
    }

    public static void decreaseFoodLevel(Player player, int level) {
    }

    public static Location getLastDeathLocation(Player player) {
        return LAST_DEATH_LOCATIONS.get(player.getUniqueId());
    }

    public static void setLastDeathLocation(Player player, Location location) {
        LAST_DEATH_LOCATIONS.put(player.getUniqueId(), location);
    }
}
