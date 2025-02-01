package dev.thbrbz.exercises;

class Fighter {
    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {
    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    public boolean isVulnerable() {
        return false;
    }

    @Override
    public int getDamagePoints(Fighter fighter) {
        return fighter.isVulnerable() ? 10 : 6;
    }
}

class Wizard extends Fighter {
    boolean isSpellPrepared = false;

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

    public void prepareSpell() {
        this.isSpellPrepared = true;
    }

    @Override
    public boolean isVulnerable() {
        return !this.isSpellPrepared;
    }

    @Override
    public int getDamagePoints(Fighter fighter) {
        return this.isSpellPrepared ? 12 : 3;
    }
}
