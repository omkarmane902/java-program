package Lazy_instanciation_example_2;



public class Pen {
   String brand;
   double price;
   String colour;
   String size;
   
   Refill r;
   
   public Pen()
   {
	   
   }
   Pen(String brand,double price,String colour,String size)
   {
	  this.brand = brand;
	  this.price = price;
	  this.colour = colour;
	  this.size = size;
   }
   public void Refill(String brand,double price,String inkcolour,String size)
   {
	   r = new Refill(brand,price,inkcolour,size);
   }
  public void DisplayPan()
   {
	   System.out.println("brand :" +brand);
	   System.out.println("price :"+ price );
	   System.out.println("colour :" + colour);
	   System.out.println("size" +size);
	   System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

   }
}
