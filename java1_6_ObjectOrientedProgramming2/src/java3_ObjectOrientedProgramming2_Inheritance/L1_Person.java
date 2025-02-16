package java3_ObjectOrientedProgramming2_Inheritance;

public class L1_Person {
	//State
	private String name;
	private int age;
	private String email;
	private int contact;
	
	//Constructor with mandatory variables
	public L1_Person(String name, int age, String email) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
	}

	//Methods: to change Behavior except name & age. so name age will have only getters.
	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getContact() {
		return this.contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}
	
	public String toString() {
		return String.format("from Parent  class==> Name:%s, Age:%d, Email:%s, Contact:%d",
								this.name, this.age, this.email, this.contact);
	}
}
