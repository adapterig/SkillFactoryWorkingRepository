package module6;

public class Pigeon extends Bird {
    int hunger;


    public Pigeon(String[] continents, int population, int hunger) {
        super("pigeon", continents, population);
        this.hunger = hunger;

    }

    public void askForSeeds() {
        if (this.hunger > 6) {
            this.hunger -= 7;
        } else {
            this.hunger = 0;
        }
    }

    public void sleep() {
        this.hunger += 3;
    }

    public int getHunger() {
        return this.hunger;
    }
}
