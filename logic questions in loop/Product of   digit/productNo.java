import java.util.Scanner;
class productNo
{
	public static void main (String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you number");
		int number = sc.nextInt();
		
		int product = 1;
		
		while(number!=0)
		{
			product = product * (number%10);
			number/=10;
		}
		System.out.println("product of digit is :"+product);
	}
}