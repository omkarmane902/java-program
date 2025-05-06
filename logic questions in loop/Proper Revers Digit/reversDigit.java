import java.util.Scanner;
class reversDigit
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int  number = sc.nextInt();
		
		int reversDigit = 0;
		
		while(number!=0)
		{
			reversDigit =  reversDigit * 10 + (number%10);
			number /= 10;
		}
		System.out.println("revers Digit");
		System.out.println(reversDigit);
	}
}