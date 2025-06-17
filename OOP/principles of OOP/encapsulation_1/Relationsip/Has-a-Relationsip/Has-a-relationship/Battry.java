package Has_a_relationship;

public class Battry {
	String name;
    double price;
    int MAH;
    String type;
    
    public Battry() {
		
	}
    Battry(String name,double price,int MAH,String type)
    {
  	 this.name = name;
  	 this.price = price;
  	 this.MAH = MAH;
  	 this.type = type;
    }
    public void DispayBattery() {
		
  	  System.out.println("Name :" + name);
  	  System.out.println("price :" + price);
  	  System.out.println("MAH :" + MAH);
  	  System.out.println("type :" + type);
  	  System.out.println("================================================");
  	  
	}
}
