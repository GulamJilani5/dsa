package patterns.FrequencyCounterPattern;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCounterPattern {

//////////////////////////////////////////////////////////////////////////////////////////////////
////////// All character including Spaces and Special Characters
///
/*
    public void charFrequncyCount(){
        String str = "java  #$*%";
        Map<Character, Integer> frequency = new HashMap<>();

        // Method 1

//            for(char c: str.toCharArray()){
//                frequency.put(c, frequency.getOrDefault(c,0) + 1);
//            }


        // Method 2
        for (char c : str.toCharArray()) {
            if (frequency.containsKey(c)) {
                frequency.put(c, frequency.get(c) + 1);
            } else {
                // First time seeing the character, set count to 1
                frequency.put(c, 1);
            }

            // We can also use Ternary Operator instead of the if-else
            // frequency.put(c, frequency.containsKey(c) ? frequency.get(c) + 1 : 1);

        }
        for (Map.Entry<Character, Integer> entry: frequency.entrySet()){
            System.out.println("Frequency Counter Pattern: Counts - "+"'"+entry.getKey() +"':"+entry.getValue());
        }
    }

    */

    //////////////////////////////////////////////////////////////////////////////////////////////////
    ////////// All characters ignore spaces and symbols
    ///
    public void charFrequncyCount() {
        String str = "Java_53 $&";
        Map<Character, Integer> frequency = new HashMap<>();

        for(char c: str.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                frequency.put(c, frequency.getOrDefault(c, 0) +1 );
            }


        }

        for (Map.Entry<Character, Integer> entry: frequency.entrySet()){
            System.out.println("Frequency Counter Pattern: Counts - "+"'"+entry.getKey() +"':"+entry.getValue());
        }

    }
}
