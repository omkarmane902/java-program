class RecurssionMethodFact
{
	public static void main (String [] args)
	{
		fibo(10,0,1);
	}
	public static void fibo(int count , int n1, int n2 ) 
	{
		if(count >0) 
		{
		System.out.println(n1); 
		
		fibo (count-1, n2 , n1+n2);  
	    }
		
	}
	
	
}