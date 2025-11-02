package Upcasting;

public class Driver {

	
	public static void main(String[] args) {
		
		  parent p1 = new Child();
		  
		  p1.parentMethod();
		  
		  //p1.ChildMethod()     not working because of Upcasting   
		
	}
}
