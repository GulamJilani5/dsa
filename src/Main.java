import BasicPrograms.arrays.ArrayClass;
import BasicPrograms.strings.StringClass;
import patterns.DynamicProgramming.DynamicProgramming;
import patterns.FastAndSlowPointer.FastAndSlowPointer;
import patterns.FrequencyCounterPattern.DuplicateValues;
import patterns.FrequencyCounterPattern.FrequencyCounterPattern;
import patterns.PrefixAndSuffixPattern.PrefixAndSuffix;
import patterns.PrefixSum.PrefixSum;
import patterns.SlidingWindow.SlidingWindow;
import patterns.TwoPointers.TwoPointer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Two Pointer
        TwoPointer twoPointer = new TwoPointer();
//        twoPointer.twoSumPointerMethod();
//        twoPointer.removeDuplicatesMethod();
//          twoPointer.countUniqueValuesMethod();
//           twoPointer.pairSumZeromethod();


        // Sliding Window
        SlidingWindow slidingWindow = new SlidingWindow();
//        slidingWindow.maxSumSubarrayMethod();
//        slidingWindow.findMaxAverageSlidingWindow();
//        slidingWindow.lengthOfLongestSubstringSlidingWindow();
//        slidingWindow.lengthOfLongestSubstringSlidingWindowFrequencyArray();

        // Dynamic programming
        DynamicProgramming dynamicProgramming = new DynamicProgramming();
//        dynamicProgramming.LenghtOfLongestIncreasingSubsequence();
//        dynamicProgramming.longestSubsequence();
//        dynamicProgramming.houseRobber();
//        dynamicProgramming.fibonacciNumber();
//        dynamicProgramming.climbingStairs();
//        dynamicProgramming.knapsackMethod();

        // Frequncy Count
        FrequencyCounterPattern frequencyCounterPattern = new FrequencyCounterPattern();
        DuplicateValues duplicateValues = new DuplicateValues();
//        frequencyCounterPattern.charFrequncyCount();
//        duplicateValues.findDuplicates();


        // Prefix Sum
        PrefixSum prefixSum = new PrefixSum();
//        prefixSum.prefixSumMethod();



        // ARRAY
        ArrayClass arrayClass = new ArrayClass();
//      arrayClass.maxAndMinValuesMethod();
//        arrayClass.productOfArrayMethod();
//        arrayClass.twoArraysExponentSameOrNotMethod();
//        arrayClass.arrayEqualityCheckerMethod();

        // STRING
        StringClass stringClass = new StringClass();
//        stringClass.capitalizeFirstCharacterMethod();
//        stringClass.capitalizeWordsMethod();
//        stringClass.collectStringMethod();
//        stringClass.countCharacterMethod();
//        stringClass.substringSearchMethod();

        //Prefix And Suffix Pattern
        PrefixAndSuffix prefixAndSuffix = new PrefixAndSuffix();
//        prefixAndSuffix.productExceptSelfMethod();
//        prefixAndSuffix.sumExceptSelfMethod();

        // Fast And Slow Pointer
        FastAndSlowPointer fastAndSlowPointer = new FastAndSlowPointer();
        fastAndSlowPointer.fastAndSlowPointerExample();

    }
}