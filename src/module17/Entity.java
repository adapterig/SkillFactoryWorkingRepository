package module17;

public abstract class Entity {
    public final String name;
    protected int health; // от 0 до 100
    protected int gold;
    protected int agility; // от 1 до 10
    protected int experience; // от 1 до 10
    protected int power; // от 1 до 10

    protected Entity(String name) {
        this.name = name;
    }

    abstract protected void attack(Entity entity);

    @Override
    public String toString() {
        return " Имя " + name +
                " | здоровье = " + health +
                " | золото = " + gold +
                " | ловкость = " + agility +
                " | опыт = " + experience +
                " | сила = " + power;
    }

    public int getHealth() {
        return health;
    }

    public int getGold() {
        return gold;
    }

    public void addGold(int gold) {
        this.gold += gold;
    }

    public boolean canPay(int gold) {
        return gold <= this.gold;
    }

    public void payGold(int gold) {
        this.gold -= gold;
    }

    public void healing(int healthPoints) {
        this.health += healthPoints;
    }

    public int damage(int damage) {
        if (damage <= this.health) {
            return this.health -= damage;
        } else {
            return this.health = 0;
        }
    }

    public int getExperience() {
        return experience;
    }

    public void addExperience(int experience) {
        if (this.experience + experience <= 10) {
            this.experience += experience;
        } else {
            this.experience = 10;
        }
    }
}
