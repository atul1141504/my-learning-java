package java3_ObjectOrientedProgramming2;

public class L3_ObjectConstruction_Customer {
	//State
	private String name;										//String type
	private L3_ObjectConstruction_CustomerAddress homeAddress;	//Object Type
	private L3_ObjectConstruction_CustomerAddress workAddress;	//Object Type
	
	//Constructor
	public L3_ObjectConstruction_Customer(String name, L3_ObjectConstruction_CustomerAddress homeAddress) {
		this.name = name;
		this.homeAddress = homeAddress;
	}

	//Getters & Setters for Home Address
	public L3_ObjectConstruction_CustomerAddress getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(L3_ObjectConstruction_CustomerAddress homeAddress) {
		this.homeAddress = homeAddress;
	}

	//Getters & Setters for Work Address
	public L3_ObjectConstruction_CustomerAddress getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(L3_ObjectConstruction_CustomerAddress workAddress) {
		this.workAddress = workAddress;
	}

	public String toString() {
		return String.format("Customer Name: %s, Customer Home Address:[%s], Customer Work Address:[%s]"
							,this.name,this.homeAddress,this.workAddress);
	}
}
