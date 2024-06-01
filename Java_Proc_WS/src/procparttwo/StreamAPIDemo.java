package procparttwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIDemo {
	public static void main(String[] args) {
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(2);
		integerList.add(3);
		integerList.add(6);
		integerList.add(9);
		integerList.add(5);

		int sum = integerList.stream().filter(element -> element > 4).mapToInt(element -> element).sum();
		System.out.println(sum);

		// create a list of String
		List<String> names = Arrays.asList("Reflection", "Collection", "Stream");

		// demonstration of filter method
		List<String> result = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());

		System.out.println(result);

		List<Integer> squareIntegerList = integerList.stream().map(x -> x * x).collect(Collectors.toList());
		System.out.println(squareIntegerList);

		// demonstration of sorted method
		List<Integer> sortedIntergerList = squareIntegerList.stream().sorted().collect(Collectors.toList());
		List<String> sortedNamesList = names.stream().sorted().collect(Collectors.toList());

		System.out.println(sortedIntergerList);
		System.out.println(sortedNamesList);

        int even = integerList.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);
        System.out.println(even);
	}
}
