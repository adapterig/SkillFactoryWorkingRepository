package module10.addtask10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static double findSquare() throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream("src/module10/addtask10/points.txt"));
        class coords {
            double x;
            double y;

            public coords(double x, double y) {
                this.x = x;
                this.y = y;
            }
        }

        ArrayList<coords> coordsList = new ArrayList<>();
        double x = 0;
        double y = 0;
        double square = 0;
        String xy;
        while (scanner.hasNextLine()) {
            xy = scanner.nextLine();
            x = Integer.parseInt(xy.split(" ")[0]);
            y = Integer.parseInt(xy.split(" ")[1]);
            coordsList.add(new coords(x, y));
        }
        for (int i = 0; i < coordsList.size() - 1; i++) {
            square += (coordsList.get(i).y + coordsList.get(i + 1).y) / 2 * (coordsList.get(i + 1).x - coordsList.get(i).x);
        }
        return square;
    }
}
