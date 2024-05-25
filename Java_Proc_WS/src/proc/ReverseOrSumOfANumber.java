package proc;

public class ReverseOrSumOfANumber {

	public static void main(String[] args) {
		int number = 153;
		doReverseOfNumber(number);
		doSumOfDigitsOfNumber(number);
		isArmstrongNumber(number);
	}

	public static void isArmstrongNumber(int number) {
		int sum = 0;
		int originalNumber = number;
		while (number != 0) {
			int i = number;
			number = number % 10;
			sum = sum + ( number * number * number );
			number = i / 10;
		}
		System.out.println("Is Armstrong Number?? : " + (sum == originalNumber) );
	}

	public static void doReverseOfNumber(int number) {
		int reversedNumber = 0;
		int i = 0;
		while (number != 0) {
			i = number;
			number = number % 10;
			reversedNumber = reversedNumber * 10 + number;
			number = i / 10;
		}
		System.out.println("REVERSE of the number is : " + reversedNumber);
	}

	public static void doSumOfDigitsOfNumber(int number) {
		int sum = 0;
		while (number != 0) {
			int i = number;
			number = number % 10;
			sum = sum + number;
			number = i / 10;
		}
		System.out.println("SUM of the digits of the number is : " + sum);
	}

}
