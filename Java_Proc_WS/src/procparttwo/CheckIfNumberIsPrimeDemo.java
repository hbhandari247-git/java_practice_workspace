package procparttwo;

public class CheckIfNumberIsPrimeDemo {
	public static void main(String[] args) {
		int number = 2;
		boolean flag = false;

		if (number <= 1) {
			flag = true;
		}

		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("Number is prime");
		} else {
			System.out.println("Number is not prime");
		}
	}

}
