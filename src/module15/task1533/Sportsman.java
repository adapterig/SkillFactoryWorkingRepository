package module15.task1533;

import java.util.ArrayList;

public class Sportsman implements Swimmer, Runner { // строка 3
    @Override
    public int getResult() {
        ArrayList<String> stringArrayList = new ArrayList<>();
        System.out.println(45);
        System.out.println(45);
        System.out.println(45);
        return 20;
    }

    public static void main(String[] args) {
        Sportsman sp = new Sportsman();
        sp.getResult();
    }
}