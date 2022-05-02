package module10.addtask8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        solution(80);
    }
    public static void solution(double percents) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream("src/module10/addtask8/EGE.txt"));
        ArrayList<String[]> Strings = new ArrayList<>();
        while (scanner.hasNextLine()) {
            Strings.add(scanner.nextLine().split(";"));
        }
        for (int i = 1; i < Strings.size(); i++) {
            if (Double.parseDouble(Strings.get(i)[2]) > percents){
                System.out.println(Strings.get(i)[0]);
            }
        }
    }
}
