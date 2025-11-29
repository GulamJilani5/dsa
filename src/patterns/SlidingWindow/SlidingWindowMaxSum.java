/*****************************************************************************************************
 * ***************************************
 * ************************
 * *********


 ******************************************************************************************************/

package patterns.SlidingWindow;

import java.util.HashSet;

public class SlidingWindowMaxSum {

    public int maxSumSubarrayMethod(int[] arr, int k) {
        int n = arr.length;

        // Edge case
        if (n < k) {
            System.out.println("Subarray size k is larger than array length.");
        }

        // Step 1: Compute sum of first k elements
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        // Step 2: Slide the window
        for (int i = k; i < n; i++) {
            windowSum += arr[i] - arr[i - k]; // add new element, remove old one element: only one addition and one
                                              // subtraction per step.
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public double findMaxAverageSlidingWindow(int[] nums, int k) {
        int n = nums.length;

        // Compute the sum of the first 'k' elements
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        // Initialize maxSum as the sum of the first window
        int maxSum = windowSum;

        // Slide the window across the array
        for (int i = k; i < n; i++) {
            windowSum += nums[i]; // Add new element entering window
            windowSum -= nums[i - k]; // Remove element leaving window
            maxSum = Math.max(maxSum, windowSum); // Update maxSum
        }

        // Return maximum average
        return (double) maxSum / k;
    }

    public int lengthOfLongestSubstringSlidingWindow(String str) {
        int n = str.length();
        HashSet<Character> seen = new HashSet<>(); // Store characters in the current window
        int maxLength = 0;
        int left = 0;

        // Expand window by moving 'right'
        for (int right = 0; right < n; right++) {
            // If a duplicate is found, shrink the window from the left
            while (seen.contains(str.charAt(right))) {
                seen.remove(str.charAt(left));
                left++;
            }
            // Add current character to window and update max length
            seen.add(str.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    // Find the length of the longest substring without repeating characters using
    // the Sliding Window technique.
    // Input: "abcabcbb"
    // Output: 3
    // Explanation: Longest substring without repeating characters is "abc"
    public int lengthOfLongestSubstringSlidingWindowFrequencyArray(String s) {
        int n = s.length();
        int[] freq = new int[128]; // ASCII character frequency array
        int maxLength = 0;
        int left = 0;

        // Expand window by moving 'right'
        for (int right = 0; right < n; right++) {
            char currentChar = s.charAt(right);
            freq[currentChar]++; // Increase frequency of the current character

            // If there is a duplicate, shrink the window from the left
            while (freq[currentChar] > 1) {
                freq[s.charAt(left)]--; // Remove character at left pointer
                left++; // Shrink window
            }

            // Update maximum window size
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

}
