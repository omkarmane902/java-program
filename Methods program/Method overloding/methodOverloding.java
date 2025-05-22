class methodOverloding
{
	public static void main (String [] args)
	{
		add('a','b','c');
	}
	public static void add(int a ,int b)
	{
		int ans = a + b ;
		System.out.println(ans);
	}
	public static void add(double a ,double b)
	{
		double ans = a + b ;
		System.out.println(ans);
	}
	public static void add(int a ,int b , int c)
	{
		int ans = a + b + c ;
		System.out.println(ans);
	}
}