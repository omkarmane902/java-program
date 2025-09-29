package Static_Variable;

public class Static2 {

	static String name = "Dhanaji mane";
	
	static int age = 55;
	
	
	void nonststicmethod()
	{
		System.out.println(Static2.name);
		
		System.out.println(Static2.age);
	}
	
	
	public static void main(String[] args) {
		 
	    Static2 obj = new Static2();
	    
	    obj.nonststicmethod();
		
	}
	
}
