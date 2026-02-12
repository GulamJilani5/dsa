/*
🧩 Problem Statement:
Given n, return the nth Fibonacci number.
F(0) = 0, F(1) = 1, F(n) = F(n-1) + F(n-2)

⌨️ Input:
n = 5

📤 Output: 5

 */

package patterns.DynamicProgramming.codes;

public class FibonacciNumber {

    public int fib(int n) {
        if (n <= 1) return n;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

}
