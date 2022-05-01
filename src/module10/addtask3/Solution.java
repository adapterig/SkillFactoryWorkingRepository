package module10.addtask3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
    public int getMul() throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream("Root/src/data.txt"));
        int number = Integer.parseInt(scanner.nextLine());
        String[] numbersString = scanner.nextLine().split(" ");
        int[] numbers = new int[numbersString.length];
        for (int i = 0; i < numbersString.length; i++) {
            numbers[i] = Integer.parseInt(numbersString[i]);
        }
        int result = 1;
        for (int i = 1; i <= number; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i % numbers[j] == 0) {
                    result *= i;
                    break;
                }
            }
        }
        return result;
    }
}