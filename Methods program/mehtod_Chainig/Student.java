package mehtod_Chainig;

public class Student {

	String name;
	int age;
	String email;
	
	public Student  nameofstudent(String name)
	{
		this.name=name;
		System.out.println("Name :" +name);
		return this;
	}
	public Student ageofstudent(int age)
	{
	  	this.age =age;
	  	System.out.println("Age :" +age);
	  	return this;
	}
	public Student emailofstudent(String email)
	{
	  	this.email =email;
	  	System.out.println("Email :" +email);
	  	return this;
	}
	
}
