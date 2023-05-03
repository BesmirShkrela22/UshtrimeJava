package CondictionalStatement;
/*
8. Write a Java program that takes the user to provide a single character from the alphabet.
        Print Vowel or Consonant, depending on the user input. If the user input is not a letter (between a and z or A and Z),
        or is a string of length > 1, print an error message. Go to the editor
        Test Data
        Input an alphabet: p
        Expected Output :
        Input letter is Consonant
*/
import java.util.Scanner;

public class Ushtrimi8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ju lutem vendosni nje shkronje");
        String germa = scanner.next().toLowerCase();
        boolean germaMedha = germa.charAt(0) >= 65 && germa.charAt(0) <= 90;
        boolean germaVogla = germa.charAt(0) >= 97 && germa.charAt(0) <= 122;
        boolean zanore = germa.equals("a") || germa.equals("e") || germa.equals("i") || germa.equals("o") || germa.equals("u");

        if(germa.length()>1){
            System.out.println("ju lutem shtypni vetem nje germe");
        } else if (!(germaVogla||germaMedha)) {
            System.out.println("ju lutem shkruani nje germe , jo simbole apo dicka tjeter");
            
        } else if (zanore) {
            System.out.println("germa eshte zanore ");


        }else {
            System.out.println("germa eshte bashketingellore");
        }


    }}

