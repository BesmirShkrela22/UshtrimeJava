package Objects.Ushtrimi12;

import javax.print.ServiceUI;
import javax.print.event.PrintEvent;
import java.time.LocalTime;

public class main {
    public static void main(String[] args) {

Airplane italia=new Airplane(23,"ITALI", LocalTime.MIN,0);
        System.out.println(italia.delay(88));
        italia.checkStatus();

}}
