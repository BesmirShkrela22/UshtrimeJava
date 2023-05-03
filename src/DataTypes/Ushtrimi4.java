package DataTypes;

import java.util.Scanner;

/*4. Write a Java program to convert minutes into a number of years and days. Go to the editor

        Test Data
        Input the number of minutes: 3456789
        Expected Output :
        3456789 minutes is approximately 6 years and 210 days*/
public class Ushtrimi4 {
    public static void main(String[] args) {

        /*Scanner scaner=new Scanner(System.in);
        System.out.println("ju lutem vendosni minutat");
        int munutat= scaner.nextInt();*/

        double minutesInYear = 60 * 24 * 365;

        Scanner input = new Scanner(System.in);

        System.out.print("Input the number of minutes: ");

        double min = input.nextDouble();

        long years = (long) (min / minutesInYear);
        int days = (int) (min / 60 / 24) % 365;

        System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");





    }
}
