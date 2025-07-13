/*****************************************************************************************************
 * ***************************************
 * ************************
 * *********


 ******************************************************************************************************/

package patterns.SlidingWindow;

public class MaxSumSubArray {

    public int findMaxSum(int[] arr, int k) {
        int n = arr.length;

        // Edge case
        if (n < k) {
            throw new IllegalArgumentException("Subarray size k is larger than array length.");
        }

        // Step 1: Compute sum of first k elements
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        // Step 2: Slide the window
        for (int i = k; i < n; i++) {
            windowSum += arr[i] - arr[i - k]; // add new element, remove old one
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}
