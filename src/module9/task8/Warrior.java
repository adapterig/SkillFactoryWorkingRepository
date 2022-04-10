package module9.task8;

public class Warrior extends Player {
    String armor;

    public Warrior(int hp, int level, String type, String weapon, String armor) {
        super(hp, level, type, weapon);
        this.armor = armor;
    }

    @Override
    public void levelUp() {
        this.level++;
    }

    @Override
    public String getFullInfo() {
        return this.hp + " " + this.level + " " + this.type + " " + this.weapon + " " + armor;
    }

    @Override
    public boolean doDamage() {
        return true;
    }
}
