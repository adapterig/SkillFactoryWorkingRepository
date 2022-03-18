package module6;

public class MusicalInstrument {
    String name;
    String manufacturer;
    int price;

    public MusicalInstrument(String name, String manufacturer, int price) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    String info() {
        return this.name + " " + this.manufacturer + " " + this.price;
    }
}
