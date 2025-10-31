package Polymorphism;

public class Constructor_Overloading {

	String name;
	int age ;
	
	public Constructor_Overloading() {
		
		System.out.println("this first Constructor with Zero parameter");
		
	}
	
	
	public Constructor_Overloading(String name) {
		 
		
		this.name = name;
		
		System.out.println("this second Constructor with one parameter");
		
	}
	
	public Constructor_Overloading(String name , int age) {
		 
		
		this.name = name;
		this.age = age;
		
		System.out.println("this third Constructor with two parameter");
		
	}
	
	
	public void Display() {
		
		
		System.out.println("Name : " + name + " Age  : " + age);
	}
	
	
	
	
}
