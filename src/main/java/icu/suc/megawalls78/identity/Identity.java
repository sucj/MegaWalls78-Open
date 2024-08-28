package icu.suc.megawalls78.identity;

import icu.suc.megawalls78.game.GamePlayer;
import icu.suc.megawalls78.identity.trait.Gathering;
import icu.suc.megawalls78.identity.trait.passive.Passive;
import icu.suc.megawalls78.identity.trait.skill.Skill;
import icu.suc.megawalls78.identity.trait.skill.Trigger;
import icu.suc.mw78.identity.regular.herobrine.Herobrine;
import icu.suc.mw78.identity.regular.herobrine.gathering.TreasureHunter;
import icu.suc.mw78.identity.regular.herobrine.passive.Flurry;
import icu.suc.mw78.identity.regular.herobrine.passive.Power;
import icu.suc.mw78.identity.regular.herobrine.skill.Wrath;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextColor;
import org.bukkit.Material;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Map;

public enum Identity {
    HEROBRINE("herobrine", NamedTextColor.YELLOW, Material.DIAMOND_SWORD, Herobrine.class, 100, Map.of(EnergyWay.MELEE_PER, 25F, EnergyWay.BOW_PER, 25F), Map.of(Trigger.SWORD, Wrath.class, Trigger.BOW, Wrath.class), List.of(Power.class, Flurry.class), TreasureHunter.class);

    Identity(String id, TextColor color, Material material, Class<? extends Kit> kitClass, float energy, Map<EnergyWay, Float> energyWay, Map<Trigger, Class<? extends Skill>> skillClasses, List<Class<? extends Passive>> passiveClasses, Class<? extends Gathering> gatheringClass) {
    }

    @NotNull
    public String getId() {
        return null;
    }

    @NotNull
    public Component getName() {
        return null;
    }

    @NotNull
    public TextColor getColor() {
        return null;
    }

    @NotNull
    public Component getAbbr() {
        return null;
    }

    @NotNull
    public Component getIcon() {
        return null;
    }

    @NotNull
    public Material getMaterial() {
        return null;
    }

    @NotNull
    public Class<? extends Kit> getKitClass() {
        return null;
    }

    public float getEnergy() {
        return 78;
    }

    @NotNull
    public Map<EnergyWay, Float> getEnergyWay() {
        return null;
    }

    @NotNull
    public Map<Trigger, Class<? extends Skill>> getSkillClasses() {
        return null;
    }

    @NotNull
    public List<Class<? extends Passive>> getPassiveClasses() {
        return null;
    }

    @NotNull
    public Class<? extends Gathering> getGatheringClass() {
        return null;
    }

    @NotNull
    public Kit getKit() {
        return null;
    }

    public float getEnergyByWay(EnergyWay way) {
        return 78;
    }

    @NotNull
    public Map<Trigger, Skill> getSkills(GamePlayer player, List<Passive> passives) {
        return null;
    }

    @NotNull
    public List<Passive> getPassives(GamePlayer player) {
        return null;
    }

    @NotNull
    public Gathering getGathering(GamePlayer player, List<Passive> passives) {
        return null;
    }

    public static Identity getIdentity(String id) {
        for (Identity identity : values()) {
            if (identity.getId().equals(id)) {
                return identity;
            }
        }
        return null;
    }
}
