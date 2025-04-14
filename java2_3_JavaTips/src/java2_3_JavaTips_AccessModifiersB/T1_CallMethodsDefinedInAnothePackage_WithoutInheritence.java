package java2_3_JavaTips_AccessModifiersB;

import java2_3_JavaTips_AccessModifiersA.T2_MethodAccessModifiers;

public class T1_CallMethodsDefinedInAnothePackage_WithoutInheritence {

	public static void main(String[] args) {
		System.out.println("Different Package: "
				+ "class do not inherit methods from another package class");
		
		//In a different package only PUBLIC Methods can be accessed
		T2_MethodAccessModifiers methAccessMod = new T2_MethodAccessModifiers();
		
		//calling all the methods
		methAccessMod.publicMethod();

		//Protected, Default & Private methods can't be called
		//	methAccessMod.protectedMethod();
		//	methAccessMod.defaultMethod();
		//	methAccessMod.privateMethod();

	}

}
