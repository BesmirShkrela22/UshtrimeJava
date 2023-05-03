package Array;

import java.util.ArrayList;
import java.util.Arrays;

/*20. Write a Java program to convert an array to ArrayList.*/
public class Ushtrimi20 {
    public static void main(String[] args) {

String[]array={"besi","bora","ajna"};
String[]array2={"bs","br","aj"};
 ArrayList<String> lista=new ArrayList<String>(Arrays.asList(array));
 ArrayList<String>lista2=new ArrayList<String>(Arrays.asList(array2[2]));

        System.out.println(lista);
        System.out.println(lista2);
    }
}
