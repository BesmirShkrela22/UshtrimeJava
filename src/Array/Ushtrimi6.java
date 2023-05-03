package Array;
/*6. Write a Java program to find the index of an array element.*/
public class Ushtrimi6 {
    public static void main(String[] args) {

    int[]myarray={24,25,26,27,30};


        System.out.println(gjejindeksin(myarray,26));

    }

    public static int gjejindeksin(int[]myarray,int x) {
        //int i=0;
        int length = myarray.length;
        int numridhene = 0;
        int indexi=0;

        if (myarray == null) {
            return -1;
        }

        for (int i = 0; i < length; i++) {
            if (myarray[i] == x) {
                indexi = i;
                return i;

            }
        }
return indexi;



       /* if (my_array == null) return -1;
        int len = my_array.length;
        int i = 0;
        while (i < len) {
            if (my_array[i] == t) return i;
            else i=i+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.println("Index position of 25 is: " + findIndex(my_array, 25));
        System.out.println("Index position of 77 is: " + findIndex(my_array, 77));
    }

*/
    }
}
