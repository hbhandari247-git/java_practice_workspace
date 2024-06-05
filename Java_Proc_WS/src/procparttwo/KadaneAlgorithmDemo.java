package procparttwo;

public class KadaneAlgorithmDemo {
	public static void main(String[] args) {
		int[] intArray = { -2, 3, 4, -1, 2, 1, -5, 3 };

		int answer = Integer.MIN_VALUE;

		int curr_sum = 0;

		for (int i = 0; i < intArray.length; i++) {
			curr_sum += intArray[i];
			answer = Math.max(answer, curr_sum);
			if (curr_sum < 0) {
				curr_sum = 0;
			}
		}
		System.out.println(answer);
	}
}
