package module17;

import java.util.Scanner;

public class Input {
    public static String userInput(String message) {
        System.out.println(message);
        System.out.print(">");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            return scanner.nextLine();
        } else {
            System.out.println("Введите комманду");
            return userInput(message);
        }
    }
}
