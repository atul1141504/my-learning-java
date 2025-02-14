package java5_JavaFunctionalProgramming;

import java.util.*;

class PersonB {

    // Attributes of a person
    private String name;
    private Integer age;

    // Constructor
    public PersonB(String name, int age)
    {
        // This keyword refers to current object itself
        this.name = name;
        this.age = age;
    }

    // Getter-setter methods
    public Integer getAge() { return age; }
    public String getName() { return name; }
}

class ComparisonProvider {
	//method to compare with name & age respectively7
    public int compareByName(PersonB a, PersonB b) {
        return a.getName().compareTo(b.getName());
    }

    public int compareByAge(PersonB a, PersonB b) {
        return a.getAge().compareTo(b.getAge());
    }
}

//Driver class
public class ST17_MethRef_To_InstanceMethod {
	// Main Runner/Driver method
	public static void main(String[] args) {
		// Creating an empty ArrayList of user-defined type: PersonB
		List<PersonB> PersonList = new ArrayList<>();

		// Adding elements to above List using add() method
		PersonList.add(new PersonB("Krishna", 31));
		PersonList.add(new PersonB("Atul", 29));
		PersonList.add(new PersonB("Ankit", 27));

		System.out.println(PersonList.get(0));
		
		//create a new Object(Instance of a class) for CamparatorProvider class
		ComparisonProvider comparator = new ComparisonProvider();

		// sort array by name by using Instance method reference to
		Collections.sort(PersonList, comparator::compareByName);  //Instance Method Reference

		// Using streams over above object of PersonB type
		System.out.println("Sort by Name :");
		PersonList.stream().map(x -> x.getName())
							.forEach(System.out::println);	//Static Method Reference

		System.out.println();

		// Now sort array by age by using Instance method reference
		Collections.sort(PersonList, comparator::compareByAge);	//Instance Method Reference

		// Using streams over above object of PersonB type
		System.out.println("Sort by Age :");
		PersonList.stream().map(x -> x.getName())
							.forEach(System.out::println);	//Static Method Reference
	}
}