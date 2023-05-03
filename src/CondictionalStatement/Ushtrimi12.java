package CondictionalStatement;

import java.util.Scanner;

/*
12. Write a program in Java to input 5 numbers from keyboard and find their sum and average. Go to the editor

        Test Data
        Input the 5 numbers : 1 2 3 4 5
        Expected Output :

        Input the 5 numbers :
        1
        2
        3
        4
        5
        The sum of 5 no is : 15
        The Average is : 3.0
*/
public class Ushtrimi12 {

    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);

        System.out.println("ju lutem vendosni 5 numra");
        int numri= input.nextInt();
        int shuma=0;
        double mesatarja=0;

        for(int i=1;i<=numri;i++){
            System.out.println(i);
            shuma=shuma+i;
        }
     mesatarja=(double)shuma/numri;

        System.out.println("shuma e numraves eshte:"+shuma);
        System.out.println("mesatarja e numravve eshte:"+mesatarja);

    }
}
