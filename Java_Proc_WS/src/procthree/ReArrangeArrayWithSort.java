package procthree;

import java.util.Arrays;

public class ReArrangeArrayWithSort {
	public static void rearrangeAndSort(int[] arr) {
		int n = arr.length;
		int[] positives = new int[n];
		int[] negatives = new int[n];
		int posCount = 0, negCount = 0;

		// Separate positive and negative numbers
		for (int num : arr) {
			if (num >= 0) {
				positives[posCount++] = num;
			} else {
				negatives[negCount++] = num;
			}
		}

		// Sort the positive and negative arrays
		Arrays.sort(positives, 0, posCount);
		Arrays.sort(negatives, 0, negCount);

		// Merge the sorted parts back into the original array
		System.arraycopy(positives, 0, arr, 0, posCount);
		System.arraycopy(negatives, 0, arr, posCount, negCount);
	}

	public static void main(String[] args) {
		int[] arr = { 12, -7, 5, -3, 9, -2, -8, 4, 10 };
		rearrangeAndSort(arr);
		System.out.println("Rearranged and sorted array: " + Arrays.toString(arr));
	}
}
