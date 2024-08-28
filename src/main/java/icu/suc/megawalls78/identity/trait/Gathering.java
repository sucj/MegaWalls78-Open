package icu.suc.megawalls78.identity.trait;

import icu.suc.megawalls78.identity.trait.passive.Passive;
import org.jetbrains.annotations.NotNull;

public abstract class Gathering extends Trait {

    private Passive passive;

    @NotNull
    public Class<? extends Passive> getInternal() {
        return null;
    }

    public Passive getPassive() {
        return passive;
    }

    public void setPassive(Passive passive) {
        this.passive = passive;
    }
}
