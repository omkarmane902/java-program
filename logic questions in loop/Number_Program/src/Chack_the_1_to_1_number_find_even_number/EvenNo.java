package Chack_the_1_to_1_number_find_even_number;

import java.util.Scanner;

public class EvenNo {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter You Number");
		
		int value = sc.nextInt();
		int count = 0;
		while (value>0) {
			 
			int last = value % 10 ;
			
			if(last % 2 == 0)
			{
				System.out.println("Even No :" +last);
				count ++;
			}
			value = value /10;
			
			
		}
		System.out.println("count :"+count);
		sc.close();
	}
}
