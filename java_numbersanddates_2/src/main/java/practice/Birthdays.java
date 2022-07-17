package practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Birthdays {

    public static void main(String[] args) {

        int day = 26;
        int month = 3;
        int year = 2022;

        System.out.println(collectBirthdays(year, month, day));
    }

    public static String collectBirthdays(int year, int month, int day) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(year, month, day);
        String line = "";

        for (LocalDate date = birthday; date.isBefore(today) || date.isEqual(today); date = date.plusYears(1)){
            int comparison = date.compareTo(birthday);
            line += (comparison +
                    date.format(DateTimeFormatter.ofPattern(" - dd.MM.yyyy - E").localizedBy(Locale.ENGLISH))
                    + System.lineSeparator());
        }
        return line;
    }

}
