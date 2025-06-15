package oop;

public class Drivestudent {
	public static void main(String [] args )
	{
		student s1 = new student("onkar mane",1234,"computer engineering",40000.0,9617,"omkarmane9617@gmail",8625906485l,"Yadrav");
		System.out.println(s1.getname());
		
		s1.changeaddress("Yadrav", "pune");
		System.out.println(s1.getaddress());
		
		s1.setfees(1234, 9617);
		s1.payfee(1234, 9617, 100);
		s1.setpin("onkar mane", 1234, 9617, 96177);
	}

}
