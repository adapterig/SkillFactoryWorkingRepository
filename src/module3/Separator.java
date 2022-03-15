package module3;

public class Separator {
    int[] array;

    public Separator(int[] array) {
        this.array = array;
    }

    public int[] even() {
        int[] arrayEven = new int[this.array.length];
        int i = 0;
        for (int number : array) {
            if (number % 2 == 0) {
                arrayEven[i] = number;
                i++;
            }
        }
        return arrayEven;
    }

    public int[] odd() {
        int[] arrayOdd = new int[this.array.length];
        int i = 0;
        for (int number : array) {
            if (number % 2 != 0) {
                arrayOdd[i] = number;
                i++;
            }
        }
        return arrayOdd;
    }
}
