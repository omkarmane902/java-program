package Protected;

public class Student extends Person {

	public void display() {
		
		showName();
		System.out.println(name);
	 }

    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}

