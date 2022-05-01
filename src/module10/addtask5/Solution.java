package module10.addtask5;

import java.io.*;
import java.util.*;

public class Solution {
    public static boolean arePalindromes() throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream("src/module10/addtask5/strings.txt"));
        String string = "";
        while (scanner.hasNextLine()) {
            string = scanner.nextLine().toLowerCase(Locale.ROOT).replaceAll(" ", "");
            for (int i = 0; i < string.length() / 2; i++) {
                if (string.charAt(i) != string.charAt(string.length() - 1 - i)) {
                    return false;
                }
            }
        }
        return true;
    }
}
