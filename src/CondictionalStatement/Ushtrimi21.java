package CondictionalStatement;

import java.util.Scanner;

/*23. Write a java program to generate a following *'s triangle. Go to the editor

        Test Data
        Input the number: 6
        Expected Output :

        ******
        *****
        ****
        ***
        **
        **/
public class Ushtrimi21 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("ju lutem vendosni numrin");
        int nr=input.nextInt();

        for(int i=1;i<=nr;i++){
            for(int j=i;j<=nr;j++){
                System.out.print("*");

            }
            System.out.println();
        }

    }
}
