package java3_ObjectOrientedProgramming2_Inheritance;

public class L1_Student extends L1_Person {

	private String collegeName;
	private int year;
	private String branch;

	public L1_Student(String name, int age, String email, String collegeName, int year) {
		/*	Note: the default Constructor is Super(),
		**	if not included JVM by default inherits from Super class
		**	Since in parent class there are 3 mandatory parameters present, 
		**		super is invoked with the required parameters instead of empty. 
		*/
		super(name, age, email);
		this.collegeName = collegeName;
		this.year = year;
	}

	public String getCollegeName() {
		return this.collegeName;
	}

	public int getYear() {
		return this.year;
	}

	public String getBranch() {
		return this.branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	public String toString() {
		return String.format(super.toString() + "\n\t   from Student class==> College:%s, Year:%d, Stream:%s",
								this.collegeName, this.year, this.branch);
	}

}
