package module12.task62;

import java.util.Map;
import java.util.TreeMap;
public class Main implements Comparable {
    public static void main(String[] args) {
        Map < Main, Integer > map = new TreeMap < > ();
        map.put(new Main(), 2);
        map.put(new Main(), 4);
        System.out.println(map.size());
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
