package Multilevel_Inheritance;

public class collage extends university {
       String  collageName;
       int  collageCode;
       String collageGrade;
       String collageAddress;
       String collagePrinciple;
       String collageDept;
       
       public collage() {
		// TODO Auto-generated constructor stub
	}
       collage(String universityname,String university_president,String university_location,int university_code, String university_type, String  collageName,int  collageCode,String collageGrade,String collageAddress,String collagePrinciple,String collageDept)
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
       }
       public void Displaycollage() {
    	   
    	Displyuniversity();
		System.out.println("collage Name :" + collageName);
		System.out.println("collage Code :" + collageCode);
		System.out.println("collageGrade :"+collageGrade);
		System.out.println("collageAddress :" + collageAddress);
		System.out.println("collagePrinciple :" + collagePrinciple);
		System.out.println("collageDept :" + collageDept);
		System.out.println("====================================");
	}
}
