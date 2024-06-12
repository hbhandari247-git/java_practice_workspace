package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicatesInAnArray {

	public static int[] findDuplicates(int[] nums) {
		List<Integer> duplicates = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			int index = Math.abs(nums[i]) - 1;
			if (nums[index] < 0) {
				duplicates.add(Math.abs(nums[i]));
			} else {
				nums[index] = -nums[index];
			}
		}

		int[] duplicateArray = duplicates.stream().mapToInt(Integer::intValue).toArray();

		return duplicateArray;
	}

	public static void main(String[] args) {
		int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
		System.out.println("Duplicates: " + Arrays.toString(findDuplicates(nums))); // Output: [2, 3]
	}
}
