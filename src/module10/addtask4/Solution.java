package module10.addtask4;

import java.io.*;
import java.util.*;

public class Solution {
    public static void writeOrder() throws IOException {
        Scanner scanner = new Scanner(new FileInputStream("Root/src/numbers.txt"));
        ArrayList<String> numbersInString = new ArrayList<>();
        while (scanner.hasNextLine()) {
            numbersInString.add(scanner.nextLine());
        }

        int counter = 0;
        String number = "";
        for (int i = 0; i < numbersInString.size(); i++) {
            if (i + 1 == Integer.parseInt(numbersInString.get(i))) {
                number = number + (i + 1) + " ";
                counter++;
            }
        }
        FileOutputStream fileOutputStream = new FileOutputStream("Root/src/output.txt");
        fileOutputStream.write(number.trim().getBytes());
        if (counter == 0) {
            fileOutputStream.write("0".getBytes());
        }
        fileOutputStream.close();
    }
}