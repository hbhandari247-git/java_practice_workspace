package procparttwo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MethodReferencesDemo {

	public static void main(String[] args) {
		List<String> messages = Arrays.asList("hello", "baeldung", "readers!");
		messages.stream().map(element -> element).forEach(System.out::println);
		
		// Instance method reference
		Function<String, String> toLowerCase = String::toLowerCase;
		// Static method reference
		Function<String, Integer> strLength = String::length;
		System.out.println(toLowerCase.apply("ABC"));
		System.out.println(strLength.apply("ABC"));
	}
}
