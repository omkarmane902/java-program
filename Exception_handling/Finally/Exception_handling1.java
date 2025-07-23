package Finally;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_handling1 {
public static void main(String[] args) throws InterruptedException {
	try {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number ");
	int num = sc.nextInt();
	System.out.println("Enter the Denomater ");
	int num1 = sc.nextInt();
	sc.close();
	int ans = num/num1;
	
	System.out.println(ans);
	}
	catch(ArithmeticException e)
	{
	 System.out.println("do not divide by zero");	
	}
	catch(NullPointerException e)
	{
	 System.out.println("don't call an object member with ref");	
	}
	catch (InputMismatchException e) {
		System.out.println("Enter valid input to the scanner");
	}
	finally {
		System.out.println("finally block print");
		
	}
	
}
}
