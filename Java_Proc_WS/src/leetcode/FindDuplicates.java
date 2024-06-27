package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {
	public static void main(String[] args) {
		//int[] nums = { 4, 3, 1 };
        //int[] nums = {4, 3, 2, 7, 8, 2, 3, 1, 10, 10, 11, 11};
        int[] nums = {4, 4};

		List<Integer> duplicates = findDuplicates(nums);
		System.out.println("Duplicates: " + duplicates);
	}

	public static List<Integer> findDuplicates(int[] nums) {
		List<Integer> duplicates = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			int index = Math.abs(nums[i]) - 1;

			// Ensure index is within bounds
			if (index >= nums.length) {
				continue;
			}

			if (nums[index] < 0) {
				duplicates.add(Math.abs(nums[i]));
			} else {
				nums[index] = -nums[index];
			}
		}

		// Optional: Restore the original array
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Math.abs(nums[i]);
		}

		return duplicates;
	}
}
