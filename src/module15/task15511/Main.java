package module15.task15511;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        IntStream str = IntStream.range(1, 101);
        System.out.println(str.skip(50).filter(i -> i % 5 == 0 || i % 2 == 0).sum());
    }
}
