/*
🧩 Problem Statement:
You are a robber and can't rob two adjacent houses.
Given nums (money in each house), return max money you can rob.

⌨️ Input:
nums = [2,7,9,3,1]

📤 Output:
12 (Rob 2 + 9 + 1)
 */

package patterns.DynamicProgramming.codes;

public class HouseRobber {

    public int rob(int[] arr) {
        if (arr.length == 0) return 0;
        if (arr.length == 1) return arr[0];

        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);

        for (int i = 2; i < arr.length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + arr[i]);
        }
        return dp[arr.length - 1];
    }




}
