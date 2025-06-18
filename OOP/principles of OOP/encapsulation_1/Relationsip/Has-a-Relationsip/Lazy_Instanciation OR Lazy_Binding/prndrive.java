package Lazy_instanciation;

public class prndrive {
    String brand;
    int memory;
    int speed;
    double price;
    
    public prndrive()
    {
    	
    }
    prndrive(String brand,int memory,int speed,double price)
    {
    	this.brand = brand;
    	this.memory = memory;
    	this.speed = speed;
    	this.price = price;
    }
    public void Displayprndrive() {
		System.out.println("brand :"+brand);
		System.out.println("memory :"+memory);
		System.out.println("speed :"+speed);
		System.out.println("price :"+price);
		System.out.println("========================================");
		
	}
}
