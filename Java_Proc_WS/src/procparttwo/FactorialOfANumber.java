package procparttwo;

import java.math.BigInteger;

public class FactorialOfANumber {
	public static void main(String[] args) {
		findFactorial(5);
	}

	public static void findFactorial(int n) {
		BigInteger factorial = BigInteger.ONE; // Initialize with 1
		BigInteger i = BigInteger.ONE; // Start with 1
		BigInteger limit = BigInteger.valueOf(n); // Set limit to n

		for (; i.compareTo(limit) <= 0; i = i.add(BigInteger.ONE)) {
			factorial = factorial.multiply(i);
		}

		System.out.println(factorial);
	}
}