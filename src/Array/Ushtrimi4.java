package Array;
/*4. Write a Java program to calculate the average value of array elements. Go to the editor*/
public class Ushtrimi4 {
    public static void main(String[] args) {

        double[] arraylist={10,10,10,10,10};

        double mesatarja;
        double shuma=0;

        for(int i=0;i< arraylist.length;i++){
            shuma=shuma+arraylist[i];

        }
        mesatarja=shuma/ arraylist.length;
        System.out.println("shuma e numrave eshte:"+ shuma);
        System.out.println("mesatarja e numrave eshte:"+ mesatarja);

    }
}








