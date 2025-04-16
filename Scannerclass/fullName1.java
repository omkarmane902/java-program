import java.util.Scanner;

class fullName1
{	
public static void main (String [] args)
{
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("Enter your first name :");
	String firstName = sc.next();
	
	System.out.println("Enter your Last name :");
	String lastName = sc.next();
	
	String ans = firstName+ " " +lastName;
	System.out.println(ans);
}
}