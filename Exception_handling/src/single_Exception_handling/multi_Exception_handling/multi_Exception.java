package multi_Exception_handling;


import java.util.InputMismatchException;
import java.util.Scanner;

public class multi_Exception {
 public static void main(String[] args) {
	
	 try {
		 Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the number");
			
			int num =  sc.nextInt();
			
			System.out.println("enter Denomiter Number");
			
			int num2 = sc.nextInt();
			
			
			int ans = num / num2;
			
			System.out.println(ans);
			
			sc.close();
	} catch (ArithmeticException e) {
		
		System.out.println("do not divide by zero");
	}
	 catch (NullPointerException e) {
		 System.out.println("don't call an object member with ref");
	}
	catch (InputMismatchException e) {
		System.out.println("Enter valid input to the scanner");
	}
	 System.out.println("code complete");
}
}
