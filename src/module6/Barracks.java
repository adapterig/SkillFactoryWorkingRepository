package module6;

public class Barracks {
    Soldier[] army;
    int count;

    public Barracks() {
        this.army = new Soldier[3];
        this.count = 0;
    }

    public void add(Soldier soldier) {
        if (count < 3) {
            army[count] = soldier;
            System.out.println(soldier.name + " размещен в бараках");
            count++;
        } else {
            System.out.println("Нужны бараки для размещения солдат");
        }
    }

    public void visit() {
        for (int i = 0; i < army.length; i++) {
            if (army[i] != null) {
                System.out.println(army[i].phrase);
            }
        }
    }
}

