package Downcasting;

public class DowncastingExample {

	
	public static void main(String[] args) {
		
		Animal a = new Dog(); // Upcasting
		
		
		Dog d = (Dog) a ;// Downcasting: Parent → Child
		
		d.eat();
		
		d.bark();
		
		d.name();
		
		
		
	}
}
