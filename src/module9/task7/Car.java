package module9.task7;

public class Car extends Transport {
    int maxPassengers;

    public Car(int fuel, int speed, int maxPassengers) {
        super(fuel, speed);
        this.maxPassengers = maxPassengers;
    }

    @Override
    public int getFuelLevel() {
        return this.fuel;
    }

    @Override
    public boolean canMove(int n) {
        if (this.fuel >= n) {
            fuel -= n;
            return true;
        } else {
            return false;
        }
    }

    public int getMaxPassengers() {
        return this.maxPassengers;
    }
}
