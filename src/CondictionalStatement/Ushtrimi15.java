package CondictionalStatement;
/*15. Write a program in Java to display the n terms of odd natural number and their sum. Go to the editor

        Test Data
        Input number of terms is: 5
        Expected Output :

        The odd numbers are :
        1
        3
        5
        7
        9
        The Sum of odd Natural Number upto 5 terms is: 25*/
import java.sql.SQLOutput;
import java.util.Scanner;

public class Ushtrimi15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("vendosni nje numer tek");
        int numritek = input.nextInt();
        int shumaenumrave = 0;
        for (int i = 0; i <= numritek; i++) {
            //System.out.println(i);
            if(!(i%2==0)){
                shumaenumrave=shumaenumrave+(i*2)-i;
                System.out.println(i);

            }else {

            }


        }
        System.out.println("shuma e numrave eshte: "+shumaenumrave);




    }
}

