package Objects.ushtrimi1;
/*Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of
        the "Person" class, set their attributes using the constructor, and print their name and age.*/
public class person {

    String name;
    int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public person(String name, int age){
        this.name=name;
        this.age=age;

    }

}
