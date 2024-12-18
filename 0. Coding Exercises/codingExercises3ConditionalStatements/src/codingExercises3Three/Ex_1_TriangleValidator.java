package codingExercises3Three;

public class Ex_1_TriangleValidator {
    public boolean isValidTriangle(int angle1, int angle2, int angle3) {
        if ((angle1 <= 0  || 
        	 angle2 <= 0  || 
        	 angle3 <= 0) || 
        	(angle1+angle2+angle3 != 180)){
           return false;
        }else{
            return true;
        }
    }

	public boolean isRightAnglrTriangle(int side1, int side2, int side3) {
		if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
	           return false;
	    }
		
		if (side1 == Math.sqrt(side2*side2+side3*side3) ||
				side2 == Math.sqrt(side3*side3+side1*side1) ||
				side3 == Math.sqrt(side1*side1+side2*side2)) {
			return true;
		}
		return false;
	}
}
