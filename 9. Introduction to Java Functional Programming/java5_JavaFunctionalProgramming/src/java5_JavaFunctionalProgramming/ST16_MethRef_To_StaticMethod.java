package java5_JavaFunctionalProgramming;

import java.util.*;

class PersonA {
	private String name;
	private Integer age;

	// Constructor
	public PersonA(String name, int age) {
		// This keyword refers to current instance itself
		this.name = name;
		this.age = age;
	}

	// Getter-setters
	public Integer getAge() {
		return age;
	}

	public String getName() {
		return name;
	}
}

//Driver class
public class ST16_MethRef_To_StaticMethod {
	// Static method to compare with name & age respectively7
	public static int compareByName(PersonA a, PersonA b) {
		return a.getName().compareTo(b.getName());
	}

	public static int compareByAge(PersonA a, PersonA b) {
		return a.getAge().compareTo(b.getAge());
	}

	// Main Runner/Driver method
	public static void main(String[] args) {

		// Creating an empty ArrayList of user-defined type
		// List of person
		List<PersonA> personList = new ArrayList<>();

		// Adding elements to above List
		// using add() method
		personList.add(new PersonA("Krishna", 31));
		personList.add(new PersonA("Atul", 29));
		personList.add(new PersonA("Ankit", 27));

		System.out.println(personList.get(0));

		// sort array by name by using static method reference to
		Collections.sort(personList, ST16_MethRef_To_StaticMethod::compareByName);

		// Using streams over above object of Person type
		System.out.println("Sort by Name :");
		personList.stream().map(x -> x.getName()).forEach(System.out::println);

		System.out.println();

		// Now sort array by age by using static method reference
		Collections.sort(personList, ST16_MethRef_To_StaticMethod::compareByAge);

		// Using streams over above object of Person type
		System.out.println("Sort by Age :");
		personList.stream().map(x -> x.getName()).forEach(System.out::println);
	}
}