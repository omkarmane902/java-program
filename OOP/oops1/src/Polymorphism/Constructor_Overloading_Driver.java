package Polymorphism;

public class Constructor_Overloading_Driver {

	
	public static void main(String[] args) {
		
		Constructor_Overloading c1 = new Constructor_Overloading("omkar");
		
		c1.Display();
		
		
		
		Constructor_Overloading c2 = new Constructor_Overloading("omkar", 22);
		
		c2.Display();
		
		
		Constructor_Overloading c3 = new Constructor_Overloading();
		
		c3.Display();
        
	}
}
