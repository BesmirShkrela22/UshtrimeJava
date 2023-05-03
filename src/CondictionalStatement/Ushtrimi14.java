package CondictionalStatement;

import java.util.Scanner;

/*14. Write a program in Java to display the multiplication table of a given integer. Go to the editor

        Test Data
        Input the number (Table to be calculated) : Input number of terms : 5
        Expected Output :

        5 X 0 = 0
        5 X 1 = 5
        5 X 2 = 10
        5 X 3 = 15
        5 X 4 = 20
        5 X 5 = 25*/
public class Ushtrimi14 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("jepni nje numer");
       int numri=input.nextInt() ;
        int shumezimiMe=0;


      for(int i=0;i<=numri;i++){
          while(numri>shumezimiMe){
              shumezimiMe++;
              i++;
              int shmz=numri*shumezimiMe;
              System.out.println(numri+" x "+ i +" = " +shmz);

          }

           System.out.println(i);

       }


        /*int j,n;

        *//*System.out.print("Input the number(Table to be calculated): ");
        {
            System.out.print("Input number of terms : ");
            Scanner in = new Scanner(System.in);
            n = in.nextInt();

            System.out.println ("\n");
            for(j=0;j<=n;j++)

                System.out.println(n+" X "+j+" = " +n*j);
        }*//*
*/
    }
}
