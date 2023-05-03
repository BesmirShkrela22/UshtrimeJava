package Objects.Ushtrimi2;
/*2. Write a Java program to create a class called "Dog" with a name and breed attribute.
        Create two instances of the "Dog" class, set their attributes using the constructor and modify the attributes
        using the setter methods and print the updated values.*/
public class main {
    public static void main(String[] args) {

        dog qeni1=new dog("doberman","lesi");
       // qeni1.breed=("pitbull");

        qeni1.setBreed("pitbulli");
        System.out.println(qeni1.breed+" "+ qeni1.getName());
    }
}
