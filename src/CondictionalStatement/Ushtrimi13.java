package CondictionalStatement;

import java.util.Scanner;

/*13. Write a program in Java to display the cube of the number upto given an integer. Go to the editor

        Test Data
        Input number of terms : 4
        Expected Output :

        Number is : 1 and cube of 1 is : 1
        Number is : 2 and cube of 2 is : 8
        Number is : 3 and cube of 3 is : 27
        Number is : 4 and cube of 4 is : 64*/
public class Ushtrimi13 {
    public static void main(String[] args) {

Scanner input=new Scanner(System.in);

        System.out.println("ju lutem jepni disa numra ");

        int numri= input.nextInt();
        System.out.println("nr"+" "+"fuqi3");

        for(int i=1;i<=numri;i++){
            int fuqi3=i*i*i;

            System.out.println(i+"  "+fuqi3);


        }

    }

}
