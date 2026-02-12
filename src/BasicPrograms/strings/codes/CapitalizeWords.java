package BasicPrograms.strings.codes;

import java.util.ArrayList;
import java.util.List;

public class CapitalizeWords {

    public List<String> capitalizedWords(List<String> arr) {
        List<String> result = new ArrayList<>();
        if (arr.isEmpty()) return result;

        // Base case
        if (arr.size() == 1) {
            result.add(arr.get(0).toUpperCase());
            return result;
        }

        // Recursive case
        result.add(arr.get(0).toUpperCase());
        result.addAll(capitalizedWords(arr.subList(1, arr.size())));
        return result;
    }


    /*
    // METHOD 2
    public static List<String> capitalizedWords(List<String> array) {
        // Base case
        if (array.size() == 1) {
            List<String> base = new ArrayList<>();
            base.add(array.get(0).toUpperCase());
            return base;
        }

        // Recursive call
        List<String> res = capitalizedWords(array.subList(0, array.size() - 1));
        res.add(array.get(array.size() - 1).toUpperCase());
        return res;
    }

     */

    // METHOD 3
  /*
    public static List<String> capitalizedWords(List<String> arr) {
        List<String> finalArr = new ArrayList<>();
        for (String el : arr) {
            finalArr.add(el.toUpperCase());  // Convert whole word to uppercase
        }
        return finalArr;
    }

   */

}
