package InterfaceExample_1;

public  class CalculatorImp implements Calculator {

	
	public void add(int a, int b) {
		
		int ans = a + b;
		System.out.println(ans);
		
	}

	
	public void sub(int a, int b) {
		

		int ans = a - b;
		System.out.println(ans);
	}

	
	public void mul(int a, int b) {
		

		int ans = a * b;
		System.out.println(ans);
	}
	
   
	
	
     
}
