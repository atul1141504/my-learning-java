package java3_ObjectOrientedProgramming2_JavaAbstraction;

abstract public class L1_AbstractRecipe {
	//Private variables can be created & these variables can be set using Constructors
	private String initiate = "Started cooking recipe...";
	private String recipeName;
	
	public L1_AbstractRecipe(String recipeName) {
		super();
		this.recipeName = recipeName;
	}

	//Abstract class can have concrete methods as well
	void recipeMaking(){
		System.out.println(initiate+this.recipeName);
		getReady();
		getCooked();
		getCleanup();
	}
	
	/*below are the Abstract methods without implementations
	 * Actual implementation will be done in the Sub_Classes
	 * This is just a blueprint for the subclasses
	*/
	protected abstract void getReady();
	protected abstract void getCooked();
	protected abstract void getCleanup();
}
