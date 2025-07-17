package InterfaceExample_3;

public class sonDriver {
    public static void main(String[] args) {
	 Father f1 =new son();   
	 f1.massage();
	 
	 f1.money();
	 System.out.println("Marks Father :" +Father.marks);
	 System.out.println("Marks Mother :" + mother.marks);
	 
	
	 
	mother.note();

    }
}
