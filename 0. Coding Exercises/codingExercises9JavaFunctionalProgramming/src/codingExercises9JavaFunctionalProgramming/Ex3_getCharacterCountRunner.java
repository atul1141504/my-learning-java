package codingExercises9JavaFunctionalProgramming;

import java.util.List;

public class Ex3_getCharacterCountRunner {

	public static void main(String[] args) {
		Ex3_getCharacterCount getCharactersCount = new Ex3_getCharacterCount();
		
		List<String> inpList = List.of("Physics","Chemistry","Mathematics","Hindi","English");
		System.out.println(getCharactersCount.getCourseNameCharacterCount(inpList));
		System.out.println(getCharactersCount.getCourseNameCharacterCount(List.of()));
		System.out.println(getCharactersCount.getCourseNameCharacterCount(null));

	}

}
