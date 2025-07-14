import patterns.DynamicProgramming.DynamicProgramming;
import patterns.FrequencyCounterPattern.FrequencyCounterPattern;
import patterns.PrefixSum.PrefixSum;
import patterns.SlidingWindow.SlidingWindow;
import patterns.TwoPointers.TwoPointer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Two Pointer
//        TwoPointer twoPointer = new TwoPointer();
//        twoPointer.twoSumPointerMethod();
//        twoPointer.removeDuplicatesMethod();

        // Sliding Window
        SlidingWindow slidingWindow = new SlidingWindow();
//        slidingWindow.maxSumSubarrayMethod();
//        slidingWindow.findMaxAverageSlidingWindow();
//        slidingWindow.lengthOfLongestSubstringSlidingWindow();
//        slidingWindow.lengthOfLongestSubstringSlidingWindowFrequencyArray();

        // Dynamic programming
        DynamicProgramming dynamicProgramming = new DynamicProgramming();
        dynamicProgramming.LenghtOfLongestIncreasingSubsequence();
        dynamicProgramming.longestSubsequence();
        dynamicProgramming.houseRobber();
        dynamicProgramming.fibonacciNumber();
        dynamicProgramming.climbingStairs();
        dynamicProgramming.knapsackMethod();

        // Frequncy Count
//        FrequencyCounterPattern frequencyCounterPattern = new FrequencyCounterPattern();
//        frequencyCounterPattern.charFrequncyCount();


        // Prefix Sum
        PrefixSum prefixSum = new PrefixSum();
//        prefixSum.prefixSumMethod();

    }
}