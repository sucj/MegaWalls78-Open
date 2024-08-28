package icu.suc.megawalls78.game;

import icu.suc.megawalls78.identity.EnergyWay;
import icu.suc.megawalls78.identity.Identity;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.PlayerDeathEvent;

import java.util.UUID;

public interface GamePlayer {

    void enablePassives();

    void disablePassives();

    void stopDurationSkills();

    boolean useSkill(Player player, Action action, Material material);

    void setEnergy(float energy);

    void increaseEnergy(float increase);

    void decreaseEnergy(float decrease);

    void increaseEnergy(EnergyWay way);

    float getEnergy();

    Player getBukkitPlayer();

    UUID getUuid();

    Identity getIdentity();

    void setIdentity(Identity identity);

    int getKills();

    int getDeaths();

    int getAssists();

    int getFinalKills();

    int getFinalDeaths();

    int getFinalAssists();

    void increaseKills(PlayerDeathEvent playerDeathEvent);

    void increaseDeaths();

    void increaseAssists();

    void increaseFinalKills(PlayerDeathEvent playerDeathEvent);

    void increaseFinalDeaths();

    void increaseFinalAssists();
}
