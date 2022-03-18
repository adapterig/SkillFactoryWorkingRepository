package module6;

public class Aeroplane extends Aircraft{
    int wingspan;

    public Aeroplane(int number, int speed, int wingspan) {
        super(number, speed);
        this.wingspan = wingspan;
    }
}
