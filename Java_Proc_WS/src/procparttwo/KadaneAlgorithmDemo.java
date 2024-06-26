package procparttwo;

public class KadaneAlgorithmDemo {
	// Driver Code
	public static void main(String[] args) {
		int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
		int[] intArray = { -2, 3, 4, -1, 2, 1, -5, 3 };
		int[] intArray2 = { -2, -3, -4, -1, -2, -1, -5, -3 };
		System.out.println("Maximum contiguous sum is " + maxSubArraySum(a));
		System.out.println("Maximum contiguous sum is " + maxSubArraySum(intArray));
		System.out.println("Maximum contiguous sum is " + maxSubArraySum(intArray2));
	}

	// Function Call
	public static int maxSubArraySum(int a[]) {
		int size = a.length;
		int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

		for (int i = 0; i < size; i++) {
			max_ending_here = max_ending_here + a[i];
			if (max_so_far < max_ending_here)
				max_so_far = max_ending_here;
			if (max_ending_here < 0)
				max_ending_here = 0;
		}
		if (max_so_far < 0) {
			max_so_far = 0;
		}
		return max_so_far;
	}
}
