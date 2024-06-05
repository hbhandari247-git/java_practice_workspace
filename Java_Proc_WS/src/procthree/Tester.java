package procthree;

public class Tester {
	public static void main(String[] args) {
		int[] intArray = new int[] { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5 };
		System.out.println(findMinMaxElementInAnArray(intArray));
		System.out.println(findSecondLargest(intArray));
	}

	/**
	 * Find Min Max in an Array
	 * 
	 * @param intArray
	 * @return
	 */
	private static int[] findMinMaxElementInAnArray(int[] intArray) {
		if (intArray == null || intArray.length == 0) {
			return new int[] { 0, 0 };
		}

		int maxNum = intArray[0];
		int minNum = intArray[0];

		for (int i = 1; i < intArray.length; i++) {
			if (intArray[i] > maxNum) {
				maxNum = intArray[i];
			}
			if (intArray[i] < minNum) {
				minNum = intArray[i];
			}
		}
		System.out.println("MinNum::: " + minNum);
		System.out.println("MaxNum::: " + maxNum);
		return new int[] { maxNum, minNum };
	}

	/**
	 * Find Second Largest Element in an array
	 * 
	 * @param arr
	 * @return
	 */
	public static Integer findSecondLargest(int[] arr) {
		if (arr == null || arr.length < 2) {
			return null; // Handle cases where the array has fewer than 2 elements
		}

		// Initialize the largest and second largest
		Integer largest = null;
		Integer secondLargest = null;

		for (int num : arr) {
			if (largest == null || num > largest) {
				secondLargest = largest;
				largest = num;
			} else if ((secondLargest == null || num > secondLargest) && num != largest) {
				secondLargest = num;
			}
		}

		return secondLargest;
	}

}
