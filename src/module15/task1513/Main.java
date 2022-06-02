package module15.task1513;


import java.time.Duration;
import java.time.LocalTime;

public class Main {
    boolean dateComparison(LocalTime time, Duration duration) {
        return time.plus(duration).isAfter(LocalTime.now());
    }
}

