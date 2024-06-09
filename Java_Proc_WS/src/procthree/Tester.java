package procthree;

public class Tester {
	public static void main(String[] args) {
		int[] intArray = new int[] { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5 };
		System.out.println(findMinMaxElementInAnArray(intArray));
		System.out.println(findSecondLargest(intArray));
		System.out.println(findThirdLargest(intArray));
		System.out.println(findSecondMinimum(intArray));
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

	/**
	 * findThirdLargest element in an array
	 * 
	 * @param arr
	 * @return
	 */
	public static Integer findThirdLargest(int[] arr) {
		if (arr == null || arr.length < 3) {
			return null; // Handle cases where the array has fewer than 3 elements
		}

		// Initialize the largest, second largest, and third largest
		Integer largest = null;
		Integer secondLargest = null;
		Integer thirdLargest = null;

		for (int num : arr) {
			if (largest == null || num > largest) {
				thirdLargest = secondLargest;
				secondLargest = largest;
				largest = num;
			} else if ((secondLargest == null || num > secondLargest) && num != largest) {
				thirdLargest = secondLargest;
				secondLargest = num;
			} else if ((thirdLargest == null || num > thirdLargest) && num != largest && num != secondLargest) {
				thirdLargest = num;
			}
		}

		return thirdLargest;
	}

	/**
	 * Find Second Minimum Element in an array
	 * 
	 * @param arr
	 * @return
	 */
	public static Integer findSecondMinimum(int[] arr) {
		if (arr == null || arr.length < 2) {
			return null; // Handle cases where the array has fewer than 2 elements
		}

		// Initialize the largest and second largest
		Integer smallest = null;
		Integer secondSmallest = null;

		for (int num : arr) {
			if (smallest == null || num < smallest) {
				secondSmallest = smallest;
				smallest = num;
			} else if ((secondSmallest == null || num < secondSmallest) && num != smallest) {
				secondSmallest = num;
			}
		}

		return secondSmallest;
	}

}
