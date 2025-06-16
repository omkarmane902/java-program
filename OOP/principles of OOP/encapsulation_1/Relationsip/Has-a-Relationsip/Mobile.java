package RelationShip;



public class Mobile {
	String brand;
	String name;
	double price;
	int ram;
	int rom;
	String processor;
	
	public Mobile() {
		 
	}
	Battery b1 = new Battery("Exide",1500.0,5000,"li-ion");
	
	Mobile(String brand,String name,double price,int ram,int rom,String processor)
	{
		this.brand = brand;
		this.name = name;
		this.price = price;
		this.ram = ram;
		this.rom = rom;
		this.processor = processor;
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
