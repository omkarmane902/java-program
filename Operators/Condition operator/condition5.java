import java.util.Scanner;
class condition5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your value");
		
		char value = sc.next().charAt(0);
		
		String  op =(value >=48 && value<=57)?( value+ " thise is number"):( value+ " this is not number");
		System.out.println(op);
	}
	
}