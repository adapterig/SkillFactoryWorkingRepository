package unsorted;

public class Stanok {
    private int oil;
    private boolean isOff;

    public Stanok(int oil) {
        this.oil = oil;
        this.isOff = false;
    }

    public Stanok() {
        this(100);
    }

    public void workingCycle() {
        if (oil - 1 < 1) {
            System.out.println("Нужна заправка маслом");
            isOff = true;
        } else {
            System.out.println("Работаем");
            oil--;
        }
    }

    public void oilRefill() {
        this.oil = 100;
    }

}
