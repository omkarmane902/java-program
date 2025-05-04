import java.util.Scanner;
class doWhileTable 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you number");
		int number = sc.nextInt();
		int initialValue = 1;
		
		do
		{
		System.out.println(number+"*"+initialValue+"="+(number*initialValue));
		initialValue++;
		}
		while(initialValue<=10);
	}
}
