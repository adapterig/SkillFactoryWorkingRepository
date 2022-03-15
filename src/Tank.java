class Tank {

    private int x, y;
    private int dir;
    private int fuel;
    private static int counter = 0;
    private String name;
    private int number;

    public Tank() {
        this(0, 0, 100, "T34");
    }

    public Tank(int x, int y) {
        this(x, y, 100, "T34");
    }
    public Tank(int x, int y, int fuel) {
        this(x, y, fuel, "T34");
    }

    public Tank(int x, int y, int fuel, String name) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;
        this.name = name;
        this.number = ++counter;

    }

    public void goForward(int i) {
        if (i < 0 && -i > -fuel)
            i = -fuel;
        else if (i > fuel)
            i = fuel;
        if (dir == 0) x += i;
        else if (dir == 1) y += i;
        else if (dir == 2) x -= i;
        else y -= i;
        fuel -= Math.abs(i);
    }

    public void printPosition() {
        System.out.println("The Tank " + name + "-" + number + " is at " + x + ", " + y + " now.");
    }

    public void turnLeft() {
        dir--;
        if (dir == -1) dir = 3;
    }

    public void turnRight() {
        dir++;
        if (dir == 4) dir = 0;
    }

    public void goBackward(int i) {
        goForward(-i);
    }
}