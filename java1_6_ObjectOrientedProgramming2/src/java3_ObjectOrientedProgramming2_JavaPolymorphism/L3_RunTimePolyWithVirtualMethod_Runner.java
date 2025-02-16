package java3_ObjectOrientedProgramming2_JavaPolymorphism;

public class L3_RunTimePolyWithVirtualMethod_Runner {

	public static void main(String[] args) {
		
		L3_RunTimePolyWithVirtualMethod_Salary sal = 
						new L3_RunTimePolyWithVirtualMethod_Salary
							("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
		
				System.out.println("Call mailCheck using Salary reference --");
		sal.mailCheck();
		

		L3_RunTimePolyWithVirtualMethod_Employee emp = 
				new L3_RunTimePolyWithVirtualMethod_Salary
					("John Adams", "Boston, MA", 2, 2400.00);

		System.out.println("\n Call mailCheck using Employee reference--");
		emp.mailCheck();
	}

}
