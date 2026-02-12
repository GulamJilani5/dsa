package patterns.PrefixAndSuffixPattern.codes;

import java.util.Arrays;

public class SumExceptSelf {


    //Method 1
    /*
    public int[] sumExceptSelf(int[] arr){
        int len = arr.length;
        int[] prefix = new int[len];
        int[] suffix = new int[len];

        prefix[0] = 0;
//        System.out.println("prefix sum before: " + Arrays.toString(prefix));
        for (int i = 1; i < len; i++){
             prefix[i] = prefix[i - 1] + arr[i - 1];
        }
//        System.out.println("prefix sum after: " + Arrays.toString(prefix));

        suffix[len - 1] = 0;
//        System.out.println("suffix sum before: " + Arrays.toString(suffix));
        for (int j = len - 2; j >= 0; j--){
             suffix[j] = suffix[j + 1] + arr[ j + 1];
        }

//        System.out.println("suffix sum after: " + Arrays.toString(suffix));

        for (int k =0; k < len; k ++){
          arr[k] = prefix[k] + suffix[k];
        }
        return arr;
    }

 */

    //Optimized

    public int[] sumExceptSelf(int[] arr){
        int len = arr.length;
        int[] prefix = new int[len];


        prefix[0] = 0;
//        System.out.println("prefix sum before: " + Arrays.toString(prefix));
        for (int i = 1; i < len; i++){
             prefix[i] = prefix[i - 1] + arr[i - 1];
        }
//        System.out.println("prefix sum after: " + Arrays.toString(prefix));

        int rightSum = 0;
        for (int j = len - 1; j >= 0; j--){
             prefix[j] = prefix[j] + rightSum;
             rightSum =  rightSum + arr[j];
        }
        System.out.println("Result: " + Arrays.toString(prefix));

        return prefix;
    }



}
