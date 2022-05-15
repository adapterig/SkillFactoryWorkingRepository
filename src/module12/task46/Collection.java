package module12.task46;

import java.util.ArrayList;

public class Collection {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(100);
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        int tempInt;
        for (int i = 0; i < list.size() / 2; i++) {
            tempInt = list.get(i);
            list.set(i, list.get(list.size() - 1 - i));
            list.set(list.size() - 1 - i, tempInt);
        }
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
