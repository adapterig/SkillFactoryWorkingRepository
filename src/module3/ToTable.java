package module3;

public class ToTable {
    int[] data;
    int x;
    int y;

    public ToTable(int[] data, int x, int y) {
        this.data = data;
        this.x = x;
        this.y = y;
    }

    public int[][] resize() {
        int[][] array = new int[x][y];
        int k = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                array[i][j] = data[k];
                k++;
            }
        }
        return array;
    }
}
