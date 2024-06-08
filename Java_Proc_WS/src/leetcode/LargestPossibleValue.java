package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestPossibleValue {
	public static void main(String[] args) {
		int num1 = 65875;
		int num2 = 16987;
		int result1 = largestPossibleValue(num1);
		int result2 = largestPossibleValue(num2);
		System.out.println(result1); // Output: 87655
		System.out.println(result2); // Output: 98761
	}

	public static int largestPossibleValue(int num) {
		// Convert the number to a list of digits
		List<Integer> digits = new ArrayList<>();
		int temp = num;
		while (temp > 0) {
			digits.add(temp % 10);
			temp /= 10;
		}
		Collections.reverse(digits); // To maintain the order of digits

		// Separate even and odd digits
		List<Integer> evenDigits = new ArrayList<>();
		List<Integer> oddDigits = new ArrayList<>();

		for (int digit : digits) {
			if (digit % 2 == 0) {
				evenDigits.add(digit);
			} else {
				oddDigits.add(digit);
			}
		}

		// Sort even and odd digits in descending order
		evenDigits.sort(Collections.reverseOrder());
		oddDigits.sort(Collections.reverseOrder());

		// Create indices for even and odd digits
		int evenIndex = 0;
		int oddIndex = 0;

		// Construct the largest possible value
		StringBuilder result = new StringBuilder();
		for (int digit : digits) {
			if (digit % 2 == 0) {
				result.append(evenDigits.get(evenIndex));
				evenIndex++;
			} else {
				result.append(oddDigits.get(oddIndex));
				oddIndex++;
			}
		}

		// Convert result StringBuilder back to a single integer
		return Integer.parseInt(result.toString());
	}
}
