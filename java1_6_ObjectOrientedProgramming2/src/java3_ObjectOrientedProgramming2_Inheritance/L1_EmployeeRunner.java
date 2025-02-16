package java3_ObjectOrientedProgramming2_Inheritance;

public class L1_EmployeeRunner {

	public static void main(String[] args) {
		L1_Employee employee = new L1_Employee("Atul Patel", 29, "ap@my-org.com","TSYS","GB-5");
		System.out.println("Initial State:\n\t"+employee);
		
		employee.setContact(1999999999);
		employee.setLineOfBusiness("Card Management");
		System.out.println("\nState after updating more details:\n\t"+employee);
	}

}
