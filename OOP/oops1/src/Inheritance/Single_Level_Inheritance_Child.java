package Inheritance;

public class Single_Level_Inheritance_Child extends Single_Level_Inheritance {
	
	String Schoolname;
	int studentcount;
	
	
	
	
	public Single_Level_Inheritance_Child( String name,int age,String addr,String Schoolname,int studentcount) {
		super(name, age,addr);
		this.Schoolname = Schoolname;
		this.studentcount = studentcount;
		
		
		
	}
	
	void school ()
	{
	   System.out.println(Schoolname);	
	   System.out.println(studentcount);
	}

}
