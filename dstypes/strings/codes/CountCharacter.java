package BasicPrograms.strings.codes;

import java.util.HashMap;
import java.util.Map;

public class CountCharacter {

    //METHOD 1
    public Map<Character, Integer> charCount(String str) {
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if (Character.toString(ch).matches("[a-zA-Z0-9]")) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        return map;
    }

    /*
    //METHOD 2
    public boolean isAlphaNumeric(int code) {
        return (code >= 97 && code <= 122) ||  // a-z
                (code >= 65 && code <= 90)  ||  // A-Z
                (code >= 48 && code <= 57);     // 0-9
    }

    public Map<Character, Integer> charCount(String str) {
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            int code = (int) ch;
            if (isAlphaNumeric(code)) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        return map;
    }

     */

    /*
    // METHOD 3
    public static void charCount() {
        String str = "Hellohhh --- 987 @#$$ {}{:";
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            char lower = Character.toLowerCase(ch);
            int code = (int) lower;

            if ((code >= 65 && code <= 90) ||     // A-Z
                    (code >= 97 && code <= 122) ||    // a-z
                    (code >= 48 && code <= 57)) {     // 0-9
                map.put(lower, map.getOrDefault(lower, 0) + 1);
            }
        }

        System.out.println(map);
    }

     */
}
