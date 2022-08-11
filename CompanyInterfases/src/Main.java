import java.util.ArrayList;
import java.util.List;

abstract class Main {
    public static void main(String[] args) {
        Company company = new Company();

        for (int i = 0; i < 50; i++) {
            company.hire(new Operator(30_000));
        }

        List<Employee> workers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            workers.add(new Manager(50_000));
            // if нужен для проверки условия, каждая восьмая итерация будет добалятьс топ менеджер
            if (i % 8 == 0) {
                workers.add(new TopManager(70_000, company));
            }
        }
        company.hireAll(workers);

        printEmployees(company);

        List<Employee> employees = company.getEmployees();
        int size = employees.size();
        System.out.println(employees.size());
        for (int i = 0; i < size / 2; i++) {
            company.fire(employees.get(i));
        }
        System.out.println(company.getEmployees().size());
        printEmployees(company);
    }

    private static void printEmployees(Company company) {
        System.out.println("Самые высокие зарплаты:");
        List<Employee> topSalaryStaff = company.getTopSalaryStaff(5);
        for (Employee e : topSalaryStaff) {
            System.out.println(e.getMonthSalary());
        }

        System.out.println("Самые низкие зарплаты:");
        List<Employee> lowSalaryStaff = company.getLowestSalaryStaff(5);
        for (Employee e : lowSalaryStaff) {
            System.out.println(e.getMonthSalary());
        }
    }
}