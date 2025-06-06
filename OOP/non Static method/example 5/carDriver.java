class carDriver
{
	public static  void main (String[]args)
	{
		car c1 = new car();
		
		c1.brand = "Tata Nexon";
		c1.color = "Red";
        c1.engineCC = 1497;
        c1.year = 2024;
        c1.price = 900000.00;
		
		c1.displaycar();
		
	}
}