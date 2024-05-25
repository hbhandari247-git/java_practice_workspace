package proc;

public class PalindromeTest {

	public static void main(String[] args) {
		String[] stringArray = {"MADAM", "ASUS", "12321","125321"};
		for (String stringParam : stringArray) {
			if (checkIfNumOrStringIsAPalindrome(stringParam)) {
				System.out.println(stringParam + " ::::Palindrome Success!!");
			} else {
				System.out.println(stringParam + " ::::Palindrome Fail!!");
			}			
		}
	}

	/**
	 * checkIfNumOrStringIsAPalindrome
	 * @param stringParam
	 * @return isPalindrome [ true / false ]
	 */
	public static boolean checkIfNumOrStringIsAPalindrome(String stringParam) {
		boolean isPalindrome = false;
		if (new StringBuffer(stringParam).reverse().toString().equalsIgnoreCase(stringParam)) {
			isPalindrome = true;
		} else {
			isPalindrome = false;
		}
		return isPalindrome;
	}

}
