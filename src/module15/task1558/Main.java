package module15.task1558;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
       /* List<String> stringList = new ArrayList<>();
        stringList.add("1");
        stringList.add("23335");
        stringList.add("341");
        stringList.add("7581");
        stringList.add("41");
        stringList.add("31");
        stringList.add("31");
        stringList.add("01");
        stringList.add("41");

        List<Integer> integerList = new ArrayList<>();
        for (String s : stringList) {
            integerList.add(Integer.parseInt(s));
        }
        int s = 1;
        for (Integer integer : integerList) {
            s *= integer;
        }
        System.out.println(s);*/

        Stream<String> stream =  Stream.of("678", "87", "347", "1", "12");
        System.out.println(stream.map(Integer::parseInt).reduce(1, (x, y) -> x * y));

    }
}
