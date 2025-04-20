import java.util.Scanner;
class condititon4
{
	public static void main(String[]args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your value");
	char value = sc.next().charAt(0);

	String op =(value>='A' && value<='Z')?( value+ " it is uppercase value" ):(value+ " it is lowercase value");
	System.out.println(op);
	}
}