package patterns.TwoPointers.codes;

import java.util.Arrays;

public class ArrayEqualityChecker {

    public boolean twoArraysAreEqual(int[] arr1, int[] arr2) {
        // If lengths are different, they can't be equal
        if (arr1.length != arr2.length) {
            return false;
        }
        // Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare element by element
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
}
