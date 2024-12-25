package java3_ObjectOrientedProgramming2_JavaAbstraction;

public class L1_Recipe1Runner {
	
	public static void main(String[] args) {
		String recipeName = "<Recipe-001>";
		L1_Recipe1 recipe1 = new L1_Recipe1(recipeName);
		
		//here the method present in the Abstract class can be directly accessible
		recipe1.recipeMaking();	
		
		//L1_AbstractRecipe newRunner = new L1_AbstractRecipe(recipeName);
		//Object of an Abstract class can not be created
	}
}
