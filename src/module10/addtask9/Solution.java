
package module10.addtask9;

import java.io.*;
import java.util.*;

public class Solution {
    public static void solution(String district, int fromYear, int toYear) throws IOException {
        Scanner scanner = new Scanner(new FileInputStream("src/module10/addtask9/crop_volumes.txt"));
        ArrayList<String[]> Strings = new ArrayList<>();
        while (scanner.hasNextLine()) {
            Strings.add(scanner.nextLine().split(";"));
        }
        int indexToYear = Arrays.asList(Strings.get(0)).indexOf(String.valueOf(toYear));
        int indexFromYear = Arrays.asList(Strings.get(0)).indexOf(String.valueOf(fromYear));
        StringBuilder text = new StringBuilder("Part;");
        text.append(fromYear).append(";").append(toYear).append("\n");
        for (int i = 1; i < Strings.size(); i++) {
            for (String s:Strings.get(i)) {
                System.out.print(s);s.trim()
            }

            if (Strings.get(i)[1].equals(district)) {
                System.out.println("district found");
                System.out.println(Double.parseDouble(Strings.get(i)[indexToYear]));
                System.out.println(Double.parseDouble(Strings.get(i)[indexFromYear]));
                System.out.println(Double.parseDouble(Strings.get(i)[indexToYear]) / Double.parseDouble(Strings.get(i)[indexFromYear]));
                if (Double.parseDouble(Strings.get(i)[indexToYear]) / Double.parseDouble(Strings.get(i)[indexFromYear]) > 1.04) {

                    System.out.println("years finded");
                    text.append(Strings.get(i)[0]).append(";").append(Double.parseDouble(Strings.get(i)[indexFromYear])).append(";");
                    text.append(Double.parseDouble(Strings.get(i)[indexToYear])).append("\n");
                }
            }
        }
        text.deleteCharAt(text.length() - 1);
        FileWriter fileWriter = new FileWriter("src/module10/addtask9/data.txt");
        fileWriter.write(text.toString());
        fileWriter.flush();

    }

    public static void main(String[] args) throws IOException {
        solution("Central", 2018, 2020);
    }
}

