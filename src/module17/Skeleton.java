package module17;

public class Skeleton extends Entity{
    protected Skeleton(String name) {
        super(name);
        this.health = 30;
        this.power = 15;
        this.agility = 5;
        this.experience = 1;
        this.gold = 10;
    }

    @Override
    protected void attack(Entity entity) {
        if (this.agility * 2 > Math.random() * 100) {
            entity.damage(this.power);
            System.out.println(this.name + " нанес урон " + this.power + " игроку " + entity.name + ". Здоровье игрока " + entity.getHealth());
        } else {
            System.out.println(this.name + " промахнулся.");
        }

    }
}
