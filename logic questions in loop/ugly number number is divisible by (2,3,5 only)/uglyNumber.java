import java.util.Scanner;
class uglyNumber
{
	public static void main(String[]args)
    {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter you number");
		int number = sc.nextInt();
		
		while (number>1)
		{
			if(number%2==0)
			{
				number/=2;
			}
			else if (number%3==0)
			{
				number/=3;
			}
			else if (number%5==0)
			{
				number/=5;
			}
			else
			{
				break;
			}
		}
		if (number==1)
			{
			System.out.println("This is ugly Number");	
			}
			else
			{
				System.out.println("This is not ugly Number");
			}
	}
}