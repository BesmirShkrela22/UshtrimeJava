package CondictionalStatement;

import java.util.Scanner;

/*16. Write a program in Java to display the pattern like right angle triangle with a number. Go to the editor

        Test Data
        Input number of rows : 10
        Expected Output :

        1
        12
        123
        1234
        12345
        123456
        1234567
        12345678
        123456789
        12345678910*/
public class Ushtrimi16 {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
        System.out.println("ju lutem vendosni numrin e rreshtave");
        int nr=input.nextInt();
        // int j;


        for(int i=1;i<=nr;i++){
           for(int j=1;j<=i;j++) {
               System.out.print(j);
           }
            System.out.println();


        }

    }
}
