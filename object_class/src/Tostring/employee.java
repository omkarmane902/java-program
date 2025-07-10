package Tostring;



public class employee {
	String name;
	int empId;
	String company;
	int exp;
	int sal;
	
	
	public employee() {
		// TODO Auto-generated constructor stub
	}
	employee(String name,int empId,String company,int exp,int sal)
	{
		this.name = name;
		this.empId = empId;
		this.company = company;
		this.exp = exp ;
		this.sal = sal;
	}
	
	public void displayemployee() {
		System.out.println(name);
		System.out.println(empId);
		System.out.println(company);
		System.out.println(exp);
		System.out.println(sal);
	}
}
