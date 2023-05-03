package Array;

import java.util.ArrayList;

/*21. Write a Java program to convert an ArrayList to an array.*/
public class Ushtrimi21 {
    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<String>();
        list.add("besi");
        list.add("ajna");


        String[]array=new String[list.size()];
        list.toArray(array);
        for(String string:array)


        System.out.println(string);
    }
}
