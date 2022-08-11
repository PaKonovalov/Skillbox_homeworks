public class Manager extends Worker {

    private int sales= (int) (Math.random() * (140_000 - 115_000) + 115_000);;

    public Manager(int salary){
        super(salary);
    }

    @Override
    public double getMonthSalary() {
        return (int) (super.getMonthSalary() + 0.05 * sales);
    }

    public int getSales() {
        return sales;
    }
}