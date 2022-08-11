public class TopManager extends Worker {

    private Company company;

    public TopManager(int salary, Company company) {
        super(salary);
        this.company = company;

    }

    @Override
    public double getMonthSalary() {
        int salary = (int) super.getMonthSalary();
        if (company.getIncome() > 10_000_000)
            return (int) (salary + salary * 1.5);
        return salary;
    }
}