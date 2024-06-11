package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyy : HH:mm");

        LocalDateTime withTwoWeeks = localDateTime.plusWeeks(2);

        LocalDateTime fixDateTime = LocalDateTime.of(2066, 12, 5, 10, 22);
        System.out.println(localDateTime.format(formatter));
        System.out.println(withTwoWeeks.format(formatter));

        if(localDateTime.isBefore(fixDateTime)) {
            System.out.println("Das festgelegte Datum " + fixDateTime.format(formatter) + " liegt in der Zukunft.");
            System.out.println("Die differenz in Tagen beträgt: " + difInDays(localDateTime, fixDateTime) + " Tage.");
        }
        else {
            System.out.println("Das festgelegte Datum " + fixDateTime.format(formatter) + " liegt in der Vergangenheit.");
            System.out.println("Die differenz in Tagen beträgt: " + difInDays(localDateTime, fixDateTime) + " Tage.");
        }


    }

    public static long difInDays(LocalDateTime date1, LocalDateTime date2){
        return ChronoUnit.DAYS.between(date1, date2);
    }
}