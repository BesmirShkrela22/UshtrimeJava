package CondictionalStatement;

import java.util.Scanner;

/*1. Write a Java program to get a number from the user and print whether it is positive or negative. Go to the editor

        Test Data
        Input number: 35
        Expected Output :
        Number is positive*/
public class Ushtrimi1 {


    public static void main(String[] args) {

       Scanner scaner=new Scanner(System.in);
        System.out.println("ju lutem vendosni nje numer");
        int numri= scaner.nextInt();

        if(numri>=0){
            System.out.println("numri eshte pozitive");
        }
        else{
            System.out.println("numri eshte negativ");
        }
    }
}
