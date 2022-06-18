package module17;

public class Goblin extends Entity {
    protected Goblin(String name) {
        super(name);
        this.health = 50;
        this.power = 10;
        this.agility = 4;
        this.experience = 1;
        this.gold = 10;
    }

    @Override
    protected void attack(Entity entity) {
        if (this.agility * 3 > Math.random() * 120) {
            entity.damage(this.power);
            System.out.println(this.name + " нанес урон " + this.power + " игроку " + entity.name + ". Здоровье игрока " + entity.getHealth());
        } else {
            System.out.println(this.name + " промахнулся.");
        }

    }
}

