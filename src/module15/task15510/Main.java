package module15.task15510;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Double> list = Arrays.asList(117d, 12.2d, 66d, 18.5d);
        List<String> list2 = Arrays.asList("15", "18.5", "117", "22.2");
        Stream.concat(
                list.stream(),
                list2.stream().map(x -> Double.valueOf(x))
        ).distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
