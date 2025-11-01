package Encapsulation;

public class StudentDriver {

	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		s1.setname("omkar");
		s1.setpass(9617);
		
		
		System.out.println(s1.getfee("omkar", 9617));
		
		s1.getpayfee("omkar", 9617, 200);
	}
}
