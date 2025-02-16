package java2_ArraysAndArrayLists;

public class P5_StudentRefarctoredReportRunner {
	//Refactored code using ArrayLists
	public static void main(String[] args) {
		P5_StudentRefarctoredReport studentReport = new P5_StudentRefarctoredReport("Atul",new int[] {96,88,92,90,85});
		System.out.println("noOfSubjects  :"+studentReport.getNumberOfMarks());
		System.out.println("maxMarks      :"+studentReport.getMaxMarks());
		System.out.println("minMarks      :"+studentReport.getMinMarks());
		System.out.println("average       :"+studentReport.getAverageMarks());
		System.out.println("studentdetails:"+studentReport.getStudentName());
		
		System.out.println();
		System.out.println("Next Record");
		
		P5_StudentRefarctoredReport studentReport1 = new P5_StudentRefarctoredReport("STDT1",new int[] {95,91,86});
		System.out.println("noOfSubjects  :"+studentReport1.getNumberOfMarks());
		System.out.println("maxMarks      :"+studentReport1.getMaxMarks());
		System.out.println("minMarks      :"+studentReport1.getMinMarks());
		System.out.println("average       :"+studentReport1.getAverageMarks());
		System.out.println("studentdetails:"+studentReport1.getStudentName());
		
		//Add a new mark to the array
		studentReport1.addMark(35);
		System.out.println("\nAfter adding new mark >>");
		System.out.println("studentdetails:"+studentReport1.getStudentName());
		
		//remove a mark to the array
		studentReport1.removeMarkAtIndex(3);
		System.out.println("\nAfter removing a mark - removeMarkAtIndex >>");
		System.out.println("studentdetails:"+studentReport1.getStudentName());
				
	}
}
