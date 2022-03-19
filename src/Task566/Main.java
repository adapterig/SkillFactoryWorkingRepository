package Task566;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String[] commands = {"добавитьМесто", "вывестиСписок", "завершитьРаботу", "установитьБлокировку", "снятьБлокировку", "help", "заменитьКлюч", "удалитьМесто"};
        ParkingPlace[] places = new ParkingPlace[scanInt("Введите количество парковочных мест: ", 1, 100)];
        while (true) {
            switch (scanCommand("Введите команду (введите help для вывода списка комманд): ", commands)) {
                case "добавитьМесто":
                    addPlace(places);
                    break;
                case "вывестиСписок":
                    printAllPlaces(places);
                    break;
                case "завершитьРаботу":
                    return;
                case "установитьБлокировку":
                    setLock(places, true);
                    break;
                case "снятьБлокировку":
                    setLock(places, false);
                    break;
                case "help":
                    printHelp(commands);
                    break;
                case "заменитьКлюч":
                    changeKey(places);
                    break;
                case "удалитьМесто":
                    removePlace(places);
                    break;
            }
        }
    }

    private static void addPlace(ParkingPlace[] places) {
        for (int i = 0; i < places.length; i++) {
            if (places[i] == null) {
                int number = scanInt("Введите номер парковочного места (от " + 1 + " до " + places.length + "): ", 1, places.length);
                for (ParkingPlace n : places) {
                    if (n != null && n.getNumber() == number) {
                        System.out.println("Место с указаным номером уже существует.");
                        return;
                    }
                }
                String ownerName = scanLine("Введите имя владельца места (от 3 до 120 символов):", 3, 120);
                String key = scanKey();
                places[i] = new ParkingPlace(number, ownerName, key);
                System.out.println("Парковочное место добавлено.");
                return;
            }
        }
        System.out.println("Места на парковке закончились");
    }

    private static void removePlace(ParkingPlace[] places) {
        int number = scanInt("Введите номер парковочного места (от " + 1 + " до " + places.length + "): ", 1, places.length);
        for (int i = 0; i < places.length; i++) {
            if (places[i] != null && places[i].getNumber() == number && !places[i].isLocked()) {
                places[i] = null;
                System.out.println("Парковочное место удалено.");
                return;
            } else if (places[i] != null && places[i].getNumber() == number && places[i].isLocked()) {
                System.out.println("Удаление невозможно, установлена блокировка");
                return;
            }
        }
        System.out.println("Парковочное место c указанным номером не найдено.");
    }

    private static void changeKey(ParkingPlace[] places) {
        int number = scanInt("Введите номер парковочного места: ", 1, places.length);
        for (int i = 0; i < places.length; i++) {
            if (places[i] != null && places[i].getNumber() == number && !places[i].isLocked()) {
                String key = scanKey();
                places[i].setKey(key);
                System.out.println("Ключ изменен.");
                return;
            } else if (places[i] != null && places[i].getNumber() == number && places[i].isLocked()) {
                System.out.println("Замена ключа невозможна, установлена блокировка");
                return;
            }
        }
        System.out.println("Парковочное место c указанным номером не найдено.");

    }

    private static void printAllPlaces(ParkingPlace[] places) {
        for (int i = 0; i < places.length; i++) {
            if (places[i] != null) {
                System.out.println(places[i].getInfo());
            }
        }
    }

    private static void setLock(ParkingPlace[] places, boolean lock) {
        int number = scanInt("Введите номер парковочного места: ", 1, places.length);
        for (int i = 0; i < places.length; i++) {
            if (places[i] != null && places[i].getNumber() == number) {
                places[i].setLocked(lock);
                if (lock) {
                    System.out.println("Блокировка установлена.");
                } else {
                    System.out.println("Блокировка снята");
                }
                return;
            }
        }
        System.out.println("Парковочное место с указанным номером не найдено.");
    }

    private static void printHelp(String[] commands) {
        for (String action : commands) {
            System.out.println(action);
        }
    }

    private static int scanInt(String message, int min, int max) {
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

    private static String scanLine(String message, int minLength, int maxLength) {
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

    private static String scanCommand(String message, String[] commands) {
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

    private static String scanKey() {
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
