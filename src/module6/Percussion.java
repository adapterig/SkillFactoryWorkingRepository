package module6;

public class Percussion extends MusicalInstrument {
    int year;

    public Percussion(String name, String manufacturer, int price, int year) {
        super(name, manufacturer, price);
        this.year = year;
    }

    String play() {
        return "Bump";
    }
}
