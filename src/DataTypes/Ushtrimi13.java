package DataTypes;
/*3. Write a Java program to compute the floor division and the floor modulus
of the given dividend and divisor. Go to the editor
        Click me to see the solution*/
public class Ushtrimi13 {
    public static void main(String[] args) {

int x=25;
int y=10;
        System.out.println(x/y);
        System.out.println(Math.floorDiv(x,y));
        System.out.println(x%y);
        System.out.println(Math.floorMod(x,y));

        System.out.println();
        System.out.println("Floor division using '/' operator: " + (x / y));
        System.out.println("Floor division using floorDiv() method is: " + Math.floorDiv(x, y));
        System.out.println();
        System.out.println("Floor modulus using '%' operator: " + (x % y));
        System.out.println("Floor modulus using floorMod() method is: " + Math.floorMod(x, y));




    }
}
