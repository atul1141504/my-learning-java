package java3_ObjectOrientedProgramming2_Inheritance;

public class L1_Employee extends L1_Person {
	//State of this class
	private String companyName;
	private String lineOfBusiness;
	private String employeeGrade;
	
	//Constructor
	public L1_Employee(String name, int age, String email, String companyName, String employeeGrade) {
		/*	Note: the default Constructor is Super(),
		**	if not included JVM by default inherits from Super class
		**	Since in parent class there are 3 mandatory parameters present, 
		**		super is invoked with the required parameters instead of empty. 
		*/
		super(name, age, email);
		this.companyName = companyName;
		this.employeeGrade = employeeGrade;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getLineOfBusiness() {
		return this.lineOfBusiness;
	}

	public void setLineOfBusiness(String lineOfBusiness) {
		this.lineOfBusiness = lineOfBusiness;
	}

	public String getEmployeeGrade() {
		return this.employeeGrade;
	}

	public void setEmployeeGrade(String employeeGrade) {
		this.employeeGrade = employeeGrade;
	}
	
	public String toString() {
		return String.format(super.toString() + 
						"\n\tfrom Employee class==> Company name:%s, LineOfBusiness:%s, Employee Grade: %s"
						,this.companyName, this.lineOfBusiness, this.employeeGrade);
	}
}
