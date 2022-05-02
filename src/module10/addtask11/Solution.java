package module10.addtask11;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        solve();
    }

    public static void solve() throws IOException {
        Scanner scanner = new Scanner(new FileInputStream("src/module10/addtask11/arithmetics.txt"));
        String string;
        class Expression {
            int x;
            int y;
            char action;

            public Expression(int x, int y, char action) {
                this.x = x;
                this.y = y;
                this.action = action;
            }

            String result() {
                String result = x + " " + action + " " + y + " = ";
                switch (this.action) {
                    case '*':
                        return result + x * y;
                    case '-':
                        return result + (x - y);
                    case '+':
                        return result + (x + y);
                    default:
                        return "0";
                }
            }
        }
        int x, y;
        char action;
        ArrayList<Expression> Expressions = new ArrayList<>();
        while (scanner.hasNextLine()) {
            string = scanner.nextLine();
            x = Integer.parseInt(string.split(" ")[0]);
            y = Integer.parseInt(string.split(" ")[2]);
            action = string.split(" ")[1].charAt(0);
            Expressions.add(new Expression(x, y, action));
        }
        FileOutputStream fileOutputStream = new FileOutputStream("src/module10/addtask11/answers.txt");
        string = "";
        for (Expression expression : Expressions) {
            string += expression.result() + "\n";

        }
        string = string.substring(0, string.length() - 1);
        fileOutputStream.write(string.getBytes(StandardCharsets.UTF_8));
        fileOutputStream.close();
    }
}
