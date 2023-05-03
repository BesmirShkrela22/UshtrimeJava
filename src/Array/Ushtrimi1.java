package Array;

import java.util.Arrays;

/*1. Write a Java program to sort a numeric array and a string array. Go to the editor*/
public class Ushtrimi1 {
    public static void main(String[] args) {

       int [] array1 ={11,12,13,14,15,16,3,4,3,5,6,7,2,1};
       String []array2={"besi","ajna","bora",};
        System.out.println("Original numeric array : "+Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
        System.out.println("Original string array : "+Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Sorted string array : "+Arrays.toString(array2));

    }


}
