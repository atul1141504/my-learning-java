package java2_ArraysAndArrayLists;

public class P1_PrintMarks {

	public static void main(String[] args) {
		int[] marks = {96,88,92,90,85,91,95};
		
		System.out.println("Printing marks array >>");
		
		System.out.println("\nfor Loop:");
		for(int i = 0;i<marks.length;i++) {
			System.out.println("\tmarks at index " + i +" : " + marks[i]);
		}
		
		System.out.println("\nforEach or Enhanced for Loop:");
		int i = 0;
		for(int mark:marks) {
			System.out.println("\tmarks at index " + i +" : " + mark);
			i++;
		}

	}

}
