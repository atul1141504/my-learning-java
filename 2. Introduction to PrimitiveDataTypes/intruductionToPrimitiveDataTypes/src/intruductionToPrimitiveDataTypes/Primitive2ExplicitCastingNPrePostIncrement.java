package intruductionToPrimitiveDataTypes;

public class Primitive2ExplicitCastingNPrePostIncrement {
	public static void main(String[] args) {
		
		// Implicit & explicit Casting
		int i = 21474;
		short sh = 32767;
		
		short sh1 = (short)i;
		System.out.printf("Explicit Casting of sh1:%d",sh1).println();
		
		int i1 = sh;
		System.out.printf("Implicit Casting of sh1:%d",i1).println();
		
		//Pre & Post Increment Operations
		
		int a1 = 10;
		int a2 = 10;
		int b1 = ++a1;
		System.out.printf("Pre  increment --> a1:%d & b1:%d",a1,b1).println();
		
		int b2 = a2++;
		System.out.printf("Post increment --> a2:%d & b2:%d",a2,b2).println();
		
	}
}
