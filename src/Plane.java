public class Plane {
    private int x, y, z;
    private int dir;
    private int fuel;
    private int bombs;
    private static int counter = 0;
    private int number;
/*fdkjbidurgfkkggiuahghairgh*/
    public Plane(int x, int y, int z, int fuel) {
        this.x = x;
        this.y = y;
        this.z = z;
        if (fuel > 0 && fuel < 1000) {
            this.fuel = fuel;
        } else {
            this.fuel = 1000;
        }
        this.number = ++counter;
        this.bombs = 10;

    }

    public void flyStraight(int i) {
        if (i < 0 && -i > -fuel)
            i = -fuel;
        else if (i > fuel)
            i = fuel;
        if (dir == 0) x += i;
        else if (dir == 1) y += i;
        else if (dir == 2) x -= i;
        else y -= i;
        fuel -= Math.abs(i);
        System.out.println("Вы пролетели прямо и сейчас находитесь на координатах: x= " + x + ", y= " + y + ", z= " + z + ". Топлива осталось= " + fuel);
    }

    public void flyUp(int i, int h) {
        if (i < 0 && -i > -fuel)
            i = -fuel;
        else if (i > fuel)
            i = fuel;
        if (dir == 0) x += i;
        else if (dir == 1) y += i;
        else if (dir == 2) x -= i;
        else y -= i;
        fuel -= Math.abs(i);
        z += h;
        System.out.println("Вы изменили высоту и сейчас находитесь на координатах: x= " + x + ", y= " + y + ", z= " + z + ". Топлива осталось= " + fuel);
    }

    public void flyDown(int i, int h) {
        flyUp(i, -h);
    }

    public void turnLeft() {
        dir--;
        if (dir == -1) dir = 3;
        System.out.println("Вы повернули налево");
    }

    public void turnRight() {
        dir++;
        if (dir == 4) dir = 0;
        System.out.println("Вы повернули направо");
    }

    public void dropBombs() {
        bombs -= 3;
        System.out.println("Вы сбросили бомбы, осталось " + bombs + " шт.");
    }

    public void fillFuel(int fuelAdd) {
        if (z == 0) {
            fuel = 1000;
            System.out.println("Вы заправились. Запас топлива состовляет:" + fuel);
        } else {
            System.out.println("Нельзя заправиться в воздухе!");
        }
    }
    public void fillFuel(){
        this.fillFuel(1000);
    }
}

