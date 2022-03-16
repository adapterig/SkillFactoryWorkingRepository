package module6;

public class Zombie extends Monster {

    public Zombie(String name) {
        super(name + " the Zombie", 5);
    }

    public void attack() {
        super.attack();
        this.growl();

    }

    public void growl() {
        System.out.print("Raaaauuughhhh");
        super.growl();
    }
}

