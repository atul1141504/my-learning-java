package codingExercises8JavaCollections;

public class Ex2_HexStringCheckerRunner {

	public static void main(String[] args) {
		Ex2_HexStringChecker isHex = new Ex2_HexStringChecker("");
		
		System.out.println("isHex: <aBcdeF1234567890> ==>"+isHex.isHexadecimal("aBcdeF1234567890"));
		System.out.println("isHex: <1A 2b 3C>         ==>"+isHex.isHexadecimal("1A 2b 3C"));
		System.out.println("isHex: <1A2B*3c>          ==>"+isHex.isHexadecimal("1A2B*3c"));
		System.out.println("isHex: <G>                ==>"+isHex.isHexadecimal("G"));
		System.out.println("isHex: <*>                ==>"+isHex.isHexadecimal("*"));
	}

}
