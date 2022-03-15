package module3;

public class Squirrel {
    int[] nuts;

    public Squirrel(int[] nuts) {
        this.nuts = nuts;
    }

    public int getNuts(int index) {
        return this.nuts[index];
    }

    public int maxNuts() {
        if (nuts.length > 1) {
            int[] nutsCopy = nuts.clone();
            nutsCopy[1] = Math.max(nutsCopy[0] + nutsCopy[1], nutsCopy[1]);
            nutsCopy[1] = Math.max(nutsCopy[1], 0);
            for (int i = 2; i < nutsCopy.length; ) {
                nutsCopy[i] = Math.max(nutsCopy[i] + nutsCopy[i - 2], nutsCopy[i] + nutsCopy[i - 1]);
                nutsCopy[i] = Math.max(nutsCopy[i], 0);
            }
            return Math.max(nutsCopy[nutsCopy.length - 1], nutsCopy[nutsCopy.length - 2]);
        } else {
            return Math.max(nuts[0], 0);
        }
    }
}
