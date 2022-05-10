package module11.addTask2;

import java.util.ArrayList;
import java.util.Scanner;

public class IntegerScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> ints = new ArrayList<>();
        while (true) {
            try {
                ints.add(scanner.nextInt());
            } catch (Exception e) {
                break;
            }
        }
        for (int n : ints) {
            System.out.println(n);
        }
    }
}
