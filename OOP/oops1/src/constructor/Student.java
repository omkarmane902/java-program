package constructor;

public class Student {

	
	String name ;
	
	int rollnum;
	
	
	public Student(String name , int rollnum) {

       this.name = name;
       this.rollnum = rollnum;
	}
	
	
	public void StudentInfo() {
		
		
		System.out.println(name);
		System.out.println(rollnum);
		
	}
	
	
}
