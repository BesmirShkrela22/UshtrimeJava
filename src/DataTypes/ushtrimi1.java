package DataTypes;

import java.util.Scanner;

/*1. Write a Java program to convert temperature from Fahrenheit to Celsius degree. Go to the editor
        Test Data
        Input a degree in Fahrenheit: 212
        Expected Output:
        212.0 degree Fahrenheit is equal to 100.0 in Celsius*/
public class ushtrimi1 {
    public static void main(String[] args) {
        Scanner scaner=new Scanner(System.in);
        System.out.println("ju lutem vendosni temperaturen ne Fahradei!");
        double fahrenheit= scaner.nextDouble();
        //double celcius=fahrenheit/2.12;
        double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);
        System.out.println("temperatura ne grade celcius eshte;"+ celsius);


    }

}
