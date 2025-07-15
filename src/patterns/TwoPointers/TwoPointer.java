package patterns.TwoPointers;


import patterns.TwoPointers.codes.CountUniqueValues;
import patterns.TwoPointers.codes.PairSumZero;
import patterns.TwoPointers.codes.RemoveDuplicates;
import patterns.TwoPointers.codes.TwoSumPointer;

import java.util.Arrays;

public class TwoPointer {

    // Two Pointer sum of a target in the sorted array
    TwoSumPointer twoSumPointer = new TwoSumPointer();
    public void twoSumPointerMethod(){
        int[] arr = {2, 7, 11, 15};
        int target = 18;
        int[] result = twoSumPointer.twoSum(arr, target);
//        System.out.println("Indices: " + result[0] + ", " + result[1]);
        System.out.println("Two Pointer: Sum of a target, Output: [" + result[0] + ", " + result[1] + "]");
    }

    //Removing duplicates from sorted arrays
     RemoveDuplicates removeDuplicates = new RemoveDuplicates();
       public void removeDuplicatesMethod(){
           int[] arr = {3,3, 4, 5, 7, 8, 9, 9, 12};
           removeDuplicates.removeDuplicatesMethod(arr);
       }
       // Count Duplicates Values
    CountUniqueValues countUniqueValues = new CountUniqueValues();
    public void countUniqueValuesMethod(){
        int[] arr = {3,3, 4, 5, 7, 8, 9, 9, 12};
        int result = countUniqueValues.countUniqueElement(arr);
        System.out.println("Two Pointer: Count Unique Values: " +result);
    }

    // Pair Sum Zero
    PairSumZero pairSumZero = new PairSumZero();
    public void pairSumZeromethod(){
        int[] arr = {-3, -2, 0, 2, 5, 10};
        int[] result = pairSumZero.findSumZeroPair(arr);
        System.out.println("Two Pointer: Sum Zero: " + Arrays.toString(result));
    }



}
