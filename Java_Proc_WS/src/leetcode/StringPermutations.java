package leetcode;

import java.util.*;

public class StringPermutations {

	public static void main(String[] args) {
		String str = "abc";
		List<String> permutations = generatePermutations(str);
		System.out.println("Permutations of " + str + ": " + permutations);
		
		
		String str2 = "abcabcef";
		System.out.println(str2.substring(0, 0));
	}

	public static List<String> generatePermutations(String str) {
		List<String> permutations = new ArrayList<>();
		generatePermutationsHelper("", str, permutations);
		return permutations;
	}

	private static void generatePermutationsHelper(String prefix, String suffix, List<String> permutations) {
		int n = suffix.length();
		if (n == 0) {
			permutations.add(prefix);
		} else {
			for (int i = 0; i < n; i++) {
				generatePermutationsHelper(prefix + suffix.charAt(i),
						suffix.substring(0, i) + suffix.substring(i + 1, n), permutations);
			}
		}
	}
}
