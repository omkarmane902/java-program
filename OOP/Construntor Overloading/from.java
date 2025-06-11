class from
{
	String name ;
	int age;
	long phoneNo;
	String Email;
	String location;
	String Blood;
	long telephoneNo;
	String temperLocation;
	
	from()
	{
		
	}
	from(String name,int age,long phoneNo,String Email,String location)
	{
	   this.name = name;
       this.age = age;
       this.phoneNo = phoneNo;
       this.Email = Email;
       this.location = location;	   
	}
	from(String name,int age,long phoneNo,String Email,String location,String Blood)
	{
	   this.name = name;
       this.age = age;
       this.phoneNo = phoneNo;
       this.Email = Email;
       this.location = location;
       this.Blood = Blood;	   
	}
	from(String name,int age,long phoneNo,String Email,String location,String Blood,long telephoneNo)
	{
	   this.name = name;
       this.age = age;
       this.phoneNo = phoneNo;
       this.Email = Email;
       this.location = location;
       this.Blood = Blood;
       this.telephoneNo = telephoneNo;	   
	}
	from(String name,int age,long phoneNo,String Email,String location,String Blood,long telephoneNo,String temperLocation)
	{
	   this.name = name;
       this.age = age;
       this.phoneNo = phoneNo;
       this.Email = Email;
       this.location = location;
       this.Blood = Blood;
       this.telephoneNo = telephoneNo;
       this.temperLocation = temperLocation;	   
	}
	public void Displayfrom()
	{
		System.out.println("==========================================================");
		System.out.println("name :"+name);
		System.out.println("age :"+age);
		System.out.println("phoneNo :"+phoneNo);
		System.out.println("Email :"+Email);
		System.out.println("location :"+location);
		System.out.println("Blood :"+Blood);
		System.out.println("telephoneNo :"+telephoneNo);
		System.out.println("temperLocation :"+temperLocation);
		System.out.println("==========================================================");
		
	}
}