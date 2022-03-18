package module6;

public class Helicopter extends Aircraft{
    int screwDiameter;
    int power;

    public Helicopter(int number, int speed, int screwDiameter, int power) {
        super(number, speed);
        this.screwDiameter = screwDiameter;
        this.power = power;
    }
}
