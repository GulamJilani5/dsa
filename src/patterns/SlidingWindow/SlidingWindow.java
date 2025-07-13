package patterns.SlidingWindow;

public class SlidingWindow {

    //Finding the sum of subarray
    MaxSumSubArray maxSumSubArray = new MaxSumSubArray();
    public void maxSumSubarrayMethod() {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int result = maxSumSubArray.findMaxSum(arr, k);
        System.out.println("Maximum sum of subarray of size " + k + " is: " + result);
    }

}
