package module17;


public class Game {
    public static void main(String[] args) {
        //Создание персонажа
        String userInput = "";
        while (userInput.trim() == "") {
            userInput = Input.userInput("Введите имя персонажа (имя не может быть пустым):");
        }
        Player player = new Player(userInput);
        System.out.println("Персонаж создан");
        System.out.println(player);

        Actions.sout(); // вывод списка доступных комманд
        while (player.getHealth() > 0) {
            userInput = Input.userInput("Введите комманду :");
            if (userInput.equals(Actions.FOREST.title)) {
                forest(player);
            } else if (userInput.equals(Actions.TRADER.title)) {
                trader(player);
            } else if (userInput.equals(Actions.HELP.title)) {
                Actions.sout();
            } else if (userInput.equals(Actions.EXIT.title)) {
                System.out.println("Программа завершена.");
                return;
            } else {
                System.out.println("Комманда не распознана.");
            }
        }

    }

    public static void forest(Entity player) {

        String userInput;
        do {
            userInput = "";
            Entity monster = Math.random() > 0.5 ? new Goblin("Goblin") : new Skeleton("Skeleton");
            System.out.println("В лесу на игрока " + player.name + "напал монстр" + monster.name);
            System.out.println(monster);
            Thread th = new Fight(player, monster);
            th.start();
            try {
                th.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            while (!userInput.equals("да") && !userInput.equals("нет")) {
                userInput = Input.userInput("Продолжить бой?\n\"да\" - продолжить бой, \"нет\" - вернуться в город");
            }
        } while (userInput.equals("да"));

    }

    public static void trader(Entity player) {
        String userInput;
        do {
            userInput = "";
            while (!userInput.equals("да") && !userInput.equals("нет")) {
                userInput = Input.userInput("Купить зелье?\n\"да\" - приобрести зелье, \"нет\" - вернуться в город");
                if (userInput.equals("да")) {
                    if (player.canPay(30)) {
                        player.payGold(30);
                        player.healing(10);
                        System.out.println("Зелье приобретено, потрачено 30 золота, здоровье увеличено на 15");
                        System.out.println(player);
                    } else {
                        System.out.println("Недостаточно золота!");
                    }
                }
            }
        } while (userInput.equals("да"));

    }
}
