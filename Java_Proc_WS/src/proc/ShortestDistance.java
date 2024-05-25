package proc;

/**
 * Java code to implement the below approach: Find the minimum distance between
 * the given two words
 * 
 * Input: S = { “the”, “quick”, “brown”, “fox”, “quick”}, word1 = “the”, word2 =
 * “fox” Output: 3 Explanation: Minimum distance between the words “the” and
 * “fox” is 3
 * 
 * Input: S = {“geeks”, “for”, “geeks”, “contribute”, “practice”}, word1 =
 * “geeks”, word2 = “practice” Output: 2 Explanation: Minimum distance between
 * the words “geeks” and “practice” is 2
 * 
 * @author Himanshu Bhandari
 *
 */
public class ShortestDistance {

	// Function to return shortest distance
	static int shortestDistance(String[] s, String word1, String word2) {
		int d1 = -1, d2 = -1;
		int ans = Integer.MAX_VALUE;

		// Traverse the string
		for (int i = 0; i < s.length; i++) {
			if (s[i] == word1)
				d1 = i;
			if (s[i] == word2)
				d2 = i;
			if (d1 != -1 && d2 != -1)
				ans = Math.min(ans, Math.abs(d1 - d2));
		}

		// Return the answer
		return ans;
	}

	// Driver Code
	public static void main(String[] args) {
		String[] S = {"geeks", "for", "geeks", "contribute", "practice"};

		String word1 = "geeks", word2 = "practice";

		// Function Call
		System.out.println(shortestDistance(S, word1, word2));
	}
}