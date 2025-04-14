package java2_3_JavaTips_AccessModifiersA;

public class T3_ClassWithinSamePackage {

	public static void main(String[] args) {
		System.out.println("Within same Package but different class");
		T2_MethodAccessModifiers methAccessMod = new T2_MethodAccessModifiers();
		
		//calling all the methods
		methAccessMod.publicMethod();
		methAccessMod.protectedMethod();
		methAccessMod.defaultMethod();
		
		//Private methods can't be called
		//	methAccessMod.privateMethod();

	}

}
