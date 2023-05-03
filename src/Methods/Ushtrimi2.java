package Methods;

import java.util.Scanner;

/*Write a Java method to compute the average of three numbers.

        Test Data:
        Input the first number: 25
        Input the second number: 45
        Input the third number: 65*/
public class Ushtrimi2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in) ;
        System.out.println("ju lutem vendosni numrin e pare");
        int nr1=sc.nextInt();
        System.out.println("ju lutem vendosni numrin e dyte");
        int nr2=sc.nextInt();
        System.out.println("ju lutem vendosni numrin e trete");
        int nr3=sc.nextInt();

        System.out.println(mesatarja(nr1,nr2,nr3));

    }
    public static int mesatarja(int nr1,int nr2,int nr3){
        return(nr1+nr2+nr3)/3;

    }


}
