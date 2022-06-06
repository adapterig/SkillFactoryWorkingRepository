package module15.task1574;

import java.util.OptionalLong;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


        LongStream ls = LongStream.of(1, 2, 3);
        OptionalLong opt = ls.map(n -> n * 10).filter(n -> n < 5).findFirst();
        System.out.println(opt.isPresent());

        Stream<String> s = Stream.generate(() -> "meow");
        boolean match = s.anyMatch(String::isEmpty);
        System.out.println(match);
    }
}
