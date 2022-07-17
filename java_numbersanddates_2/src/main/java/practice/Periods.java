package practice;
import java.time.Period;
import java.time.LocalDate;

public class Periods {

    // реализуйте вывод разницы между датами, используя класс Period
    public static String getPeriodFromBirthday(LocalDate firstDate, LocalDate secondDate) {
        Period p = Period.between(firstDate, secondDate);
        String text = "";
        text = "years:" + p.getYears() + ", " + "months:" + p.getMonths() + ", " +  "days:" + p.getDays();
        return text;
    }

}
