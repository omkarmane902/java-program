package Has_a_relationship;



public class Mobile {
	String brand;
	String name;
	double price;
	int ram;
	int rom;
	String processor;
    
	Battry b1;
	
	public Mobile() {
		 
	}
	
	
	Mobile(String brand,String name,double price,int ram,int rom,String processor,String batteryname, double batteryprice,int MAH,String type)
	{
		this.brand = brand;
		this.name = name;
		this.price = price;
		this.ram = ram;
		this.rom = rom;
		this.processor = processor;
		
		b1=new Battry(batteryname,batteryprice,MAH,type);
	}
	public void DisplayMobile()
	{
		System.out.println("brand :" + brand);
		System.out.println("name :" + name);
		System.out.println("price :" + price);
		System.out.println("ram :" + ram);
		System.out.println("rom :" + rom);
		System.out.println("processor :" + processor);
		 System.out.println("================================================");
	}

}
