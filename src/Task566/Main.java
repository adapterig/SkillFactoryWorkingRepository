package Task566;

public class Main {
    public static void main(String[] args) {
        String[] commands = {"добавитьМесто", "вывестиСписок", "завершитьРаботу", "установитьБлокировку", "снятьБлокировку", "help", "заменитьКлюч", "удалитьМесто"};
        ParkingPlace[] places = new ParkingPlace[Scan.scanInt("Введите количество парковочных мест: ", 1, 100)];
        while (true) {
            switch (Scan.scanCommand("Введите команду (введите help для вывода списка комманд): ", commands)) {
                case "добавитьМесто":
                    Parking.addPlace(places);
                    break;
                case "вывестиСписок":
                    Parking.printAllPlaces(places);
                    break;
                case "завершитьРаботу":
                    return;
                case "установитьБлокировку":
                    Parking.setLock(places, true);
                    break;
                case "снятьБлокировку":
                    Parking.setLock(places, false);
                    break;
                case "help":
                    printHelp(commands);
                    break;
                case "заменитьКлюч":
                    Parking.changeKey(places);
                    break;
                case "удалитьМесто":
                    Parking.removePlace(places);
                    break;
            }
        }
    }

    private static void printHelp(String[] commands) {
        for (String action : commands) {
            System.out.println(action);
        }
    }


}
