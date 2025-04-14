package java2_3_JavaTips;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;

public class T1_0A_importsAndStaticImports {

	public static void main(String[] args) {
		/*	we don't need to import java.lang.String package
		 * 	"java.lang.*" gets auto imported & don't need to be specified explicitly
		 * 
		 * 	All other packages needs to be imported & only then 
		 * 	we can use the classes & static methods
		 */
		String str = "Hello Atul";	// 
		
		//to use BigDecimal, ArrayList, Collections etc, we need to import the class/package
		BigDecimal bd = new BigDecimal(100);
		
		System.out.println("String:"+str + " & Bigdecimal:" +bd);
		
		ArrayList<String> array = new ArrayList<>();
		array.add("Words");
		array.add("Atul");
		array.add("Kind");
		array.add("Happy");
		
		System.out.println("Array Created: "+array);
		
		Collections.sort(array);
		
		System.out.println("Array Sorted : "+array);
		

	}

}
