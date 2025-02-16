package java3_ObjectOrientedProgramming2_JavaAbstraction;

public class L1_Recipe1 extends L1_AbstractRecipe {

	public L1_Recipe1(String recipeName) {
		super(recipeName);
	}

	@Override
	protected void getReady() {
		System.out.println("\n\tStep1:");
		System.out.println("\t==> Get & Clean Raw Material");
		System.out.println("\t==> Get Microwave");
		
	}
	
	@Override
	protected void getCooked() {
		System.out.println("\n\tStep2:");
		System.out.println("\t==> Prepare raw material");
		System.out.println("\t==> Put stuffs in the utensil");
		System.out.println("\t==> Put utensil in the Microwave");
		System.out.println("\t==> Turn ON Microwave");
	}

	@Override
	protected void getCleanup() {
		System.out.println("\n\tStep3:");
		System.out.println("\t==> Turn Off Microwave");
		System.out.println("\t==> Get utensil out of microwave");
		System.out.println("\t==> Clean uytensils & Kichen");
	}

}
