package StringExample;

import java.util.Scanner;

public class remove_word_from_give_string_without_inbuil_function {

	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the sentance : ");
		
		String  sentance = sc.nextLine();
		
		
		System.out.println("Enter the remove Char : "); 
		
		
		char  removechar = sc.nextLine().charAt(0);
		
		
		String ans = "";
		for( int i = 0 ; i <sentance.length(); i++ )
		{

			
			if (sentance.charAt(i)!= removechar)
			{
				ans += sentance.charAt(i);
			}
		}
		
		System.out.println(ans);
		
		
		
		
		sc.close();
	}
}
