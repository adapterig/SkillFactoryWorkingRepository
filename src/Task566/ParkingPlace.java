package Task566;

public class ParkingPlace {
    private int number;
    private String ownerName;
    private String key;
    private boolean isLocked;

    public ParkingPlace(int number, String ownerName, String key) {
        this.number = number;
        this.ownerName = ownerName;
        this.key = key;
        this.isLocked = false;
    }

    public int getNumber() {
        return number;
    }

    public void setLock() {
        this.isLocked = true;
        System.out.println("Блокировка для место № " + this.number + " установлена.");
    }
    public void setUnlock() {
        this.isLocked = false;
        System.out.println("Блокировка для место № " + this.number + " снята");
    }

    public String getInfo() {
        return "№ " + number + " " + (this.isLocked ? "заблокирован" : "") + "\nВладелец " + ownerName + "\nКлюч " + key;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setKey(String key) {
        if (!this.isLocked) {
            this.key = key;
            System.out.println("Ключ изменен.");
        } else {
            System.out.println("Замена ключа невозможна, установлена блокировка");
        }
    }




}
