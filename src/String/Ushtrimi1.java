package String;
//1. Write a Java program to get the character at the given index within the String.
public class Ushtrimi1 {
    public static void main(String[] args) {
        String emri="besmir";
        System.out.println(emri.charAt(5));
        System.out.println(emri.length());
        System.out.println(emri.concat("hhhh"));
        System.out.println(emri.getBytes());
        System.out.println(emri.intern());



        /*String s="besmir shkrela ajna shkrela bora shkrela";
        char emri='0';
        for (int i=0;i<s.length();i++){
           emri= s.charAt(s.length()-(i+1));

            System.out.print(emri+" ");
        }*/

       // System.out.println(s.charAt(1));

    }
}
