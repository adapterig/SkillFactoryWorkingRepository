package module12.task44;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        for (int i = 0; i <= 10000000; i++) {
            list.add(i);
        }

        for (int j = 10; j <= 100; j++) {
            list.add(j, j + 10);
            list.remove(j);
        }
    }
}
