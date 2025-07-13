package patterns.TwoPointers;

public class TwoPointer {

    //1. Two Pointer sum of a target in the sorted array
    TwoSumPointer twoSumPointer = new TwoSumPointer();

    public void twoSumPointerMethod(){
        int[] arr = {2, 7, 11, 15};
        int target = 18;
        int[] result = twoSumPointer.twoSum(arr, target);
//        System.out.println("Indices: " + result[0] + ", " + result[1]);
        System.out.println("Two Pointer Sum, Output: [" + result[0] + ", " + result[1] + "]");

    }
}
