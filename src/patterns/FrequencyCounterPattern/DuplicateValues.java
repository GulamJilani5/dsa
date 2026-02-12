package patterns.FrequencyCounterPattern;

import java.util.HashMap;
import java.util.Map;

public class DuplicateValues {

    public void findDuplicates() {

        int[] arr = {2, 10, 3, 5, 4, 5, 3, 2};

        Map<Integer, Integer> map = new HashMap<>();

        // Count occurrences
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Print duplicate values
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Frequency counter Pattern - Unique values are:" +entry.getKey());
            }
        }
    }
}
