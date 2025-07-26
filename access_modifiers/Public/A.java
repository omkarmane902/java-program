package Public;



public class A {
 
	public static int num = 10;
	
	public double digit = 10.00;
	
	public A()
	{
		
	}
	
	public void test()
	{
		System.out.println("this is non-static method");
	}
	
	public static void test2()
	{
	System.out.println("this is static method");	
	}
	
	public static void main(String[] args) {
		
		System.out.println(A.num);
		
		
		//System.out.println(digit);
		
		//test();
		
		A.test2();
		
	}
	
	
	
}
