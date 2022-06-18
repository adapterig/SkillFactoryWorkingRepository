package module17;

public class Fight extends Thread {
    Entity player;
    Entity enemy;

    public Fight(Entity player, Entity enemy) {
        this.player = player;
        this.enemy = enemy;
    }

    @Override
    public void run() {
        do {
            player.attack(enemy);
            if (enemy.getHealth() == 0) {
                System.out.println("Монстр " + enemy.name + " погиб в бою. Бой завершен.");
                System.out.println("Игрок " + player.name + " получил золото " + enemy.getGold());
                System.out.println("Игрок " + player.name + " получил опыт " + enemy.getExperience());
                player.addGold(enemy.getGold());
                player.addExperience(enemy.getExperience());
                System.out.println(player);
                return;
            }
            enemy.attack(player);
            if (player.getHealth() == 0) {
                System.out.println("Игрок " + player.name + " погиб в бою.  Игра завершена.");
                return;
            }
        } while (true);

    }

}
