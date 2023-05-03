package DataTypes;

import java.util.Scanner;

/*9. Write a Java program that accepts two integers from the user and then prints the sum,
 the difference, the product, the average, the distance (the difference between integer),
 the maximum (the larger of the two integers), the minimum (smaller of the two integers).
        Test Data
        Input 1st integer: 25
        Input 2nd integer: 5
        Expected Output :
        Sum of two integers: 30
        Difference of two integers: 20
        Product of two integers: 125
        Average of two integers: 15.00
        Distance of two integers: 20
        Max integer: 25
        Min integer: 5*/
public class Ushtrimi9 {


    public static void main(String[] args) {
        Scanner scaner=new Scanner(System.in);
        System.out.println("ju lutem vendosni numrin e [are");
        int num1= scaner.nextInt();
        System.out.println("ju lutem vendosni numrin e dyte");
        int num2= scaner.nextInt();

        System.out.println(Math.max(num1,num2));
        System.out.println(num1-num2);
        System.out.println(Math.min(num1,num2));

    }
}
