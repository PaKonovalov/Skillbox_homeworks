import java.util.*;

class Company {  // implements Comparator<Employee> добавить если производим сравненеичерез Comparator

    private List<Employee> employees = new ArrayList<>();

    public void hire(Employee employee) {
        employees.add(employee);
    }

    public void hireAll(List<Employee> employees) {
        for (Employee e : employees) {
            hire(e);
        }
    }

    public void fire(Employee employee) {
        employees.remove(employee);
    }

    // Данный код изменен и переписан ниже с целью исключения дублирования
//    public List<Employee> getTopSalaryStaff(int count) {
////        employees.sort(this); // Сравнение через интерфейс Comparator
//        if (count < 0) {
//            return Collections.emptyList();
//        }
//        if (count < employees.size()) {
//            count = employees.size();
//        }
//        Collections.sort(employees); // Сравнение через интерфейс Comparable
//        Collections.reverse(employees);
//        return employees.subList(0, count); // возвращает список в заданом диапазоне от 0 до count
//
//    }
//
//    List<Employee> getLowestSalaryStaff(int count) {
//        if (count < 0) {
//            return Collections.emptyList();
//        }
//        if (count < employees.size()) {
//            count = employees.size();
//        }
//        Collections.sort(employees); // Сравнение через интерфейс Comparable
//        return employees.subList(0, count); // возвращает список в заданом диапазоне от 0 до count
//    }

    // новая реализация кода выше
    public List<Employee> getTopSalaryStaff(int count) {
        return getList(count, Comparator.reverseOrder()); // метод возвращает отсортированый в обратном порядке список
    }

    List<Employee> getLowestSalaryStaff(int count) {
        return getList(count, Comparator.naturalOrder()); // метод возвращает список отсортированый по возрастанию
    }

    private List<Employee> getList(int count, Comparator<Employee> comparator) {

        if (count < 0) {
            System.out.println("Передано неверное значение");
            return Collections.emptyList();
        }

        if (count < employees.size()) {
            count = employees.size();
        }

        employees.sort(comparator);
        return new ArrayList<>(employees.subList(0, count));
    }
    // конец новой реализации

    public int getIncome() {
        int income = 0;
        for (Employee e : employees) {
            if (e instanceof Manager) {
                income += ((Manager) e).getSales();
            }
        }
        return income;
    }

    public List<Employee> getEmployees() {
        return new ArrayList<Employee>(employees);
    }

    //    Сравнение через интерфейс Comparator
//    @Override
//    public int compare(Employee o1, Employee o2) {
//        return Double.compare(o1.getMonthSalary(), o2.getMonthSalary());
//    }
}