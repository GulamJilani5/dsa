package BasicPrograms.arrays.codes;

import java.util.ArrayList;
import java.util.List;

public class TwoArraysExponentSameOrNot {

    public static boolean isSameSquared(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        List<Integer> arr2List = new ArrayList<>();
        for (int num : arr2) {
            arr2List.add(num);
        }

        for (int value : arr1) {
            int square = value * value;
            if (!arr2List.contains(square)) {
                return false;
            }
            // remove first occurrence (like splice in JS)
            arr2List.remove(Integer.valueOf(square));
        }

        return true;
    }
}
