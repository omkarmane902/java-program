package Abstract;


public abstract class Calculator {
 
	public abstract void add( int a , int b);
	
	public abstract void sub( int a,int b); 
	
	public void multi( int a , int b) {
		 
		int res = a *b ;
		System.out.println(res);
	}
	
	public abstract void divi( int a , int b);
		
	
	
}
