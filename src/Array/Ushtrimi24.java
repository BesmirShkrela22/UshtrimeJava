package Array;
/*Write a Java program to find a missing number in an array.*/
public class Ushtrimi24 {
    public static void main(String[] args) {

        int[]array={1,2,3,4,6,7,8};
    int misnumber=0;
        int gjatesiaarr=8;
        for(int i=0;i<=gjatesiaarr;i++){
            if(array[i]+1!=array[i+1]){


                   misnumber=array[i]+1;
                System.out.println(misnumber);
            }

        }

    }
}
