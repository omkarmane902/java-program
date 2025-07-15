package InterfaceExample_1;

public interface Calculator {
  
	public void add ( int a ,int b);
	
	public void sub(int a , int b);
	
	public void mul( int a ,int b);
	
	public static void div( int a , int b)
	{
	     int ans = a / b;
	     System.out.println(ans);   // don't assesse the this method in Calculator_Calculatorimp_driver  because Interface is only asses the declered method 
	}
		
	
} 
