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

    public void setLock (boolean isLocked){
        this.isLocked = isLocked;
    }

    public String getInfo() {
        return "№ " + number + " " + (this.isLocked ? "заблокирован" : "") + "\nВладелец " + ownerName + "\nКлюч " + key;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
