import java.util.Scanner;
class factors
{
	public static void main (String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you number");
		int number = sc.nextInt();
		
		for(int start = 1; start<=number; start++)
		{
			if(number%start==0)
			{
				System.out.println(number+" factors is : " +start);
			}
		}
		
	}
}