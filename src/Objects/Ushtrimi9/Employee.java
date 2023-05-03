package Objects.Ushtrimi9;



import java.time.LocalDate;
import java.time.Period;

/*9. Write a Java program to create a class called "Employee" with a name, salary, and hire date attributes,
        and a method to calculate years of service*/
public class Employee {

    private String name;
    private int salary;
    private LocalDate hiredate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDate getHiredate() {
        return hiredate;
    }

    public void setHiredate(LocalDate hiredate) {
        this.hiredate = hiredate;
    }

    public Employee (String name,int salary,LocalDate hiredate){
        this.name=name;
        this.salary=salary;
        this.hiredate=hiredate;


    }

    public int yearofdate() {
        return Period.between(hiredate, LocalDate.now()).getYears();
    }}
