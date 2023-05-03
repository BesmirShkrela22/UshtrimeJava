package Array;

import java.util.Arrays;

import static java.util.Arrays.*;

/*17. Write a Java program to find the second largest element in an array.*/
public class Ushtrimi17 {
    public static void main(String[] args) {

        int[] array = {10000000, 33333, 8879999, 888888, 900999, 4555};
        int max = array[0];
        int max2 = array[0];


        for (int i = 0; i < array.length; i++) {
            for(int j=0;j< array.length;j++)
            if(array[i]>max){
                max=array[i];
            }else if(array[j]>array[i] && array[j]<max){
                max2=array[j];
            }

        } System.out.println(max);
        System.out.println(max2);
    }
}
