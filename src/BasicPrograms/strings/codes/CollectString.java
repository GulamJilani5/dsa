package BasicPrograms.strings.codes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CollectString {

    // Method 1: Helper Method Recursion
    public List<String> collectStrings(Map<String, Object> obj) {
        List<String> stringArr = new ArrayList<>();

        class Helper {
            void gatherStrings(Map<String, Object> ob) {
                for (Map.Entry<String, Object> entry : ob.entrySet()) {
                    Object value = entry.getValue();
                    if (value instanceof String) {
                        stringArr.add((String) value);
                    } else if (value instanceof Map) {
                        //noinspection unchecked
                        gatherStrings((Map<String, Object>) value);
                    }
                }
            }
        }
        new Helper().gatherStrings(obj);
        return stringArr;
    }
        /*
            // Method 2: Pure Recursion
            public  List<String> collectStrings(Map<String, Object> obj) {
                List<String> stringArr = new ArrayList<>();

                for (Map.Entry<String, Object> entry : obj.entrySet()) {
                    Object value = entry.getValue();
                    if (value instanceof String) {
                        stringArr.add((String) value);
                    } else if (value instanceof Map) {
                        //noinspection unchecked
                        stringArr.addAll(collectStrings((Map<String, Object>) value));
                    }
                }

                return stringArr;
            }

         */


    }
