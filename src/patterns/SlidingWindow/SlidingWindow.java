package patterns.SlidingWindow;

public class SlidingWindow {

    //Finding the sum of subarray
    SlidingWindowMaxSum slidingWindowMaxSum = new SlidingWindowMaxSum();
    public void maxSumSubarrayMethod() {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int result = slidingWindowMaxSum.maxSumSubarrayMethod(arr, k);
        System.out.println("Sliding Window: Maximum sum of subarray of size " + k + " is: " + result);
    }

    //Finding the Maximum Average of the size k

    public void findMaxAverageSlidingWindow(){
        int[] arr = {2, 7, 5, 1, 3, 9};
        int k = 3;
        double result = slidingWindowMaxSum.findMaxAverageSlidingWindow(arr, k);
        System.out.println("Sliding Window: Maximum Average of subarray of size " + k + " is: " + result);
    }
    public void lengthOfLongestSubstringSlidingWindow(){
        String str = "jilani";
        int result = slidingWindowMaxSum.lengthOfLongestSubstringSlidingWindow(str);
        System.out.println("Sliding Window: Maximum lenght of substring is: " + result);
    }

    public void lengthOfLongestSubstringSlidingWindowFrequencyArray(){
        String str = "gulamjilani";
        int result = slidingWindowMaxSum.lengthOfLongestSubstringSlidingWindowFrequencyArray(str);
        System.out.println("Sliding Window: Lenght of the Unique longest substring is: " + result);
    }


}
