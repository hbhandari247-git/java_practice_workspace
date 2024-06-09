package procparttwo;

import java.util.Optional;

public class OptionalElementDemo {

	public static void main(String[] args) {
		String[] stringArray = new String[5];
		stringArray[2] = "GeeksForGeeks";
		Optional<String> empty = Optional.empty();
		System.out.println(empty);

		Optional<String> value = Optional.of(stringArray[2]);
		System.out.println(value);

		Optional<String> value2 = Optional.ofNullable(stringArray[0]);
		System.out.println(value2);

		boolean isPresentValue = Optional.ofNullable(stringArray[0]).isPresent();
		System.out.println(isPresentValue);

		Optional.ofNullable(stringArray[2]).ifPresent(element -> {
			for (int i = 0; i < element.length(); i++) {
				char ch = element.charAt(i);

				if (element.indexOf(ch) == element.lastIndexOf(element)) {
					System.out.println("" + ch);
				}
			}
		});;
	}

}
