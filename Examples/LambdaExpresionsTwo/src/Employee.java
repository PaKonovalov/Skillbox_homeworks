import java.text.SimpleDateFormat;
import java.util.Date;


public class Employee
{

    private String name;
    private Integer salary;
    private Date workStarts;

    public Employee(String name, Integer salary, Date workStarts){
        this.name = name;
        this.salary = salary;
        this.workStarts = workStarts;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Integer getSalary(){
        return salary;
    }

    public void setSalary(Integer salary){
        this.salary = salary;
    }

    public Date getWorkStarts(){
        return workStarts;
    }

    public void setWorkStarts(Date workStarts){
        this.workStarts = workStarts;
    }

    public String toString(){
        return name + " - " + salary + " - " +
                (new SimpleDateFormat("dd.MM.yyyy")).format(workStarts);
    }
}

