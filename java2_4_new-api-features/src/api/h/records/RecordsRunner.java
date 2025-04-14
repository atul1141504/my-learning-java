package api.h.records;

public class RecordsRunner {
	record Person(String name, String email, String contact) {}

	/* Creating Constructors to add validations
	 * Also Instance Methods can be added.
	 */
	record PersonA(String name, String email, String contact) {
		PersonA(String name, String email, String contact) {
			if (name == null) {
				throw new IllegalArgumentException("Name is null");
			}
			this.name = name;
			this.email = email;
			this.contact = contact;
		}
		
		public String name() {
			return name;
			
		}
	}

	/* Creating a Compact Custom Constructor equivalent for the above one
	 * for a Compact Constructor, arguments & the this variables are not required
	 * 
	 * Compact Constructors are allowed only in Records.
	 */
	record PersonB(String name, String email, String contact) {
		PersonB{
			if (name == null) {
				throw new IllegalArgumentException("Name is null");
			}
		}
		//
		public String name() {
			return name;
			
		}
	}

	public static void main(String[] args) {
		/*
		 * When we create a record, > public Accessor methods > constructors, equals
		 * HashCode & toString methods are auto created for records. We can also create
		 * custom implementations.
		 * 
		 * The default constructor is created as follows: record Person(String name,
		 * String Email, String contact) {}
		 * 
		 * But if we wish to add additional validations that can be done as well
		 */
		Person person1 = new Person("Atul", "atul1141504@gmail.com", "9919788816");
		Person person2 = new Person("Atul", "atul1141504@gmail.com", "9919788816");
		Person person3 = new Person("Atul1", "atul1141504@gmail.com", "9919788816");

		/*
		 * Print Person record & use public accessor methods to print details like Name,
		 * Email & Contact
		 */
		System.out.println("Record of person1: " + person1);
		System.out.println("\tName of person1   : " + person1.name());
		System.out.println("\tEmail of person1  : " + person1.email());
		System.out.println("\tContact of person1: " + person1.contact());

		System.out.println("is person1==person2 => " + person1.equals(person2));
		System.out.println("is person1==person3 => " + person1.equals(person3));
	}

}
