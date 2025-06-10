class shoe
{
	String brand;
    double price;
    int size;
    String type;
    String color;

    shoe()
	{
		
	}	
	shoe(String brand,double price,int size,String type,String color)
	{
		this.brand = brand;
		this.price = price;
		this.size = size;
		this.type = type;
		this.color = color;
	}
	public void displayShoe()
	{
		System.out.println("brand :"+ brand);
		System.out.println("price :"+ price);
		System.out.println("size :"+ size);
		System.out.println("type :"+ type);
		System.out.println("color :"+ color);
	}
}