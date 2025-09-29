package Static_Block;

public class StaticBlock2 {

	static String name;
	
	static {
		
		name = "omkar mane";
		System.out.println("This is static block ");
		
		method();
	}
	
	
	static void method()
	{
		 System.out.println("This is static method ");
		 
		 
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("This is main Block  ");
		System.out.println(name);
		
	}
}
