package CondictionalStatement;

import java.util.Scanner;

/*. Write a Java program that reads a floating-point number and prints "zero" if the number is zero.
        Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1,
        or "large" if it exceeds 1,000,000. Go to the editor
        Test Data
        Input a number: 25
        Expected Output :
        Input value: 25
        Positive number*/
public class Ushtrimi4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ju lutem jepni nje numer");
        int numri = input.nextInt();

        int x=-34;
        System.out.println(Math.abs(x));
        System.out.println(Math.random());




        if (numri > 0) {
            if (numri < 1) {
                System.out.println("Positive small number");
            } else if (numri > 1000000) {
                System.out.println("Positive large number");
            } else {
                System.out.println("Positive number");
            }
        } else if (numri < 0) {
            if (Math.abs(numri) < 1) {
                System.out.println("Negative small number");
            } else if (Math.abs(numri) > 1000000) {
                System.out.println("Negative large number");
            } else {
                System.out.println("Negative number");
            }
        } else {
            System.out.println("Zero");
        }
    }}
