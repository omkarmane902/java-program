package Multilevel_Inheritance;

public class Department extends collage {
	
     String Departmentname;
     String DepartmentHod;
     int Departmenlec;
     int NoOfStudent;
     int seats;
     
     public Department() {
		// TODO Auto-generated constructor stub
	}
     Department(String universityname,String university_president,String university_location,int university_code, String university_type, String  collageName,int  collageCode,String collageGrade,String collageAddress,String collagePrinciple,String collageDept,String Departmentname,String DepartmentHod,int Departmenlec,int NoOfStudent,int seats)
     {
    	 this.universityname = universityname;
        	this.university_president = university_president;
        	this.university_location = university_location;
        	this.university_code = university_code;
        	this.university_type = university_type;
        	this.collageName = collageName;
        	this.collageCode = collageCode;
        	this.collageGrade = collageGrade;
        	this.collageAddress = collageAddress;
        	this.collagePrinciple = collagePrinciple;
        	this.collageDept = collageDept; 
        	this.Departmentname = Departmentname;
        	this.DepartmentHod = DepartmentHod;
        	this.Departmenlec = Departmenlec;
        	this.NoOfStudent = NoOfStudent;
        	this.seats = seats;
     }
     public  void DisplayDepartment() {
    	 Displyuniversity();
    	 Displaycollage();
		System.out.println("Department Name :" +Departmentname);
		System.out.println("Department Hod :" +DepartmentHod);
		System.out.println("Departmen lec :" +Departmenlec);
		System.out.println("No Of Student ;" + NoOfStudent);
		System.out.println("seats :" +seats);
		System.out.println("====================================");
	}
     

	
}
