package Objects.Ushtrimi6;
/*6. Write a Java program to create a class called "Employee" with a name, job title, and salary attributes,
        and methods to calculate and update salary.*/
public class Employe {

    String name;
    String jobTitle;
    double  salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }
    public Employe(String name,String jobTitle,double salary){
       this.name=name;
       this.jobTitle=jobTitle;
      this.salary=salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public  double rritjepage(double perqindja){

        return salary+(salary*perqindja)/100;

    }

}
