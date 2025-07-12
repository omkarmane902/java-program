package customize_tostring;



public class Employee {
	String name;
	int empId;
	String company;
	int exp;
	int sal;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	Employee(String name,int empId,String company,int exp,int sal)
	{
		this.name = name;
		this.empId = empId;
		this.company = company;
		this.exp = exp ;
		this.sal = sal;
	}
	public String toString()
	{
		return "name :"+name+",empId :" +empId+ ",company :" +company+ ",exp :" +exp+ ",sal :" +sal; 
	}
}
