package Methods;

import java.util.Scanner;

/*6. Write a Java method to compute the sum of the digits in an integer. Go to the editor
        Test Data:
        Input an integer: 25
        Expected Output:

        The sum is 7*/
public class Ushtrimi6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in) ;
        System.out.println("ju lutem jepni nje numer");
        int numri=sc.nextInt();
        System.out.println(mblnumrave(numri));
    }
    public static int mblnumrave(int n){
     int mbetja=0;
     int nr1=0;
     int mbledhja=mbetja+nr1;


    mbetja=mbetja+(n%10);
    nr1=nr1+(n/10);
        return mbetja+nr1;

}


}
