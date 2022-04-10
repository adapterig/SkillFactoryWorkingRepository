package module9.task8;

public class Wizard extends Player {
    int manaLevel;
    String element;

    public Wizard(int hp, int level, String type, String weapon, int manaLevel, String element) {
        super(hp, level, type, weapon);
        this.manaLevel = manaLevel;
        this.element = element;
    }

    @Override
    public void levelUp() {
        this.level++;
    }

    @Override
    public String getFullInfo() {
        return this.hp + " " + this.level + " " + this.type + " " + this.weapon + " " + manaLevel + " " + element;
    }

    @Override
    public boolean doDamage() {
        if (manaLevel >= 10) {
            manaLevel -= 10;
            return true;
        } else return false;
    }
}
