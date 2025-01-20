package java4_JavaGenerics;

import java.util.ArrayList;
import java.util.List;

public class L3_Ex1_GenericsWildcardsRunner {

	/*
	 *  Here, '?' is a WildCard which extends Number class & allows all its methods
	 *  It can accept different numeric data types 
	 *  	like - integer, Double, Long & will return  sum as a double data type.
	 *  
	 *  Here 'extends' is used as Upper Bounded WildCard.
	 *  Helps in implementing common logic for all the list which extends number
	 */
	static double getSumOfElementsOfList(List<? extends Number> list) {
		double sum=0.0;
		for(Number element:list) {
			sum+=element.doubleValue();
		}
		return sum;
	}
	
	/*
	 *  Here, 'super' is used as Lower Bounded WildCard
	 *  It helps in adding elements which are sub types of Number to the list
	 */
	static void addElements(List<? super Number> list) {
		list.add(1);
		list.add(5.23);
		list.add(23l);
		list.add(567.11f);
	}
	
	public static void main(String[] args) {
		List<Integer> intList = List.of(1,2,3,4,5,6,7);
		List<Double> dbleList = List.of(1.1,2.1,3.3,4.4,5.5,6.6,7.7);
		List<Long> longList = List.of(1l,2l,3l,4l,5l,6l,7l);
		List<Float> floatList = List.of(1.12f,2.23f,3.31f,4.44f);
		
		System.out.println("~~~~~~~Upper Bound WildCard~~~~~~~~~");
		System.out.println(("\tSum Of intList   elements==>" + getSumOfElementsOfList(intList)));
		System.out.println(("\tSum Of dbleList  elements==>" + getSumOfElementsOfList(dbleList)));
		System.out.println(("\tSum Of longList  elements==>" + getSumOfElementsOfList(longList)));
		System.out.println(("\tSum Of floatList elements==>" + getSumOfElementsOfList(floatList)));
		
		System.out.println("~~~~~~~Lower Bound WildCard~~~~~~~~~");
		List<Number> listA = new ArrayList<>();
		addElements(listA);
		System.out.println("\tElements added to the list==>"+listA);
		
	}

}
