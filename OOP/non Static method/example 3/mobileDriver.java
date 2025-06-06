class mobileDriver
{
	public static void main(String[]args)
	{
		mobile m1 = new  mobile ();
		 
		m1.brand = "Samsung";
		m1.Color = "Phantom Black";
		m1.DisplaySize = 6.8;
		m1.Storage = 256;
		m1.Camera = 108;
		m1.WarrantyYerar = 2;
		m1.RAM = 12;
		m1.ROM = 256;
		m1.price = 1199.99;
		
		m1.displayMobile();
		
		System.out.println("---------------------------------------------------------------");
		
		m1.brand = "Apple";
		m1.Color = "Midnight";
		m1.DisplaySize = 6.1;
		m1.Storage = 128;
		m1.Camera = 48;
		m1.WarrantyYerar = 1;
		m1.RAM = 6;
		m1.ROM = 128;
		m1.price = 11999.99;
		
		m1.displayMobile();
		
		System.out.println("---------------------------------------------------------------");
		
		m1.brand = "OnePlus";
        m1.Color = "Glacial Green";
        m1.DisplaySize = 6.7;
        m1.Storage = 256;
        m1.Camera = 50;
        m1.WarrantyYerar = 1;
        m1.RAM = 8;
        m1.ROM = 256;
        m1.price = 8499.00;
		
		m1.displayMobile();
		
		
	   System.out.println("---------------------------------------------------------------");
	   
	   m1.brand = "Xiaomi";
       m1.Color = "Ocean Blue";
       m1.DisplaySize = 6.5;
       m1.Storage = 128;
       m1.Camera = 64;
       m1.WarrantyYerar = 1;
       m1.RAM = 6;
       m1.ROM = 128;
       m1.price = 5999.99;
	   
	   m1.displayMobile();
			
			
		
	}
}