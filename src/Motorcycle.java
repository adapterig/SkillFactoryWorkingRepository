public class Motorcycle {
    private int year;
    private String color;
    private String model;
    private int wheels;
    private String motor;

    public Motorcycle(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }
    public Motorcycle(){
        this (1950, "black", "BMW");
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}
