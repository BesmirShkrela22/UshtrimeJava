package DataTypes;

import java.sql.SQLOutput;
import java.util.Scanner;

/*6. Write a Java program to compute body mass index (BMI). Go to the editor

        Test Data
        Input weight in pounds: 452
        Input height in inches: 72
        Expected Output:
        Body Mass Index is 61.30159143458721*/

/*BMI Categories:
        Underweight = <18.5
        Normal weight = 18.5–24.9
        Overweight = 25–29.9
        Obesity = BMI of 30 or greater*/
public class Ushtrimi6 {
    public static void main(String[] args) {
        Scanner scaner=new Scanner(System.in);
        System.out.println("ju lutem vendosni peshen ne kg ");
        double pesha= scaner.nextDouble();
        System.out.println("ju lutem vendosni gjatesine ne m");
        double gjatesia= scaner.nextDouble();

        double BMI=(pesha/(gjatesia*gjatesia));
        if(BMI<18.5 ){
            System.out.println("ju jeni nenpeshe");

        } else if (BMI >=18.5 && BMI <=24.9) {
            System.out.println("pesha juaj eshte normale");

        } else if (BMI >25&&BMI<29.9) {
            System.out.println("ju jeni mbipeshe");

        }else System.out.println("ju jeni obeze");







    }

}
