package java3_ObjectOrientedProgramming2_JavaInterface;

//Interface declaration: by first user  
interface Bank {
	float rateOfInterest();
}

//Implementation: by second user  
class SBI implements Bank {
	public float rateOfInterest() {
		return 9.15f;
	}
}

class PNB implements Bank {
	public float rateOfInterest() {
		return 9.70f;
	}
}

//Using interface: by third user  
public class L2_InterfaceExample3_BankROI {
	public static void main(String[] args) {
		Bank b = new SBI();
		System.out.println("SBI ROI: " + b.rateOfInterest());
		
		Bank c = new PNB();
		System.out.println("PNB ROI: " + c.rateOfInterest());
		
	}

}
