package procparttwo;

public class PracticeUtilityClass {
	public static void main(String[] args) {
		System.out.println(checkIfPrime(5));

		int high_end = 10;
		int low_end = 1;
		while (low_end <= high_end) {
			boolean flag = false;
			for (int j = 2; j <= low_end / 2; j++) {
				if (low_end % j == 0) {
					flag = true;
					break;
				}
			}
			if (!flag && low_end != 1 && low_end != 0) {
				System.out.print(low_end + " ");
			}
			low_end++;

		}

	}

	private static boolean checkIfPrime(int num) {
		if (num <= 1) {
			return false;
		}

		boolean isPrime = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}

		return isPrime;

	}
}
