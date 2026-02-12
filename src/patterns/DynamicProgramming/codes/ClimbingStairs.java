/*
🧩 Problem Statement:
You are climbing stairs. Each time you can climb 1 or 2 steps.
How many distinct ways to climb to the top (n steps)?

⌨️ Input:
n = 4

📤 Output: 5
(Ways: 1-1-1-1, 1-2-1, 2-1-1, 1-1-2, 2-2)
 */

package patterns.DynamicProgramming.codes;

public class ClimbingStairs {

    public int climbStairs(int n) {
        if (n <= 2) return n;
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
