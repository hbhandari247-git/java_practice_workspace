package procparttwo;

import java.util.Arrays;
import java.util.List;

public class MethodReferencesDemo {

	public static void main(String[] args) {
		List<String> messages = Arrays.asList("hello", "baeldung", "readers!");
		messages.stream().map(element -> element).forEach(System.out::println);
		System.out.println(messages);
	}
}
