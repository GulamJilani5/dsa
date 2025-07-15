package patterns.TwoPointers.codes;

public class CountUniqueValues{

    // Method 1
    public int countUniqueElement(int[] arr) {
        if (arr.length == 0) return 0;

        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j]; // overwrite to group unique values at the beginning
            }
        }
        return i + 1; // number of unique values
    }

    // Method 2
    /*
    public int countUniqueElement(int[] arr) {
        if (arr.length == 0) return 0;

        int left = 0;
        int next = left + 1;

        while (next < arr.length) {
            if (arr[left] == arr[next]) {
                next++;
            } else {
                left++;
                arr[left] = arr[next]; // overwrite the duplicate position
                next++;
            }
        }

        return left + 1; // total count of unique values
    }

     */

}
