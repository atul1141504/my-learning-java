package java2_3_JavaTips_AccessModifiersB;

import java2_3_JavaTips_AccessModifiersA.*;	//T2_MethodAccessModifiers;

public class T1_CallMethodsDefinedInAnothePackage_WithInheritence 
								extends T2_MethodAccessModifiers {

	public static void main(String[] args) {
		System.out.println("Different Package: class inherited method class");
		
		T1_CallMethodsDefinedInAnothePackage_WithInheritence
				methAccessMod = new T1_CallMethodsDefinedInAnothePackage_WithInheritence();
		
		//In a different package only PUBLIC & PROTECTED Methods can be accessed 
		methAccessMod.publicMethod();
		methAccessMod.protectedMethod();
		
		//Default & Private methods can't be accessed from a different package
		//	methAccessMod.defaultMethod();
		//	methAccessMod.privateMethod();

	}

}
