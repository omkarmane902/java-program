class Car 
{
	String name = "maruti car";
	double price =400000;
	String colour = "blue"; 
	
	public void displayCar()
	{
	   String name = "kidnap car";	
	   
	   System.out.println("name :" + name);
	   System.out.println("price :"+price);
	   System.out.println("name:"+ this.name);
	   System.out.println("price :"+price);
	   System.out.println("colour :"+colour);
	   System.out.println(this);
	   
	}
}
