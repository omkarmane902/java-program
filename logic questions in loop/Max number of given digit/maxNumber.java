import java.util.Scanner;
class maxNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you number");
		int number = sc.nextInt();
		int max = 0;
		while(number>0)
		{
			int last = number%10;
			if(last>max)
			{
			   max = last ;	
			}
			number /=10;
		}
		System.out.println("max digit is :"+max);
	}
}