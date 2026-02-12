package patterns.TwoPointers.codes;

public class PairSumZero {

    public static int[] findSumZeroPair(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == 0) {
                return new int[]{arr[left], arr[right]};
            } else if (sum > 0) {
                right--;
            } else {
                left++;
            }
        }

        return null; // No pair found
    }
}
