import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static final String STAFF_TXT = "data/staff.txt";
    public Employee employee;

    public static void main(String[] args) {
        List<Employee> staff = Employee.loadStaffFromFile(STAFF_TXT);
        System.out.println(staff);
    }

    public static void sortBySalaryAndAlphabet(List<Employee> staff) {
        staff.sort( (o1, o2) -> {
            if(o1.getSalary().equals(o2.getSalary())){
             return o1.getName().compareTo(o2.getName());
            } else {
               return o1.getSalary().compareTo(o2.getSalary());
            }
        });

            for (Employee employee : staff) {
                System.out.println(employee);
            }
        }
    }