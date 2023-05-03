package Objects.Ushtrimi4;
/*4. Write a Java program to create a class called "Circle" with a radius attribute. You can access and modify this attribute.
        Calculate the area and circumference of the circle*/
public class Circle {
    private double radius;


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius){
        this.radius=radius;
    }
    public double Circumference(){
       return 2* Math.PI *radius;
    }
public double area(){
        return Math.PI*radius*radius;
}

}
