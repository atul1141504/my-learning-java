package java2_ArraysAndArrayLists;

public class P4_VariableArgumentsRunner {

	public static void main(String[] args) {
		P4_VariableArguments studentReport = new P4_VariableArguments("Atul",new int[] {96,88,92,90,85});
		System.out.println("noOfSubjects:"+studentReport.getNumberOfMarks());
		System.out.println("maxMarks    :"+studentReport.getMaxMarks());
		System.out.println("minMarks    :"+studentReport.getMinMarks());
		System.out.println("average     :"+studentReport.getAverageMarks());
		System.out.println("studentName :"+studentReport.getStudentName());
		
		System.out.println();
		System.out.println("Next Record");
		
		P4_VariableArguments studentReport1 = new P4_VariableArguments("STDT1",new int[] {95,98,86});
		System.out.println("noOfSubjects:"+studentReport1.getNumberOfMarks());
		System.out.println("maxMarks    :"+studentReport1.getMaxMarks());
		System.out.println("minMarks    :"+studentReport1.getMinMarks());
		System.out.println("average     :"+studentReport1.getAverageMarks());
		System.out.println("studentName :"+studentReport1.getStudentName());
	}

}
