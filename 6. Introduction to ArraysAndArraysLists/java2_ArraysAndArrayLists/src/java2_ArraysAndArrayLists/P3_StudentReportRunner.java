package java2_ArraysAndArrayLists;

import java.math.BigDecimal;

public class P3_StudentReportRunner {

	public static void main(String[] args) {
		String name = "Atul Patel";
		int[] marks = {96,88,92,90,85};
		P3_StudentReport studentReport = new P3_StudentReport(name,marks);
		int numberOfSubjects = studentReport.getNumberOfMarks();
		System.out.println("noOfSubjects: "+numberOfSubjects);
		int maxMarks = studentReport.getMaxMarks();
		System.out.println("maxMarks    :"+maxMarks);
		int minMarks = studentReport.getMinMarks();
		System.out.println("minMarks    :"+minMarks);
		BigDecimal average = studentReport.getAverageMarks();
		System.out.println("average     :"+average);
		String studentName = studentReport.getStudentName();
		System.out.println("studentName :"+studentName);
	}

}
