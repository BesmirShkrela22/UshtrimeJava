package DataTypes;

import java.util.Scanner;

/*2. Write a Java program that reads a number in inches, converts it to meters. Go to the editor
        Note: One inch is 0.0254 meter.
        Test Data
        Input a value for inch: 1000
        Expected Output :
        1000.0 inch is 25.4 meters*/
public class Ushtrimi2 {
    public static void main(String[] args) {
        Scanner scaner=new Scanner(System.in);
        System.out.println("ju lutem vendosni numrin ne inches");
        double inches= scaner.nextDouble();
        double meter=inches/39.370;
        System.out.println("numri i konvertuar ne meter eshte:"+meter);


    }
}
