package java2_ArraysAndArrayLists;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class P5_StudentRefarctoredReport {

	private ArrayList<Integer> marks = new ArrayList<Integer>();
	private String name;
	
	//Below constructor uses Variable Arguments
	public P5_StudentRefarctoredReport(String name, int... marks) {
		this.name = name;
		for(Integer mark:marks) {
			this.marks.add(mark);
		}
	}

	public int getNumberOfMarks() {
		
		return this.marks.size();
	}

	public int getMaxMarks() {
		return Collections.max(this.marks);
	}

	public int getMinMarks() {
		return Collections.min(this.marks);
	}

	public BigDecimal getAverageMarks() {
		int sum = 0;
		BigDecimal avg;
		for(int mark:this.marks) {
			sum+=mark;
		}
		avg = new BigDecimal(sum).divide(new BigDecimal(this.marks.size()),3,RoundingMode.UP);
		return avg;
	}

	public String getStudentName() {
		return this.name+this.marks;
	}

	public void addMark(int i) {
		this.marks.add(i);
	}

	public void removeMarkAtIndex(int i) {
		this.marks.remove(i);
	}
}
