package module10.addtask6;

import java.io.*;
import java.util.*;

public class Solution {
    public static void solution() throws IOException {
        Scanner scanner = new Scanner(new FileInputStream("src/module10/addtask6/data.txt"));
        int diff = Integer.parseInt(scanner.nextLine());
        StringBuilder text = new StringBuilder("");
        ArrayList<String> strings = new ArrayList<>();
        while (scanner.hasNextLine()) {
            strings.add(scanner.nextLine());
        }
        int med = 0;

        for (String s : strings) {
            med += s.length();
        }
        med = med / strings.size();
        text.append(med).append("\n");
        for (String s : strings) {
            if (Math.abs(s.length() - med) <= diff) {
                text.append(s).append("\n");
            }
        }
        text.deleteCharAt(text.length());
        //System.out.println(text);
        FileWriter writer = new FileWriter("src/module10/addtask6/output.txt");
        writer.write(text.toString());
        writer.close();
    }
}






















