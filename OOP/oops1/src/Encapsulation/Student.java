package Encapsulation;

public class Student {

	
	private String name ;
	
	private  int pass;
	
	int amount = 4000;
	
	public void setpass( int pass)
	{
		this.pass = pass;
		
		
	}
	
	public void setname(String name)
	{
		this.name = name;
	}
	
	public void setrollno(int rollno)
	{
	}
	
	
	
	
	public int getfee(String name , int pass)
	{
		 if(this.name == name && this.pass == pass)
		 {
			 return 3000;
		 }
		 return 000;
	}
	
	
	public void getpayfee(String name , int pass ,double fee )
	{
		if(this.name == name && this.pass == pass)
		{
			System.out.println("remaing fee : "+ (amount - fee) );
		}
	}
}
