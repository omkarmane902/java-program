class staticBlock
{
	static int a;
	static 
	{
	    System.out.println(a);
		System.out.println("Static Block");	
		test();
	}
	
	
	public static void main (String[]args)
	{
		System.out.println("main Block");
		test2();
	}
	public static void test()
	{
		System.out.println("Test block");
	}
	public static void test2()
	{
		System.out.println("test2 block");
	}
}