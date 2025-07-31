package Autoboxing_autounboxing;

public class wrapper3 {

	
	public static void main(String[] args) {
		
		
		Object  a = 10; //autoboxing to integer & upcasted to object
		
		Object b = 20.0;  //autoboxing to Double & upcasted to object
		
		
		Object c = (Integer)a + (Double) b ;
		
		
	    System.out.println(c);
	}
}
