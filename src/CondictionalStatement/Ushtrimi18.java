package CondictionalStatement;

import java.util.Scanner;

/*17. Write a program in Java to make such a pattern like right angle triangle with a number which will repeat a number in a row.The pattern is as follows : Go to the editor

        1
        22
        333
        4444*/
public class Ushtrimi18 {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        System.out.println("ju lutem vendosni numrin");
        int nr=input.nextInt();
        // int j;

     for(int i=1;i<=nr;i++){
         for(int j=1;j<=i;j++){
             System.out.print(i);

         }
         System.out.println( );
     }

    }


}
