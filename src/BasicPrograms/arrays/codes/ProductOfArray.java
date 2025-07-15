package BasicPrograms.arrays.codes;

public class ProductOfArray {

    public static int productOfArray(int[] arr) {
        return helper(arr, 0); // internally call helper with starting index
    }

    private static int helper(int[] arr, int index) {
        if (index == arr.length) {
            return 1;
        }
        return arr[index] * helper(arr, index + 1);
    }
}
