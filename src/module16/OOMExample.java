package module16;

import java.util.*;

public class OOMExample {
    public static void main(String[] args) {
        // создадим список, ссылающийся на
        // 100 массивов размером 1Mb
        List<Object> objects = new LinkedList<>();
        for (int i = 0; i < 1000; i++) {
            objects.add(new byte[1024 * 1024]);
        }
        System.out.println("Success!");
    }
}
