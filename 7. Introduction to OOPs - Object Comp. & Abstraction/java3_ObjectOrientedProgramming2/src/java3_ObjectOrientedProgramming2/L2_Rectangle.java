package java3_ObjectOrientedProgramming2;

public class L2_Rectangle {

	private int length;
	private int width;

	public L2_Rectangle(int length, int width) {
		if (length > 0 && width > 0) {
			this.length = length;
			this.width = width;
		} else {
			toString();
		}
	}
	
	public void setLength(int length) {
		if (length > 0) {
			this.length = length;
		} else {
			toString();
		}
	}
	
	public void setWidth(int width) {
		if (length > 0) {
			this.width = width;
		} else {
			toString();
		}
	}
	
	public int calcPerimeter() {
		return 2*(this.length+this.width);
	}
	
	public int calcArea() {
		return this.length*this.width;
	}

	// Return State
	public String toString() {
		if (length <= 0 && width <= 0) {
			return "Length or Width can't be negative or zero!!";
		}
		
		return String.format("Length:%d, Width:%d, Perimeter:%d, Area:%d"
							 ,this.length,this.width,calcPerimeter(),calcArea());
	}
}
