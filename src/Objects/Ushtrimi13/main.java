package Objects.Ushtrimi13;

public class main {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();

Produktet prod1=new Produktet("cokollata",120);
inventory.addproduct(prod1);
Produktet prod2=new Produktet("pije",90);
inventory.addproduct(prod2);
inventory.checkinventory();
        System.out.println(prod1.getQuantity());
        System.out.println(prod2.getQuantity());
        System.out.println();
    }
}
