package Count_of_digit;

import java.util.Scanner;

public class example {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Your Number");
	
	int num = sc.nextInt();
	
	int count = 0;
	
	while(num>0)
	{
		 num /=10;
		 
		 count ++;
	}
	System.out.println("Count No :" + count);
	sc.close();

 }
}
