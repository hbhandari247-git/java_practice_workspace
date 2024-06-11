package procthree;

import java.util.Arrays;

/**
 * @author Himanshu Bhandari
 */
public class RearrangeArray {
	public static void rearrange(int[] arr) {
		int left = 0, right = arr.length - 1;

		while (left <= right) {
			if (arr[left] < 0 && arr[right] >= 0) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
			if (arr[left] >= 0) {
				left++;
			}
			if (arr[right] < 0) {
				right--;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 12, -7, 5, -3, 9, -2, -8, 4, 10 };
		rearrange(arr);
		System.out.println("Rearranged array: " + Arrays.toString(arr));
	}
}
