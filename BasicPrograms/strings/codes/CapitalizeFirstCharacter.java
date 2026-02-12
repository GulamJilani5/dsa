package BasicPrograms.strings.codes;

import java.util.ArrayList;
import java.util.List;

public class CapitalizeFirstCharacter {

    //Method 1
    public List<String> capitalizeFirst(List<String> arr) {
        // Base Case
        if (arr.isEmpty()) {
            return new ArrayList<>();
        }

        String word = arr.get(0);
        String capitalized = word.substring(0, 1).toUpperCase() + word.substring(1);

        List<String> result = new ArrayList<>();
        result.add(capitalized);
        result.addAll(capitalizeFirst(arr.subList(1, arr.size())));

        return result;
    }

    /*
    // Method 2
    public static List<String> capitalizeWords(List<String> arr) {
        List<String> finalArr = new ArrayList<>();

        for (String el : arr) {
            if (!el.isEmpty()) {
                String firstChar = el.substring(0, 1).toUpperCase();
                String capitalized = firstChar + el.substring(1);
                finalArr.add(capitalized);
            } else {
                finalArr.add(el); // handle empty string case
            }
        }

        return finalArr;
    }

     */
}
