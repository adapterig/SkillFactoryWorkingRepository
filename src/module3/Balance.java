package module3;

public class Balance {
    private int rightLoad;
    private int leftLoad;

    public Balance() {
        this.rightLoad = 0;
        this.leftLoad = 0;
    }

    void addRight(int n) {
        this.rightLoad += n;
    }

    void addLeft(int n) {
        this.leftLoad += n;
    }

    char getSituation() {
        if (this.leftLoad < this.rightLoad) {
            return 'R';
        } else if (this.leftLoad > this.rightLoad) {
            return 'L';
        } else {
            return '=';
        }
    }
}