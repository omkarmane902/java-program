package Autoboxing_autounboxing;

public class wrapper {

	
	public static void main(String[] args) {
		
		
		Integer a = 10; // autoboxing
		
		int b = a;   //autounboxing
		
		
		
		System.out.println(a);
		
		System.out.println(b);
		System.out.println(a.toString());
		
		//System.out.println(b.toString());  give error
	}
}
