package leetcode;

/**
 * You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * f(n)=f(n−1)+f(n−2)
 */
public class ClimbStairs {
	public static void main(String[] args) {
		System.out.println(climbStairs(4));
	}

	public static int climbStairs(int n) {
		int prev1 = 1; // dp[i - 1]
		int prev2 = 1; // dp[i - 2]

		for (int i = 2; i <= n; ++i) {
			final int dp = prev1 + prev2;
			prev2 = prev1;
			prev1 = dp;
		}

		return prev1;
	}

}