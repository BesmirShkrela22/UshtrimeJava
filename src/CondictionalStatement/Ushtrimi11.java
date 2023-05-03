package CondictionalStatement;

import java.util.Scanner;

/*11. Write a program in Java to display n terms of natural numbers and their sum. Go to the editor

        Test Data
        Input the number: 2
        Expected Output :

        Input number:
        2
        The first n natural numbers are :
        2
        1
        2
        The Sum of Natural Number upto n terms :
        23*/
public class Ushtrimi11 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("ju lutemi vendosni nje numer natural");
        int numrinatural=scan.nextInt();
        int shuma=0;

        for(int i=1;i<=numrinatural;i++){
shuma=shuma+i;


        }
        System.out.println("shuma e numrave natural eshte;"+shuma);

    }
}
