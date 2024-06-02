package procparttwo;

import java.util.Arrays;

public class SumOfOddEvenGroups {

	public static void main(String[] args) {
		int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sumOfEvenNumbers = Arrays.stream(intArray).filter(element -> element % 2 == 0).sum();
		int sumOfOddNumbers = Arrays.stream(intArray).filter(element -> element % 2 != 0).sum();
		System.out.println(sumOfEvenNumbers);
		System.out.println(sumOfOddNumbers);

		int number = 1278;
		int evenDigitsSum = 0;
		int oddDigitsSum = 0;

		while (number != 0) {
			int digit = number % 10;
			if (digit % 2 == 0) {
				evenDigitsSum += digit;
			} else {
				oddDigitsSum += digit;
			}
			number = number / 10;
		}
		System.out.println("evenDigitsSum :: " + evenDigitsSum);
		System.out.println("oddDigitsSum :: " + oddDigitsSum);
	}

}
