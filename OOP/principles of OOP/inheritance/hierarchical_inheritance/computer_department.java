package hierarchical_inheritance;

public class computer_department extends collage {
   String hod;
   int seat;
   int availableseat;
   int lec;
   
	public computer_department() {
		// TODO Auto-generated constructor stub
	}
	
	computer_department(String  collageName,int  collageCode,String collageGrade,String collageAddress,String collagePrinciple,String collageDept,String hod,int seat,int availableseat,int lec)
	{
		this.collageName = collageName;
       	this.collageCode = collageCode;
       	this.collageGrade = collageGrade;
       	this.collageAddress = collageAddress;
       	this.collagePrinciple = collagePrinciple;
       	this.collageDept = collageDept;
		this.hod = hod;
		this.seat = seat;
		this.availableseat = availableseat;
		this.lec = lec;
	}
	public void displaycomputer_department()
	{
		displaycollage();
		System.out.println("hod :" + hod);
		System.out.println("seat :" +seat);
		System.out.println("availableseat :"+ availableseat);
		System.out.println("lec :" + lec);
	}
	
	
}
