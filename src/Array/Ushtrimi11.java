package Array;

import java.util.Arrays;

/*10. Write a Java program to find the maximum and minimum value of an array.*/
public class Ushtrimi11 {
    public static void main(String[] args) {

        int[]lista={1,2,3,4,9,23,24,1,25,474,34,3456};
        System.out.println(Arrays.toString(lista));

        int ktheNumrin=0;
        int numri= lista.length;

        for(int i=numri-1;i>=0;i--){
            numri--;
            ktheNumrin=lista[i];

            System.out.print(ktheNumrin +" ");

        }

    }
}
