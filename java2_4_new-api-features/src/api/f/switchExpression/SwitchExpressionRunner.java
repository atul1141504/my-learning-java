package api.f.switchExpression;

public class SwitchExpressionRunner {

	public static void main(String[] args) {
		System.out.println("day of week evaluated through Swith Statement is "
							+ swithStatement(1));
		System.out.println("day of week evaluated through Swith Expression is "
							+switchExpression(7));
	}

	private static String swithStatement(int day) {
		String dayOfWeek = "";
		
		switch(day) {
		case 1: dayOfWeek = "Monday"; break;
		case 2: dayOfWeek = "Tuesday"; break;
		case 3: dayOfWeek = "Wednesday"; break;
		case 4: dayOfWeek = "Thursday"; break;
		case 5: dayOfWeek = "Friday"; break;
		case 6: dayOfWeek = "Saturday"; break;
		case 7: dayOfWeek = "Sunday"; break;
		default: throw new IllegalArgumentException("Invalid Option");
		}
		return dayOfWeek;
	}

	private static String switchExpression(int day) {
		String dayOfWeek = switch(day) {
		case 1 -> dayOfWeek = "Sunday";
		case 2 -> dayOfWeek = "Monday";
		case 3 -> dayOfWeek = "Tuesday";
		case 4 -> dayOfWeek = "Wednesday";
		case 5 -> {yield "Thursday";}
		case 6 -> {yield "Friday";}
		case 7 -> {
			System.out.println("Some more tasks performed through Switch Expressions !");
			yield "Saturday";
		}
		default -> throw new IllegalArgumentException("Invalid Option");
		};
		return dayOfWeek;
	}

}
