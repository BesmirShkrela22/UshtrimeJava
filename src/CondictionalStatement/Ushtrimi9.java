package CondictionalStatement;

import java.util.Scanner;

public class Ushtrimi9 {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("ju lutem vendosni nje shkronje");
        String germa = scanner.next().toLowerCase();*/


        boolean vitibrishte=false;
        int viti=2015;
        boolean x=viti%4==0;
        boolean y=(viti%100)!=0;
        boolean z=viti%400==0;


        if(x&&(z||y)){
            System.out.println("vit i brishte");


        }else{
            System.out.println("nuk eshte vit i brishte ");

        }

    }
}
