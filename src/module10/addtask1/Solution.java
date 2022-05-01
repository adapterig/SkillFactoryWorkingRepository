package module10.addtask1;

import java.io.*;
import java.util.*;

public class Solution {
    public int getCountWords() throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream("Root/src/text.txt"));
        int result = 0;

        while (scanner.hasNextLine()) {
            String[] productInfo = scanner.nextLine().split(" ");
            result += productInfo.length;
        }

        return result;
    }
}