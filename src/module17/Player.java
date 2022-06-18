package module17;


public class Player extends Entity {
    protected Player(String name) {
        super(name);
        this.health = 100;
        this.power = 20;
        this.agility = 5;
        this.experience = 0;
        this.gold = 10;
    }

    @Override
    protected void attack(Entity entity) {
        if (this.agility * (3.0 + (double) this.experience / 5)  > Math.random() * 100) {
            entity.damage(this.power);
            System.out.println(this.name + " нанес урон " + this.power + " монстру " + entity.name + ". Здоровье монстра " + entity.getHealth());
        } else {
            System.out.println(this.name + " промахнулся.");
        }

    }



}
