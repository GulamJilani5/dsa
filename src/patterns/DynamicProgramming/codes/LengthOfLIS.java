/*
Problem Statement:
Given an array of integers, find the length of the longest strictly increasing subsequence.
A subsequence is a sequence that can be derived by deleting some or no elements without changing the order of the remaining elements.
"Strictly increasing" means every element in the subsequence is greater than the previous one.

Input: nums = [10, 9, 2, 5, 3, 7, 101, 18]

Output: 4
Explanation: The LIS is [2, 3, 7, 101]
*/


        package patterns.DynamicProgramming.codes;

public class LengthOfLIS {

    public int findLengthOfLIS(int[] arr){
        if(arr == null || arr.length == 0) return 0;

        int len = arr.length;

        int[] dpArray = new int[len];

        // Initialize each element of the dpArray as 1
        for(int i =0; i<len; i++) dpArray[i] = 1;

        //Compute the Longest Increasing Subsequence length for each element
        for(int i = 1; i < len; i++){
            for(int j =0; j < i; j++){
                if(arr[j] < arr[i]){
                    dpArray[i] = Math.max(dpArray[i], dpArray[j]+1);
                }
            }
        }

        //Find the maximum value in the dpArray
        int maxLenght = 1;
        for(int el : dpArray){
            if(maxLenght < el){
                maxLenght = el;
            }
        }


        return maxLenght;
    }
}
