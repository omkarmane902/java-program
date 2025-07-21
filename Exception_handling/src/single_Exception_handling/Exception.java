package single_Exception_handling;

import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		System.out.println("Enter denomiter Number");
		
		int dig = sc.nextInt();
		try {
			int ans =  num/dig;
			System.out.println(ans);
		} catch (ArithmeticException e) {
			System.out.println("do not divide by zero");
		}
		
		
		sc.close();
		
	}
}
