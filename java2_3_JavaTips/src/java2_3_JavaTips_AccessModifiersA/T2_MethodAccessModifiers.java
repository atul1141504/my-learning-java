package java2_3_JavaTips_AccessModifiersA;

public class T2_MethodAccessModifiers {
	/*
	 * 1. Public is accessible Everywhere Like: same Class, Same/Different Package
	 * Subclass & non-Subclasses
	 * 
	 * 2. Protected is accessible everywhere except
	 * "Different Package non-Subclasses"
	 * 
	 * 3. Default is accessible within same class & Same Package Subclass &
	 * non-Subclasses
	 * 
	 * 4. private is accessible within the same class only
	 */
	public void publicMethod() {
		System.out.println("public Method is called");
	}

	protected void protectedMethod() {
		System.out.println("protected Method is called");
	}

	void defaultMethod() {
		System.out.println("default Method is called");
	}

	private void privateMethod() {
		System.out.println("private Method is called");
	}

	public static void main(String[] args) {
		System.out.println("Within same package & class!!");
		T2_MethodAccessModifiers methAccessMod = new T2_MethodAccessModifiers();

		// calling all the methods
		methAccessMod.publicMethod();
		methAccessMod.protectedMethod();
		methAccessMod.defaultMethod();
		methAccessMod.privateMethod();

	}

}
