package procthree;

import java.util.*;
import java.util.stream.Collectors;

public class SortStringByLengthUsingStreams {
	public static void main(String[] args) {
		List<String> stringsList1 = new ArrayList<>();
		List<String> stringsList2 = new ArrayList<>();
		List<String> stringsList3 = new ArrayList<>();

		// Populate String List-1 (unordered)
		stringsList1.add("abc");
		stringsList1.add("abcd");
		stringsList1.add("bac");
		stringsList1.add("xyz");
		stringsList1.add("ab");

		// Sorting by length first, then lexicographically if lengths are the same
		stringsList2 = stringsList1.stream().sorted((s1, s2) -> {
			int lengthCompare = Integer.compare(s1.length(), s2.length());
			if (lengthCompare == 0) {
				return s1.compareTo(s2);
			}
			return lengthCompare;
		}).collect(Collectors.toList());

		// Sorting by length
		stringsList3 = stringsList1.stream()
				.sorted((s1, s2) -> Integer.valueOf(s1.length()).compareTo(Integer.valueOf(s2.length())))
				.collect(Collectors.toList());

		System.out.println(stringsList1);
		System.out.println(stringsList2);
		System.out.println(stringsList3);
	}
}
