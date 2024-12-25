package java3_ObjectOrientedProgramming2;

public class L3_ObjectConstruction_CustomerAddress {
	private String addressLine1;
	//private String addressLine2;
	private String city;
	private String state;
	private int zip;
	
	//Address Constructor
	public L3_ObjectConstruction_CustomerAddress(String addressLine1, String city, String state, int zip) {
		super();
		this.addressLine1 = addressLine1;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
	public String toString(){
		return String.format("Address Line-1:%s, City:%s, State:%s, Zip:%d"
							,this.addressLine1, this.city,this.state,this.zip);
	}
}
