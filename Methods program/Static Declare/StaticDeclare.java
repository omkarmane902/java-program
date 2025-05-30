class StaticDeclare
{
	static double pi = 22.0/7.0;
	public static void main(String[] args)
	{
		System.out.println(pi);
		areaOfCircle(100);
		perimeticOfCircle(100);
	}
	public static void areaOfCircle(double red)
	{
		double area = pi * (red*red);
		System.out.println(area);
	}
	public static void perimeticOfCircle(double red)
	{
		double perimetic = 2 * pi * red ;
		System.out.println(perimetic);
	}
}