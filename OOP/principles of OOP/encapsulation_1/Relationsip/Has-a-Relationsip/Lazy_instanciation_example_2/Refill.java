package Lazy_instanciation_example_2;

public class Refill {
      String brand;
      double price;
      String inkcolour;
      String size;
      
      
      public Refill()
      {
    	  
      }
      
      Refill(String brand, double price, String inkcolour,String size)
      {
    	  this.brand = brand;
    	  this.price = price;
    	  this.inkcolour = inkcolour;
    	  this.size = size;
      }
      public void displayRefill()
      {
    	  System.out.println("Brand :" + brand);
    	  System.out.println("price :"+price);
    	  System.out.println("inkcolour :" + inkcolour);
    	  System.out.println("size :" +size);
    	  System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
      }
}
