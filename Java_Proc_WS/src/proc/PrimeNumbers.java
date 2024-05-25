package proc;

public class PrimeNumbers {

	static void checkIfPrime(int num) {
		boolean isPrime = true;
		/**
		 * Number < 2 are not prime
		 */
		if (num < 2) {
			isPrime = false;
		}
		/**
		 * Loop Starts from 2 being the first prime number
		 * Also, a number won't be divided more than its half
		 */
		for (int i = 2; i <= num/2 ; i++) {
			if (num % i == 0) {
				isPrime = false;
			}
		}
		/**
		 * Check if number is prime or not using boolean flag.
		 */
		if (isPrime) { 
			System.out.println("Number is Prime");
		} else {
			System.out.println("Number is not Prime");
		}
	}
	
	public static void main(String[] args) {
		PrimeNumbers.checkIfPrime(37);
	}

}
