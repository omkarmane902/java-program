package Lazy_instanciation_example_3;

public class human {
	String colour;
	double hight;
	double weight;
	
	hair h1;
	
	public  human()
	{
		
	}
	human(String colour,double hight,double weight)
	{
		this.colour = colour;
		this.hight = hight;
		this.weight = weight;
	}
	public void  hair(String haircolour, double length,String style) 
	{
		h1 =  new hair(haircolour,length,style);
	}
	public void displayhuman() 
	{
		System.out.println("colour :" + colour);
		System.out.println("hight :" + hight);
		System.out.println("weight :" + weight);
		System.out.println("======================");
	}
	
}
