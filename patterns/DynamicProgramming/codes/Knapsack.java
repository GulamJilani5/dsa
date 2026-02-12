/*
🧩 Problem Statement:
Given weights[], values[] and capacity, return max value in knapsack.
Input:
weights = [1, 3, 4, 5]
values = [1, 4, 5, 7]
capacity = 7

📤 Output:
9 (Pick weights 3 and 4 → 4 + 5 = 9)

 */

package patterns.DynamicProgramming.codes;

public class Knapsack {

    public int knapsack(int[] weights, int[] values, int capacity) {
        int n = weights.length;
        int[][] dp = new int[n + 1][capacity + 1];

        for (int i = 1; i <= n; i++) {
            for (int w = 0; w <= capacity; w++) {
                if (weights[i - 1] <= w) {
                    dp[i][w] = Math.max(
                            dp[i - 1][w],
                            dp[i - 1][w - weights[i - 1]] + values[i - 1]
                    );
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }
        return dp[n][capacity];
    }

}
