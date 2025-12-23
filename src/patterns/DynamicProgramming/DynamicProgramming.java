package patterns.DynamicProgramming;

import patterns.DynamicProgramming.codes.*;

public class DynamicProgramming {

    LengthOfLIS lengthOfLIS = new LengthOfLIS();

    // Find the lenght of the longest strictly increasing subsequence
    public void LenghtOfLongestIncreasingSubsequence() {
        int[] arr = { 10, 9, 2, 5, 3, 7, 101, 18 };
        int result = lengthOfLIS.findLengthOfLIS(arr);
        System.out.println(
                "Dynamic Programming || LIS - Lenght of the Longest Strictly Increasing Subsequence is: " + result);

    }

    // length of the longest common subsequence
    LongestCommonSubsequence longestCommonSubsequence = new LongestCommonSubsequence();

    public void longestSubsequence() {
        String str1 = "abcde";
        String str2 = "ace";
        int result = longestCommonSubsequence.longestCommonSubsequence(str1, str2);
        System.out.println(
                "Dynamic Programming || Longest Common Subsequence - Lenght of the Longest Strictly Increasing Subsequence is: "
                        + result);

    }

    // House Robber
    HouseRobber houseRobber = new HouseRobber();

    public void houseRobber() {
        int[] arr = { 2, 7, 9, 3, 1 };
        int result = houseRobber.rob(arr);

        System.out.println("Dynamic Programming || House Robber - Robbing Money is: " + result);

    }

    // Fibonacci Number
    FibonacciNumber fibonacciNumber = new FibonacciNumber();

    public void fibonacciNumber() {
        int n = 5;
        int result = fibonacciNumber.fib(n);

        System.out.println("Dynamic Programming || Fibonacci Number - Robbing Money is: " + result);

    }

    // Climbing Stairs
    ClimbingStairs climbingStairs = new ClimbingStairs();

    public void climbingStairs() {
        int n = 5;
        int result = climbingStairs.climbStairs(n);

        System.out.println("Dynamic Programming || Climbing Stairs - Robbing Money is: " + result);

    }

    // 0/1 Knapsack
    Knapsack knaps = new Knapsack();

    public void knapsackMethod() {
        int[] weighs = { 1, 3, 4, 5 };
        int[] values = { 1, 4, 5, 7 };
        int capacity = 7;
        int result = knaps.knapsack(weighs, values, capacity);

        System.out.println("Dynamic Programming || 0/1 Knapsack - max value is: " + result);

    }

}
