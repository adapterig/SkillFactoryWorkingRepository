package module6;

public class Monster {
    public String name;
    public int health;
    public int damage;

    public Monster(String name, int damage) {
        this.name = name;
        this.damage = damage;
        this.health = 100;
    }

    public Monster() {
        this("Default Monster", 10);
    }

    public void growl(){
        System.out.println("");
    }
    public void attack(){
        System.out.println("");
    }
}
