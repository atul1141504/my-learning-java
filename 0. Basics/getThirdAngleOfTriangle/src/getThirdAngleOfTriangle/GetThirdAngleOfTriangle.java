package getThirdAngleOfTriangle;

public class GetThirdAngleOfTriangle {

	public static void main(String[] args) {
		int thirdAngleReturned = getThirdAngleOfTriangle(70,50);
		System.out.printf("Third angle of the traingle is %d.",thirdAngleReturned).println();

	}
	private static int getThirdAngleOfTriangle(int ang1, int ang2) {
		int thirdAngle = 180 - (ang1 + ang2);
		return thirdAngle;
		
	}

}
