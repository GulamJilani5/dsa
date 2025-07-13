package patterns.TwoPointers;

public class TwoPointer {

    //1. Two Pointer sum of a target in the sorted array
    TwoSumPointer twoSumPointer = new TwoSumPointer();

    public void twoSumPointerMethod(){
        int[] arr = {2, 7, 11, 15};
        int target = 18;
        int[] result = twoSumPointer.twoSum(arr, target);
//        System.out.println("Indices: " + result[0] + ", " + result[1]);
        System.out.println("Two Pointer: Sum of a target, Output: [" + result[0] + ", " + result[1] + "]");

    }

    //2. Removing duplicates from sorted arrays
     RemoveDuplicates removeDuplicates = new RemoveDuplicates();

       public void removeDuplicatesMethod(){
           int[] arr = {3,3, 4, 5, 7, 8, 9, 9, 12};

           removeDuplicates.removeDuplicatesMethod(arr);

       }
}
