package java3_ObjectOrientedProgramming2_Inheritance;

public class L1_StudentRunner {
public static void main(String[] args) {
	L1_Student student = new L1_Student("Atul Patel", 29, "java@mylearning.com", "UPES", 2014);
	
	System.out.println("Initial State:\n\t==>"+student);
	
	student.setContact(1234567890);
	student.setBranch("Electrical Engineering");
	System.out.println("State after updating more details:\n\t==>"+student);
	
}
}
