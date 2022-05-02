package module10.addtask7;

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void dance() throws IOException {

        Scanner scanner = new Scanner(new FileInputStream("src/module10/addtask7/dance.txt"));
        int rhythm = Integer.parseInt(scanner.nextLine());
        StringBuilder text = new StringBuilder("");
        while (scanner.hasNextLine()) {
            int steps = Integer.parseInt(scanner.nextLine());
            text.append(steps / rhythm).append(" ").append(steps % rhythm).append("\n");
        }
        System.out.println(text.deleteCharAt(text.length() - 1));

        FileWriter fileWriter = new FileWriter("src/module10/addtask7/rhythm.txt");
        fileWriter.write(text.toString());
        fileWriter.close();
    }
}
