package java2_3_JavaTips;

import java.util.Objects;

class Animal1{
	private int id =0;

	public Animal1(int id) {
		super();
		this.id = id;
	} 
	
	int toInteger() {
		return id;
	}
}

class Animal2{
	private int id =0;

	public Animal2(int id) {
		super();
		this.id = id;
	} 
	
	int toInteger() {
		return id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal2 other = (Animal2) obj;
		return id == other.id;
	}
	
	
}

public class T1_3_1_equalsMethod {

	public static void main(String[] args) {
		/*	Creating 2 objects of class Animal1 with id=1
		 * 	Comparison using equals method will return "false"
		 * 
		 * 	This is because new keyword always creates a new object in the heap 
		 * 	& assigns respective memory location to the Reference variable
		 * 	& these locations gets compared but not the value("id" in this case).
		 * 
		 */
		Animal1 cat1 = new Animal1(1);
		Animal1 cat2 = new Animal1(1);
		System.out.println("cat1 equals cat2 ==> " + cat1.equals(cat2));
		
		/*	SO to compare these objects there is one more method present:
		 * 
		 * 	HASHCODE: generate hash-code using right click in the Animal class	
		 * 			right click --> source --> generate hash-code & equals
		 * 
		 */
		Animal2 dog1 = new Animal2(1);
		Animal2 dog2 = new Animal2(1);
		Animal2 dog3 = new Animal2(2);
		
		//this should return true
		System.out.println("dog1 equals dog2 ==> " + dog1.equals(dog2));
		
		//this should return false as IDs are different
		System.out.println("dog1 equals dog3 ==> " + dog1.equals(dog3));

	}

}
