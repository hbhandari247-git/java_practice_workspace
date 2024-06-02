package procparttwo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicates {

	public static List<Integer> findDuplicates(int[] nums) {
		Map<Integer, Integer> countMap = new HashMap<>();
		List<Integer> duplicates = new ArrayList<>();

		// Count the occurrences of each number
		for (int num : nums) {
			countMap.put(num, countMap.getOrDefault(num, 0) + 1);
		}

		// Collect numbers that appear more than once
		for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
			if (entry.getValue() > 1) {
				duplicates.add(entry.getKey());
			}
		}
        //int[] result = duplicates.stream().mapToInt(Integer::intValue).toArray();

		return duplicates;
	}

	public static void main(String[] args) {
		int[] input = { 1, 1, 5, 6, 6, 7, 8, 8 };
		List<Integer> duplicates = findDuplicates(input);

		System.out.println("Duplicate elements are: " + duplicates);
	}
}
