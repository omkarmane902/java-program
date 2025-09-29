package Static_Method;

public class Static_Method2 {

	
	
	static void method()
	{
		System.out.println("This is Static method ");
		
		Static_Method2 obj = new Static_Method2();
		
		obj.nonStaticmethod();
		
		
	}
	
	
	void nonStaticmethod()
	{
		System.out.println("This is Non Static method ");
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		method();
		
	}
}
