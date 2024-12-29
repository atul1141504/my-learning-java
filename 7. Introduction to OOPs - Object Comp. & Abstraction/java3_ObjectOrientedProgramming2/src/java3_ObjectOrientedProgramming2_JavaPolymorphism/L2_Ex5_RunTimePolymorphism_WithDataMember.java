package java3_ObjectOrientedProgramming2_JavaPolymorphism;

/* A method is overridden, not the data members, 
 * so runtime poly-morphism can't be achieved by data members.
 */

class BikeA {
	int speedlimit = 90;
}

class Honda3 extends BikeA {
	int speedlimit = 150;
}

class Suzuki3 extends BikeA {
	int speedlimit = 150;
	int maxSpeed() {
		return speedlimit;
	}
}

public class L2_Ex5_RunTimePolymorphism_WithDataMember {
	public static void main(String args[]) {
		BikeA obj = new Honda3();
		System.out.println(obj.speedlimit);	//90- method is overridden, not the data members
		
		obj = new Suzuki3();
		System.out.println(obj.speedlimit);	//90- method is overridden, not the data members
		
		Suzuki3 s = new Suzuki3();
		System.out.println(s.speedlimit);	//150 - Reference Variable Type changed
		
		Honda3 h = new Honda3();
		System.out.println(h.speedlimit);	//150 - Reference Variable Type changed
		
	}
}
