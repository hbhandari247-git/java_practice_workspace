package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RepeatedSubstrings {

	public static Set<String> findRepeatedSubstrings(String str) {
		Map<String, Integer> substringCount = new HashMap<>();
		Set<String> result = new HashSet<>();

		int length = str.length();

		// Generate all possible substrings
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j <= length; j++) {
				String substring = str.substring(i, j);

				// Update the count in the hashmap
				substringCount.put(substring, substringCount.getOrDefault(substring, 0) + 1);
			}
		}

		// Find all substrings that appear more than once
		for (Map.Entry<String, Integer> entry : substringCount.entrySet()) {
			if (entry.getValue() > 1 && entry.getKey().length() >= 2) {
				result.add(entry.getKey());
			}
		}

		return result;
	}

	public static void main(String[] args) {
		String str1 = "ABCABCDF";
		Set<String> repeatedSubstrings = findRepeatedSubstrings(str1);

		System.out.println("Repeated substrings are: ");
		for (String substring : repeatedSubstrings) {
			System.out.println(substring);
		}
	}
}
