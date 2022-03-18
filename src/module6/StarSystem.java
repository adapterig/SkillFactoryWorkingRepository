package module6;

public class StarSystem {
    private String starName;
    private int quantityOfPlanets;
    private long age;

    public StarSystem(String starName, int quantityOfPlanets, long age) {
        this.starName = starName;
        this.quantityOfPlanets = quantityOfPlanets;
        this.age = age;
    }

    public String getStarName() {
        return starName;
    }

    public void setStarName(String starName) {
        this.starName = starName;
    }

    public int getQuantityOfPlanets() {
        return quantityOfPlanets;
    }

    public void setQuantityOfPlanets(int quantityOfPlanets) {
        this.quantityOfPlanets = quantityOfPlanets;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public String getInfo(String name, int quantityOfPlanets, long age) {
        return name + " " + quantityOfPlanets + " " + age;
    }
}
