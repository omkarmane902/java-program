package Upcasting;

public class Test {
	
	public static void main(String[] args) {
		
		Animal a = new Dog(); // Upcasting
		
		a.eat();  // Allowed
		
		// a.bark(); ❌ Not allowed
		
		a.name();  //  we can achive overriding method   
		
	}

}
