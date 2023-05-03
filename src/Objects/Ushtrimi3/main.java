package Objects.Ushtrimi3;
/*3. Write a Java program to create a class called "Rectangle" with width and height attributes.
        Calculate the area and perimeter of the rectangle.*/
public class main {
    public static void main(String[] args) {
Rectangle drejtkendeshi=new Rectangle(19,14);

System.out.println("perimetri i"+ "drejtkendeshit eshte ;"+drejtkendeshi.siperfaqa());
System.out.println(drejtkendeshi.perimetri());

drejtkendeshi.setHeight(20);
drejtkendeshi.setWidth(20);

        System.out.println("perimetri i"+ "drejtkendeshit eshte ;"+drejtkendeshi.siperfaqa());
        System.out.println(drejtkendeshi.perimetri());




    }

}
