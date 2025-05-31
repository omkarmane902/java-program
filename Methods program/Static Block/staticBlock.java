class staticBlock
{
	static 
	{
	   System.out.println("This is main static block 1");	
	}
	public static void main(String[]args)
	{
		System.out.println("This is main block");
	}
	static 
	{
		System.out.println("This is main static block 2");
	}
	static 
	{
		System.out.println("This is main static block 3");
	}
	static 
	{
		System.out.println("This is main static block 4");
	}
}