package Objects.Ushtrimi3;
/*3. Write a Java program to create a class called "Rectangle" with width and height attributes.
        Calculate the area and perimeter of the rectangle.*/
public class Rectangle {

private int width=12;
public int height=15;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Rectangle(int width, int height)  {

     this.width=width;
     this.height=height;

 }

 public int siperfaqa(){
        return width*height;

 }
 public int perimetri(){
        return 2*(width+height);
 }



}
