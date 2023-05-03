package DataTypes;

import java.util.Scanner;
/*10. Write a Java program to break an integer into a sequence of individual digits. Go to the editor

        Test Data
        Input six non-negative digits: 123456
        Expected Output :
        1 2 3 4 5 6*/
public class Ushtrimi10 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Ju lutem vendosni ne numer 6 shifror");
        int numri= scan.nextInt();

        int nr1=numri/100000 %10;
        int nr2=numri/10000 %10;
        int nr3=numri/1000 %10;
        int nr4=numri/100 %10;
        int nr5=numri/10 %10;
        int nr6=numri %10;

        System.out.println(nr1+" "+nr2+ " "+nr3+" "+nr4+" "+nr5+" "+nr6);

        for(int i=1;i<=6;i++)
        System.out.println(i);

    }
}
