package module6;

import java.util.ArrayList;

public class Battle {
    ArrayList<Monster> monsters = new ArrayList<Monster>();

    public void add(Monster monster) {
        if (monsters.size() < 5) {
            monsters.add(monster);
        } else {
            System.out.println("No more monsters!");

        }
    }

    public void start() {
        this.run();
    }

    private void run() {
        for (Monster a : monsters) {
            a.attack();
        }
    }
}
