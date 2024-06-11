package org.bonustask;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2020, 8, 23);
        Animal animal = new Animal("Giraffe", birthday);

        System.out.println("Tage bis zum nächsten Geburtstag: " + daysUntilBirthday(animal.getBirthday()));
    }

    public static long daysUntilBirthday(LocalDate birthday){
        LocalDate today = LocalDate.now();

        LocalDate nextBirthday = birthday.withYear(today.getYear());

        if(nextBirthday.isBefore(today) || nextBirthday.isEqual(today)) {
            nextBirthday = nextBirthday.plusYears(1);
        }

        return ChronoUnit.DAYS.between(today, nextBirthday);
    }
}
