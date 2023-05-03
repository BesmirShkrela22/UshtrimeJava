package Objects.Ushtrimi12;

import java.time.LocalTime;

/*12. Write a Java program to create a class called "Airplane" with a flight number, destination,
        and departure time attributes, and methods to check flight status and delay.*/
public class Airplane {
   private int flightNumber;
   private String destination;
   private LocalTime departureTime;
   private int delaytime;


    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public int getDelaytime() {
        return delaytime;
    }

    public void setDelaytime(int delaytime) {
        this.delaytime = delaytime;
    }


    public Airplane(int flightNumber, String destination, LocalTime departureTime, int delaytime) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.delaytime = 0;
    }


    public int delay(int minutes){
        this.delaytime=minutes;
        this.departureTime=this.departureTime.plusMinutes(minutes);

        return minutes;
    }

    public void checkStatus(){
        if (delaytime==0){
            System.out.println("nuk ka vonesa ne fluturim");

        }else
            System.out.println("vonesa ne udhetim ishte ;"+ delaytime );
    }

}
