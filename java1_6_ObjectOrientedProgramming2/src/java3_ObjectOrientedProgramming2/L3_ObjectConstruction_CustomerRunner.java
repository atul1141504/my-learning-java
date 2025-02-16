package java3_ObjectOrientedProgramming2;

public class L3_ObjectConstruction_CustomerRunner {
	public static void main(String[] args) {
		String name = "Atul Patel";
		L3_ObjectConstruction_CustomerAddress homeAddress = new L3_ObjectConstruction_CustomerAddress("HS-121,Murlipur","Lucknow","Uttar Pradesh",123456);
		L3_ObjectConstruction_CustomerAddress workAddress = new L3_ObjectConstruction_CustomerAddress("Stellar-IT","Noida","UP",987654);
		L3_ObjectConstruction_Customer customer = new L3_ObjectConstruction_Customer(name,homeAddress);
		
		System.out.println("Initial State: \n\t==> " + customer);
		
		customer.setWorkAddress(workAddress);
		System.out.println("State after Setting Work Address: \n\t==> " + customer);
		
		customer.setHomeAddress(new L3_ObjectConstruction_CustomerAddress("My Address Line1","Greater Lucknow","UP-32",343434));
		System.out.println("State after changing Home Address: \n\t==> " + customer);
		
	}

}
