package CondictionalStatement;

import java.util.Scanner;

/*18. Write a program in Java to make such a pattern like right angle triangle with number
        increased by 1.The pattern like : Go to the editor
        1
        2 3
        4 5 6
        7 8 9 10*/
public class Ushtrimi19 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("ju lutem vendosni numrin");
        int nr=input.nextInt();
int x=1;
        for(int i=1;i<=nr;i++){
            for(int j=1;j<=i;j++){
                System.out.print(x++ +" ");
            }
            System.out.println();
        }



    }

}
