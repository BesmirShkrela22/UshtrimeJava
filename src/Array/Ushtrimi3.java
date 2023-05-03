package Array;

import java.util.Scanner;

/*3. Write a Java program to print the following grid. Go to the editor

        Expected Output :

        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -*/
public class Ushtrimi3 {

    public static void main(String[] args) {

        int [][]a = new int[10][10];
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                System.out.printf("%2d ", a[i][j]);
            }
            System.out.println();
        }

        /*Scanner input=new Scanner(System.in);
        System.out.println("jepni nje numer");
        int numri=input.nextInt();

        for(int i=1;i<=numri;i++){
            for (int j=1;j<=numri;j++){
                System.out.print(" - ");
            }
            System.out.println();
        }
*/

    }
}
