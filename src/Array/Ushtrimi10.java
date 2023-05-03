package Array;
/*10. Write a Java program to find the maximum and minimum value of an array.*/
public class Ushtrimi10 {
    public static void main(String[] args) {




       int []myArray={6,2,3,4,5,6,66,8,9};
        int max=myArray[0];
        int min=myArray[0];


       for(int i=1;i< myArray.length;i++){
           if(myArray[i]>max){
               max=myArray[i];
           }else if (myArray[i]<min){
               min=myArray[i];
           }
       }
        System.out.println(max);
        System.out.println(min);

    }
}
