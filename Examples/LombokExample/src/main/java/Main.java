import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Den Sigal", 15000, "2202.12.5");
        System.out.println(employee);
    }
}

