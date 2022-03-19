package module6;

public class SoldierMain {
    public static void main(String[] args) {

        Barracks barracks = new Barracks();
        barracks.add(new Soldier("Пехотинец"));
        barracks.add(new Knight("Рыцарь"));
        barracks.add(new Rifleman("Мушкетер"));
        barracks.add(new Rifleman("Мушкетер2"));
        barracks.visit();
    }
}
