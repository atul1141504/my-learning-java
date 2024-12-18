package codingExercises2Two;

public class Dimension {
    private int feet;
    private int inches;
    
    public Dimension(int inches) {
        // TODO: Convert the total inches into feet and inches. One foot is 12 inches.
        // Store the feet and inches in their respective instance variables.
    	if(inches<0) {
    		this.feet = -1;
    		this.inches = -1;
    	} else {
    		this.feet = inches/12;
        	this.inches = inches%12;
    	}    	
    }
    
    public int getFeet() {
        // TODO: Return the value of feet.
    	if(inches>=0) {
    		return this.feet;
    	}
        return -1;
    }
    
    public int getInches() {
        // TODO: Return the value of inches.
    	if(inches>=0) {
    		return this.inches;
    	}
        return -1;
    }    
}
