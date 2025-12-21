package patterns.PrefixAndSuffixPattern.codes;

import java.util.Arrays;

public class ProductExceptSelf {

    // Using prefix and suffix array which increases the size and one extra looping
    public int[] productExceptSelf(int[] arr) {

        int len = arr.length;
        int[] prefix = new int[len];
        // Step 1: Calculate prefix products
        prefix[0] = 1; // nothing on the left of first element
        for (int i = 1; i < len; i++) {
            prefix[i] = prefix[i - 1] * arr[i - 1];
        }
        System.out.println("Prefix array: " + Arrays.toString(prefix));

        // Step 2: Calculate suffix products
        int[] suffix = new int[len];
        suffix[len - 1] = 1;
        for (int i = len - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * arr[i + 1];

        }
        System.out.println("suffix array: " + Arrays.toString(suffix));

        // Multiplying the prefix and suffix array
        for (int k = 0; k < arr.length; k++) {
            arr[k] = prefix[k] * suffix[k];
        }

        return arr;

    }

    /*
     * // Optimized
     * public int[] productExceptSelf1(int[] arr){
     * 
     * int len = arr.length;
     * int[] output = new int[len];
     * 
     * // Step 1: Calculate prefix products
     * output[0] = 1; // nothing on the left of first element
     * for (int i = 1; i < len; i++) {
     * output[i] = output[i - 1] * arr[i - 1];
     * }
     * 
     * System.out.println("Prefix array: " + Arrays.toString(output));
     * 
     * // Step 2: Multiply with suffix products
     * int rightProduct = 1;
     * for (int i = len - 1; i >= 0; i--) {
     * output[i] = output[i] * rightProduct;
     * rightProduct *= arr[i];
     * }
     * 
     * for(int k = 0; k < arr.length - 1; k++){
     * 
     * }
     * 
     * return output;
     * 
     * }
     */

}

/*********************************
 *********************
 * 
 * 
 * 
 * ### ➡️ Product of Array except self
 * 
 * ```java
 * class Main {
 * public static void main(String[] args) {
 * 
 * int[] input = {1,2,3,4};
 * int len = input.length;
 * int[] result = new int[len];
 * int i =0;
 * while(i < len){
 * System.out.println("...");
 * int mult = 1;
 * for (int j = 0; j <= len - 1; j++){
 * if(j != i) {
 * mult = mult * input[j];
 * }
 * }
 * result[i] = mult;
 * i++;
 * }
 * 
 * for (int j = 0; j <= len - 1; j ++){
 * System.out.println("Input Array " +input[j]);
 * }
 * System.out.println("==================");
 * 
 * for (int j = 0; j <= len - 1; j ++){
 * System.out.println("Output Array " +result[j]);
 * }
 * 
 * }
 * }
 * ```
 * 
 * 
 *********************** 
 ************************************/
