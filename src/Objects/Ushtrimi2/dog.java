package Objects.Ushtrimi2;
/*2. Write a Java program to create a class called "Dog" with a name and breed attribute.
        Create two instances of the "Dog" class, set their attributes using the constructor and modify the attributes
        using the setter methods and print the updated values.*/
public class dog {

   public String breed;
   public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public dog(String breed,String name){
       this.breed=breed;
       this.name=name;
   }



}
