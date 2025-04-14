package java2_3_JavaTips;

import static java.lang.System.out;

import java.math.BigDecimal;
import java.util.ArrayList;
import static java.util.Collections.*;

public class T1_0B_importsAndStaticImports {

	public static void main(String[] args) {
		String str = "Hello Atul";
		BigDecimal bd = new BigDecimal(100);
		
		out.println("String:"+str + " & Bigdecimal:" +bd);
		
		/*	Static import for add method will not work for string
		 * 	Therefore, it is not needed to be included
		 * 	but for Collections' sort method can be directly used after static import
		*/
		ArrayList<String> array = new ArrayList<>();
		array.add("Words");
		array.add("Atul");
		array.add("Kind");
		array.add("Happy");
		
		out.println("Array Created: "+array);
		
		sort(array);
		
		out.println("Array Sorted : "+array);

	}

}
