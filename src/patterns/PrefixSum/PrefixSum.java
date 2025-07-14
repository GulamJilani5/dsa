package patterns.PrefixSum;

import patterns.PrefixSum.codes.BasicPrefixSum;

import java.util.Arrays;

public class PrefixSum {

     BasicPrefixSum basicPrefixSum = new BasicPrefixSum();


    public void prefixSumMethod(){

        // Basic Prefix Sum
         int[] arr = {3, 2, 5, 6, 8 };
        int[] result = basicPrefixSum.basicPrefixSum(arr);
//        System.out.println("Sum" + result);
        System.out.println("Prefix Sum:  " + Arrays.toString(result));
    }



}
