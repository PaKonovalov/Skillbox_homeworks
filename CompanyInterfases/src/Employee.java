public interface Employee extends Comparable<Employee> { // Сравнение через интерфейс Comparable, добавляем интерфейс, создаем  default метод

    double getMonthSalary();

    //  default метод для реализации сравнени через интерфейс Comparable
    @Override
    default int compareTo(Employee o) {
        return (int) (getMonthSalary() -  o.getMonthSalary());
    }
}
