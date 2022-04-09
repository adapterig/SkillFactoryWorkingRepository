package module5.task566;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Scan {
    public static int scanInt(String message, int min, int max) {
        int scanInt;
        while (true) {
            Scanner scanner;
            System.out.print(message);
            scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                scanInt = scanner.nextInt();
                if (scanInt <= max && scanInt >= min) break;
            }
        }
        return scanInt;
    }

    public static String scanLine(String message, int minLength, int maxLength) { // просто сканированеи строки ограниченной длины
        String scanLine;
        while (true) {
            Scanner scanner;
            System.out.print(message);
            scanner = new Scanner(System.in);
            if (scanner.hasNextLine()) {
                scanLine = scanner.nextLine();
                if (scanLine.length() <= maxLength && scanLine.length() >= minLength) break;
            }
        }
        return scanLine;
    }

    public static String scanLine(String message, String[] commands) { // сканирование строки с распонованием комманды из массива строк
        String scanString;
        while (true) {
            Scanner scanner;
            System.out.print(message);
            scanner = new Scanner(System.in);
            if (scanner.hasNext()) {
                scanString = scanner.next();
                for (String com : commands) {
                    if (scanString.equals(com)) {
                        return scanString;
                    }
                }
            }
        }
    }

    public static String scanKey() {
        String scanString;
        while (true) {
            Scanner scanner;
            System.out.print("Введите ключ доступа (4 байта в 16-м формате)");
            scanner = new Scanner(System.in);
            if (scanner.hasNext()) {
                scanString = scanner.next();
                if (Pattern.matches("[0-9a-fA-f]{8}", scanString)) {
                    return scanString.toUpperCase(Locale.ROOT);
                }
            }
        }
    }
}
