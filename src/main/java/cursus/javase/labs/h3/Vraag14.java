package cursus.javase.labs.h3;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class Vraag14 {



    public static void main(String[] args) {

        LocalTime elfUur = LocalTime.of(23, 0, 0);
        System.out.println(elfUur.plusHours(80 % 24));

        LocalDateTime elfUur2 = LocalDateTime.of(2023, Month.MARCH, 19, 23, 0, 0);
        System.out.println(elfUur2.until(elfUur2.plusHours(80), ChronoUnit.DAYS));

    }
}
