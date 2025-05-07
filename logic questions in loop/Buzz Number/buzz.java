//A number that either ends in the digit 7 or is divisible by 7

import java.util.Scanner;
class buzz 
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int number = sc.nextInt();
		
		String answer = (number%7==0 ||number%10==7)?
		                ("It is buzz number"):
						("It is not buzz number");
						
		System.out.println(answer);				
	}
}
