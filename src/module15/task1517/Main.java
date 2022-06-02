package module15.task1517;

import java.time.Instant;
import java.time.*;
import java.util.Date;

public class Main {
    public LocalTime convertDateToLocalTime(Date date){
        Instant instant = date.toInstant();
        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of("Europe/Moscow"));
        return zonedDateTime.toLocalTime();
    }
}
