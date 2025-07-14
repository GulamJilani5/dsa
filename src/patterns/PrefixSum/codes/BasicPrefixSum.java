package patterns.PrefixSum.codes;

public class BasicPrefixSum {


    public int[] basicPrefixSum(int[] arr){

        int len = arr.length;
        int[] prefixSumArr = new int[len];

        // intial value at index 0
        prefixSumArr[0] = arr[0];

        for (int i = 1; i < len; i++){
            prefixSumArr[i] = prefixSumArr[i - 1] + arr[i];
        }
        return prefixSumArr;
    }
}
