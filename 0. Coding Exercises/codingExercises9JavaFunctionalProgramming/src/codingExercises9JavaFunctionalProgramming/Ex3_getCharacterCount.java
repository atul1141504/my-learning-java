package codingExercises9JavaFunctionalProgramming;

import java.util.List;
import java.util.stream.Collectors;

public class Ex3_getCharacterCount {
	public List<Integer> getCourseNameCharacterCount(List<String> courses) {

		if(courses==null) {
			return List.of();
		}
		
		return courses.stream()
					  .map(element->element.length())
					  .collect(Collectors.toList());
    }
}
