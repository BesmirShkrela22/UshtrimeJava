package Objects.Ushtrimi13;

import java.util.ArrayList;

/*13. Write a Java program to create a class called "Inventory" with a collection of products and methods
        to add and remove products, and to check for low inventory.*/
public class Inventory {

   private ArrayList<Produktet>listaProdukteve;

   public Inventory() {
      listaProdukteve=new ArrayList<Produktet>();
   }


   public void addproduct(Produktet produkti){
      listaProdukteve.add(produkti);
   }
   public void remuveProduct(Produktet produkti){
      listaProdukteve.remove(produkti);
   }

   public  void checkinventory(){
      for(Produktet produkti:listaProdukteve){
   if(produkti.getQuantity()>100){
      System.out.println("jemi ok me sasite");
   }else
      System.out.println("sasia eshte e vogel");

      }
   }
}

