package lesson16;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Test_LocalDate {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        date = LocalDate.of(2007, Month.APRIL, 29);
        System.out.println(date + "\n");

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        dateTime = LocalDateTime.of(2019, Month.AUGUST, 27, 17, 47);
        System.out.println(dateTime + "\n");

        LocalTime time = LocalTime.now();
        System.out.println(time);
        time = LocalTime.of(time.getHour(), time.getMinute(), time.getSecond());
        System.out.println(time);
    }
}
