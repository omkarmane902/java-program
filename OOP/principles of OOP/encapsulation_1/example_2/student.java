package oop;

public class student {
	
	 private String name;
	    private int rollNo;
	    private String course;
	    private double fees;
	    private int pin;
	    private String email;
	    private long contact;
	    private String address;
	    
	    public student()
	    {
	    	
	    }
     
	     student(String name,int rollNo,String course,double fees,int pin,String email,long contact,String address)
	    {
	    	this.name =name;
	    	this.rollNo =rollNo;
	    	this.course = course;
	    	this.fees =fees;
	    	this.pin =pin;
	    	this.email = email;
	    	this.contact = contact;
	    	this.address = address;
	    	
	    }
	     public String getname()
	     {
	    	 return name;
	     }
	     public int getrollNo()
	     {
	    	 return rollNo;
	     }
	     public String getcourse()
	     {
	    	 return course;
	     }
	     public double setfees(int rollNo,int pin)
	     {
	    	 if(this.rollNo == rollNo && this.pin == pin)
	    	 {
	    		 System.out.println(fees);
	    		 return fees;
	    		 
	    		 
	    	 }
	    	 else
	    	 {
	    		 System.out.println("Invalid credentials!");
	    		 return 0;
	    	 }
	    	 
			 
	     }
	     public void payfee(int rollNo,int pin, double amount)
	     {
	    	 if(this.rollNo == rollNo && this.pin == pin)
	    	 {
	    		 System.out.println("login successful!");
	              
	    		 if(amount >0)
	    		 {
	    			 this.fees = fees - amount;
	    			 System.out.println(fees);
	    			 System.out.println("payment successful!");
	    			 
	    			 
	    		 }
	    		 else
	    		 {
	    			 System.out.println("Something is wrong"); 
	    		 }
	    		 
	    	 }
	    	 else
	    	 {
	    	 System.out.println("Invalid credentials!"); 
	    	 }
	     }
	     
	     {
	    	 
	     }
	     public void setpin(String name,int rollNo,int oldpin,int newpin)
	     {
	    	 if ( this.name == name &&  this.pin == oldpin )
	    	 {
	 
	    	    this.pin = newpin;
	    	     System.out.println("pin is successful change!");
	    	     
	    	 }
	    	 else 
	    	 {
	    		 System.out.println("Invalid credentials!");
	    	 }
	    	 
	     }
	     public String getemail()
	     {
	    	 return email;
	     }
	     public long getcontact()
	     {
	    	return contact; 
	     }
	     public String getaddress()
	     {
	    	return address; 
	     }
	     public void changeaddress(String oldaddress , String newaddress )
	     {
	    	 if(this.address==oldaddress)
	    	 {
	    		 this.address = newaddress;
	    		 System.out.println("Address is successful change!");
	    	 }
	     }
	     
}
