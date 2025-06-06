class studentDataDrive
{
	public static void  main(String[]args)
	{
	studentData s1 = new studentData();
	
	s1.FullName = "omkar mane";
	s1.Age = 22;
	s1.Course = "computer engineering";
	s1.Percentage = 75.00;
	s1.Email = "omkarmane9617@gmail.com";
	s1.MobileNumber = 8625906485l;
	
	s1.DisplayStudent();
	
	System.out.println("-------------------------------------------------");
	
	s1.FullName = "Rahul Sharma";
	s1.Age = 20;
	s1.Course = "Electronics";
	s1.Percentage = 95.00;
	s1.Email = "rahulsharma9617@gmail.com";
	s1.MobileNumber = 9876543219l;
	
	s1.DisplayStudent();
	
	System.out.println("-------------------------------------------------");
	  
	s1.FullName = "Sneha Patil";
	s1.Age = 18;
	s1.Course = "Information Technology";
	s1.Percentage = 88.00;
	s1.Email = "snehapati521l@gmail.com";
	s1.MobileNumber = 9632147852l;
	
	s1.DisplayStudent();
	
	System.out.println("-------------------------------------------------");
	
	s1.FullName = "Anjali Verma";
	s1.Age = 23;
	s1.Course = "Electronics";
	s1.Percentage = 91.00;
	s1.Email = "anjaliverma521l@gmail.com";
	s1.MobileNumber = 9874123658l;
	
	s1.DisplayStudent();
     	
    }
}