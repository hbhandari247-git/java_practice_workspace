package proc;

public class TesterOne {
	public static void main(String[] args) {
		int num = 343;
		System.out.println(num / 10 - 2 * (num - num / 10 * 10));

		System.out.println(2657860 & (16 - 1)); // BITWISE AND OPERATOR

		String original, reverse = ""; // Objects of String class
		original = "GAS";
		int length = original.length();
		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);
		if (original.equals(reverse))
			System.out.println("Entered string/number is a palindrome.");
		else
			System.out.println("Entered string/number isn't a palindrome.");
	}
}
