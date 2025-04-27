import java.util.Scanner;
class table
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you number");
		int num = sc.nextInt();
		int n = 1;
		
		while(n<=10)
		{
			System.out.println(num+"*"+n+"="+(num*n));
			n++;
		}
		
		
	}
}