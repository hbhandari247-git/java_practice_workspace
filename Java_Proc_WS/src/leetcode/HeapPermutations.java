package leetcode;

import java.util.ArrayList;
import java.util.List;

public class HeapPermutations {

	public static void main(String[] args) {
		String str = "abc";
		List<String> permutations = generatePermutations(str);
		System.out.println("Permutations of " + str + ": " + permutations);
	}

	public static List<String> generatePermutations(String str) {
		List<String> permutations = new ArrayList<>();
		char[] chars = str.toCharArray();
		generatePermutations(chars, chars.length, permutations);
		return permutations;
	}

	private static void generatePermutations(char[] chars, int size, List<String> permutations) {
		if (size == 1) {
			permutations.add(new String(chars));
			return;
		}

		for (int i = 0; i < size; i++) {
			generatePermutations(chars, size - 1, permutations);
			if (size % 2 == 1) {
				swap(chars, 0, size - 1); // if size is odd, swap the first and last element
			} else {
				swap(chars, i, size - 1); // if size is even, swap the i-th and last element
			}
		}
	}

	private static void swap(char[] chars, int i, int j) {
		char temp = chars[i];
		chars[i] = chars[j];
		chars[j] = temp;
	}
}
