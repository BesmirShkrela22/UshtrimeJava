package Methods;

import java.util.Scanner;

/*1. Write a Java method to find the smallest number among three numbers. Go to the editor
        Test Data:
        Input the first number: 25
        Input the Second number: 37
        Input the third number: 29
        Expected Output:

        The smallest value is 25.0*/
public class Ushtrimi1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("ju lutem vendosni numrin e pare");
        int nr1=sc.nextInt();
        System.out.println("ju lutem vendosni numrin e dyte");
        int nr2=sc.nextInt();
        System.out.println("ju lutem vendosni numrin e trete");
        int nr3=sc.nextInt();
        System.out.println("ju lutem vendosni numrin e katert");
        int nr4=sc.nextInt();


       /* if(nr1>nr2 && nr1>nr3 ){
            System.out.println("numri me i madhe nga numrat e dhene eshte"+ nr1);
        } else if (nr2>nr1 && nr2>nr3) {
            System.out.println("numri me i madhe nga numrat e dhene eshte"+ nr2);

        }else System.out.println("numri me i madhe nga numrat e dhene eshte"+ nr3);*/
       // System.out.println(nrmax(nr1,nr2,nr3,nr4));
        System.out.println(nrmin(nr1,nr2,nr3,nr4));
    }


    public static int nrmin(int nr1,int nr2,int nr3,int nr4){
        return Math.min(Math.min(Math.min(nr1,nr2),nr3),nr4);

    }


    }

