package module15.task1511;

import javax.sound.sampled.FloatControl;
import java.time.*;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        /*System.out.println(LocalDate.now());
        System.out.println(ZonedDateTime.now());
        System.out.println(LocalTime.now());
        System.out.println(ZoneId.systemDefault());
        System.out.print(ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Europe/Moscow")));*/

        LocalTime time = LocalTime.of(16, 30); // строка 1
        time = time.withHour(14).plusMinutes(15);
        System.out.println(time);
    }
}
