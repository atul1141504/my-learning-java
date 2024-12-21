package java2_ArraysAndArrayLists;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class P3_StudentReport {

	private int[] marks;
	private String name;

	public P3_StudentReport(String name, int[] marks) {
		this.marks = marks;
		this.name = name;
	}

	public int getNumberOfMarks() {
		
		return this.marks.length;
	}

	public int getMaxMarks() {
		int max = 0;
		for(int mark:this.marks) {
			if(max<mark) {
				max = mark;
			}
		}
		return max;
	}

	public int getMinMarks() {
		int min = 100;
		for(int mark:this.marks) {
			if(min>mark) {
				min = mark;
			}
		}
		return min;
	}

	public BigDecimal getAverageMarks() {
		int sum = 0;
		BigDecimal avg;
		for(int mark:this.marks) {
			sum+=mark;
		}
		avg = new BigDecimal(sum).divide(new BigDecimal(this.marks.length),3,RoundingMode.UP);
		return avg;
	}

	public String getStudentName() {
		return this.name;
	}

}
