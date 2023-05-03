package DataTypes;

import java.util.Scanner;

/*7. Write a Java program to takes the user for a distance (in meters) and the time was taken
(as three numbers: hours, minutes, seconds), and display the speed, in meters per second,
 kilometers per hour and miles per hour (hint: 1 mile = 1609 meters). Go to the editor
        Test Data
        Input distance in meters: 2500
        Input hour: 5
        Input minutes: 56
        Input seconds: 23
        Expected Output :
        Your speed in meters/second is 0.11691531
        Your speed in km/h is 0.42089513
        Your speed in miles/h is 0.26158804*/
public class Ushtrimi7 {
    public static void main(String[] args) {

        Scanner scaner=new Scanner(System.in);
        System.out.println("ju lutem vendosni gjatesine e pershkruar ne m");
        double gjatesia=scaner.nextDouble();
        double gjatesiakm=gjatesia/1000;


        System.out.println("ju lutem vendosni kohen qe e keni realizuar ore");
        double kohaore=scaner.nextDouble();
        System.out.println("ju lutem vendosni kohen qe e keni realizuar minuta");
        double kohaminuta=scaner.nextDouble();
        System.out.println("ju lutem vendosni kohen qe e keni realizuar sekonda");
        double kohasekonda=scaner.nextDouble();
        double ore=(kohaore*60)+(kohaminuta*60)+kohasekonda;

        System.out.println("shpejtesia ne km / ore eshte" + gjatesiakm/ore);
        System.out.println("shpejtesia ne m/sec eshte" + gjatesia/3600);

    }


    /*public static double shpejtesiakm(double km,double ore){
        return km/ore;
    }
    public static double shpejtesiamps(double m,double sek){
        return m/sek;
    }*/
}
