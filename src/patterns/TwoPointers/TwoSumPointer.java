/***********************************************************************************************
 * ******************* Problem Statement:
Given a sorted array of integers and a target, return the indices (0-based) of the two numbers that
add up to the target.
* ****************************************************************************
 ****************************  Example:
 Input: arr = [2, 7, 11, 15], target = 9
 Output: [0, 1]
 Explanation: arr[0] + arr[1] = 2 + 7 = 9

***************************************************************************************************/

package patterns.TwoPointers;

public class TwoSumPointer {

    public int[] twoSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                return new int[] {left, right}; // 0-based index
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[] {-1, -1}; // no valid pair found
    }

}
