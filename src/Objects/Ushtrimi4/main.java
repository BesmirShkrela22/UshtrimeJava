package Objects.Ushtrimi4;
/*4. Write a Java program to create a class called "Circle" with a radius attribute. You can access and modify this attribute.
        Calculate the area and circumference of the circle*/
public class main {
    public static void main(String[] args) {

        Circle rrethi=new Circle(25);
rrethi.setRadius(4);
        System.out.println(rrethi.area());
        System.out.println(rrethi.Circumference());

    }
}
