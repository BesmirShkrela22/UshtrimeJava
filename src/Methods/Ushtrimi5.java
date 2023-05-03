package Methods;

import java.sql.SQLOutput;
import java.util.Scanner;

/*4. Write a Java method to count all vowels in a string. Go to the editor
        Test Data:
        Input the string: w3resource
        Expected Output:

        Number of  Vowels in the string: 4*/
public class Ushtrimi5 {
    public static void main(String[] args) {

    Scanner sc=new Scanner(System.in)   ;
        System.out.println("vendosni nje text");
        String text=sc.nextLine();

        System.out.println(zanore(text));
    }
    public static int zanore(String text) {
        int zanore = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u')

            {
                zanore++;
            }

        }return zanore;

    }
}