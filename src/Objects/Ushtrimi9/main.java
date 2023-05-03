package Objects.Ushtrimi9;

import javax.xml.stream.events.Attribute;
import java.time.LocalDate;

public class main {
    public static void main(String[] args) {

        Employee bora = new Employee("Roberta Petrus", 50000, LocalDate.parse("2021-04-01"));
        Employee bora1=new Employee("ajna shkrela",34444,LocalDate.parse("2021-04-01"));
        Employee besi=new Employee("besmir shkrela",55550,LocalDate.parse("2012-12-12"));
        System.out.println(bora.yearofdate());
        System.out.println(bora1.yearofdate());
       System.out.println(besi.yearofdate());
    }
}
