package task566;

public class Parking {
    public static void changeKey(ParkingPlace[] places) {
        int number = Scan.scanInt("Введите номер парковочного места: ", 1, places.length);
        for (int i = 0; i < places.length; i++) {
            if (places[i] != null && places[i].getNumber() == number) {
                String key = Scan.scanKey();
                places[i].setKey(key);
                return;
            }
        }
        System.out.println("Парковочное место c указанным номером не найдено.");

    }
    public static void setLock(ParkingPlace[] places, boolean lock) {
        int number = Scan.scanInt("Введите номер парковочного места: ", 1, places.length);
        for (int i = 0; i < places.length; i++) {
            if (places[i] != null && places[i].getNumber() == number) {
                if (lock) {
                    places[i].setLock();

                } else {
                    places[i].setUnlock();
                }
                return;
            }
        }
        System.out.println("Парковочное место с указанным номером не найдено.");
    }
    public static void addPlace(ParkingPlace[] places) {
        for (int i = 0; i < places.length; i++) {
            if (places[i] == null) {
                int number = Scan.scanInt("Введите номер парковочного места (от " + 1 + " до " + places.length + "): ", 1, places.length);
                for (ParkingPlace n : places) {
                    if (n != null && n.getNumber() == number) {
                        System.out.println("Место с указаным номером уже существует.");
                        return;
                    }
                }
                String ownerName = Scan.scanLine("Введите имя владельца места (от 3 до 120 символов):", 3, 120);
                String key = Scan.scanKey();
                places[i] = new ParkingPlace(number, ownerName, key);
                System.out.println("Парковочное место добавлено.");
                return;
            }
        }
        System.out.println("Места на парковке закончились");
    }
    public static void removePlace(ParkingPlace[] places) {
        int number = Scan.scanInt("Введите номер парковочного места (от " + 1 + " до " + places.length + "): ", 1, places.length);
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

    public static void printAllPlaces(ParkingPlace[] places) {
        for (int i = 0; i < places.length; i++) {
            if (places[i] != null) {
                System.out.println(places[i].getInfo());
            }
        }
    }
}
