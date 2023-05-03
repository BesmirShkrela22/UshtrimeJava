package Array;

import java.util.Arrays;

/*16. Write a Java program to remove duplicate elements from an array.*/
public class Ushtrimi16 {
    public static void main(String[] args) {
        int[] array = {1,1, 2, 3, 4, 5, 4,1,6,5,9,9};
        System.out.println(Arrays.toString(array));
      int gjatesia= array.length;
        for (int i = 0; i < gjatesia; i++) {
            for (int j = 1 + i; j <gjatesia; j++)

                if (array[i] == array[j]) {
                    System.out.println(array[i] + " ");
                   break;


                }
        }

    }}