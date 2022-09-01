import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

@Data
@ToString(exclude = "salary")
@AllArgsConstructor

public class Employee {
    String name;
    Integer salary;
    String workStart;
}
