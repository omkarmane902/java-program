package Inheritance;

public class Single_Level_Inheritance {

	String name;
	int age;
	String addr;
	
	
	public Single_Level_Inheritance(String name,int age,String addr) {
		
		  this.name =name;
		  this.age = age ;
		  this.addr = addr;
	}
	
	
	
	void display ()
	{
		System.out.println(name);
		
		System.out.println(age);
		
		System.out.println(addr);
		
	}
	  
	
}
