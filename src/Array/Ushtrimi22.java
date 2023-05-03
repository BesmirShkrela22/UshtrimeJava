package Array;
/*22. Write a Java program to find all pairs of elements in an array whose sum is equal to a specified number*/
public class Ushtrimi22 {
    public static void main(String[] args) {


      specifikNumber(new int[]{2,3,1,4,5,7},8);

       /* for(int i=0;i< array.length;i++){
            for(int j=1+i;j< array.length;j++){
                if( array[i]+array[j]==specifik){


                    System.out.println("numrat specifik jane:"+array[j]);
                    System.out.println("numrat specifik jane:"+array[i]);
                }

            }

        }*/

    }

    public static void specifikNumber(int []array,int input){

      for(int i=0;i< array.length;i++){
          for(int j=i+1;j< array.length;j++){
              if(array[i]+array[j]==input){
                  System.out.println(array[i]+" + "+array[j]+" =  "+input);
              }

          }
      }

    }



}
