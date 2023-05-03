package CondictionalStatement;

import java.util.Scanner;

/*3. Take three numbers from the user and print the greatest number. Go to the editor

        Test Data
        Input the 1st number: 25
        Input the 2nd number: 78
        Input the 3rd number: 87
        Expected Output :
        The greatest: 87*/
public class Ushtrimi3 {


    public static void main(String[] args) {

       Scanner scan=new Scanner(System.in);
        System.out.println("Ju lutem shkruani numrin e pare");
        int nr1=scan.nextInt();
        System.out.println("ju lutem shkruani numrin e dyte");
        int nr2=scan.nextInt();
        System.out.println("ju lutem shkruani numrin e trete");
        int nr3=scan.nextInt();
        if(nr1>nr2&&nr1>nr3){
            System.out.println("numri maximal eshte;"+nr1);

        } else if (nr2>nr1&&nr2>nr3) {
            System.out.println("numri maximal eshte;"+nr2);

        }
        else {
            System.out.println("numri maximal eshte;"+nr3);
        }
    }
}
