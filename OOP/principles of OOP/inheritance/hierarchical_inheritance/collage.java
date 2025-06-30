package hierarchical_inheritance;

public class collage {
	String  collageName;
    int  collageCode;
    String collageGrade;
    String collageAddress;
    String collagePrinciple;
    String collageDept;
    
    
    public collage() {
		// TODO Auto-generated constructor stub
	}
    
    collage( String  collageName,int  collageCode,String collageGrade,String collageAddress,String collagePrinciple,String collageDept)
    {
    	this.collageName = collageName;
       	this.collageCode = collageCode;
       	this.collageGrade = collageGrade;
       	this.collageAddress = collageAddress;
       	this.collagePrinciple = collagePrinciple;
       	this.collageDept = collageDept;
    }
    public void displaycollage()
    {
    	System.out.println("collage Name :" + collageName);
		System.out.println("collage Code :" + collageCode);
		System.out.println("collageGrade :"+collageGrade);
		System.out.println("collageAddress :" + collageAddress);
		System.out.println("collagePrinciple :" + collagePrinciple);
		System.out.println("collageDept :" + collageDept);
		System.out.println("====================================");
    }
}
