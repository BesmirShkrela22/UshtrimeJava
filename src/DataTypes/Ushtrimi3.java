package DataTypes;

import java.util.Scanner;

/*3. Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer. Go to the editor

        Test Data
        Input an integer between 0 and 1000: 565
        Expected Output :
        The sum of all digits in 565 is 16*/
public class Ushtrimi3 {


    public static void main(String[] args) {
        Scanner scaner=new Scanner(System.in);
        System.out.println("ju lutem vendosni numrin nga 1-1000 ");
        int num= scaner.nextInt();

       /* int numripare=numri/100;
        int var1=numripare;
        int numridyte=numri/10;
        int var2=numridyte%10;
        int numritrete=numri%10;
        int var3=numritrete%10;*/

        int firstDigit = num % 10;
        int remainingNumber = num / 10;
        int SecondDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int thirdDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int fourthDigit = remainingNumber % 10;



        System.out.println(firstDigit+SecondDigit+thirdDigit+fourthDigit);
    }
}
