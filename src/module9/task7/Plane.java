package module9.task7;

public class Plane extends Transport {

    public Plane(int fuel, int speed) {
        super(fuel, speed);
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

    public void fillFuel(int n) {
        this.fuel += n;
    }
}
