package java5_JavaFunctionalProgramming;

import java.util.List;

class StringToLength {
	int getLength(String a) {
		return a.length();
		
	}
}
public class ST17_MethRef_To_InstanceMethodA {

	public static void main(String[] args) {
		List<String> list = List.of("Apple","Boy","Atul","Cat","Double","Elephant");
		
		//Create an Object(Instance) of the class 'StringToLength'
		StringToLength StringToLength = new StringToLength();
		
		//Now call the Instance Method to get the length of the string 
		System.out.print("User-defined Object=> Length Of elements are ");
		list.stream()
			.map(StringToLength::getLength)
			.forEach(s->System.out.print(s+" "));
		
		//String Instance
		System.out.print("\nString Instance    => Length Of elements are ");
		list.stream()
			.map(String::length)
			.forEach(s->System.out.print(s+" "));
	}

}
