package Polymorphism;

public class Method_Shadowing_driver {

	
	public static void main(String[] args) {
		
		Method_Shadowing parent = new Method_Shadowing();
		
		Method_Shadowing_one child = new Method_Shadowing_one();
		
		Method_Shadowing ref = new Method_Shadowing_one(); 
		
		
		parent.name();
		
		child.name();
		
		ref.name();
	}
}
