package CondictionalStatement;
/*Write a Java program to find the number of days in a month.

        Test Data
        Input a month number: 2
        Input a year: 2016*/
import java.util.Scanner;

public class Ushtrimi7 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("vendosni numrin e muajit");
        int muaji=scanner.nextInt();
        System.out.println("vendosni vitin");
        int vitti=scanner.nextInt();
        
        int ditetemuajit=0;
        String emrimuajit="";

        switch (muaji){
            case 1:emrimuajit="janar";
            ditetemuajit=31;
            break;
            case 2:emrimuajit="shkurt";
            ditetemuajit=28;
            break;
            case 3:emrimuajit="mars";
                ditetemuajit=31;
                break;
            case 4:emrimuajit="prill";
                ditetemuajit=28;
                break;





        }
        System.out.println(emrimuajit+ ditetemuajit);
    }

}
