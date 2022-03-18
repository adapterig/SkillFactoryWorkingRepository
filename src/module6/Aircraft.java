package module6;

public class Aircraft {
    int number;
    int speed;

    public Aircraft(int number, int speed) {
        this.number = number;
        this.speed = speed;
    }

    double flight(int n) {
        return (double) n / this.speed;
    }
}
