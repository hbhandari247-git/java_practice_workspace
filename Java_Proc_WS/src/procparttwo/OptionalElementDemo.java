package procparttwo;

import java.util.Optional;

public class OptionalElementDemo {

	public static void main(String[] args) {
		String[] stringArray = new String[5];
		stringArray[2] = "Hello World!";
		Optional<String> empty = Optional.empty();
		System.out.println(empty);

		Optional<String> value = Optional.of(stringArray[2]);
		System.out.println(value);

		Optional<String> value2 = Optional.ofNullable(stringArray[0]);
		System.out.println(value2);
	}

}
