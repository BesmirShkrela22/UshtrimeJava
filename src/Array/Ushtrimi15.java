package Array;

import java.util.Arrays;

/*15. Write a Java program to find the common elements between two arrays of integers*/
public class Ushtrimi15 {
    public static void main(String[] args) {

        int []array1={1,2,3,4,1};
        int []array2={3,4,5,6,7};
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        for(int i=0;i< array1.length;i++){
            for(int j=0;j< array2.length;j++){
                if(array1[i]==array2[j] ){
                    System.out.println(array2[j]);
                }
            }
        }

    }
}
