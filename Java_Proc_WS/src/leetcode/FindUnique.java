package leetcode;

public class FindUnique {
	public static void main(String[] args) {
		int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
		int unique = findUnique(nums);
		System.out.println("Unique: " + unique);
	}

	public static int findUnique(int[] nums) {
		int xor = 0;
		for (int num : nums) {
			xor ^= num;
		}
		return xor;
	}
}
