package Multilevel_Inheritance;



public class university {
     String universityname;
     String university_president;
     String university_location;
     int university_code;
     String university_type;
     
     public university() {
		// TODO Auto-generated constructor stub
	}
     
    university(String universityname,String university_president,String university_location,int university_code, String university_type)
    {
    	this.universityname = universityname;
    	this.university_president = university_president;
    	this.university_location = university_location;
    	this.university_code = university_code;
    	this.university_type = university_type;
    }
    public  void Displyuniversity() {
    	System.out.println("university name :" + universityname);
		System.out.println("university president :" + university_president);
		System.out.println("university location :" + university_location);
		System.out.println("university code :" + university_code);
		System.out.println("university type :" + university_type);
		System.out.println("====================================");
		
	}
}