package Inheritance;

public class Hierarchical_Inheritance_Driver {
	
	public static void main(String[] args) {
		
		Hierarchical_Inheritance_Child c1 = new Hierarchical_Inheritance_Child();
		
		c1.animal();
		c1.dog();
		
		
		Hierarchical_Inheritance_Child1 c2 = new Hierarchical_Inheritance_Child1();
		c2.animal();
		c2.cat();
		
	}

}
