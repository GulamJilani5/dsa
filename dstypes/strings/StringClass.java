package BasicPrograms.strings;

import BasicPrograms.strings.codes.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringClass {

    //Capitalize First Character
    CapitalizeFirstCharacter capitalizeFirstCharacter = new CapitalizeFirstCharacter();
    public void capitalizeFirstCharacterMethod(){
        List<String> words = Arrays.asList("i", "am", "learning", "recursion");
        List<String> results = capitalizeFirstCharacter.capitalizeFirst(words);
     System.out.println("String - Capitalizing the first character of the list: " +List.of().toArray());
    }

    //Capitalize Words
    CapitalizeWords capitalizeWords = new CapitalizeWords();
    public void capitalizeWordsMethod(){
        List<String> words = Arrays.asList("jilani", "is", "learning", "recursion");
        List<String> results = capitalizeWords.capitalizedWords(words);
        System.out.println("Capitalize words are: " + results);
    }

    //Collect String
    CollectString collectString = new CollectString();
    public void collectStringMethod(){
        // Create nested object structure
        Map<String, Object> weMadeIt = new HashMap<>();
        weMadeIt.put("weMadeIt", "baz");

        Map<String, Object> evenMoreInfo = new HashMap<>();
        evenMoreInfo.put("evenMoreInfo", weMadeIt);

        Map<String, Object> moreInfo = new HashMap<>();
        moreInfo.put("moreInfo", evenMoreInfo);

        Map<String, Object> thing = new HashMap<>();
        thing.put("info", "bar");
        thing.put("moreInfo", moreInfo);

        Map<String, Object> val = new HashMap<>();
        val.put("thing", thing);

        Map<String, Object> data = new HashMap<>();
        data.put("val", val);

        Map<String, Object> obj = new HashMap<>();
        obj.put("stuff", "foo");
        obj.put("data", data);

        // Test Method 1
        System.out.println("Helper Recursion: " + collectString.collectStrings(obj)); // [foo, bar, baz]

        // Test Method 2
//        System.out.println("Pure Recursion: " + collectString.collectStrings(obj)); // [foo, bar, baz]
    }

    //Count Character
    CountCharacter countCharacter = new CountCharacter();
    public void countCharacterMethod(){
        String input = "He  llj   ilanio[]-==";
        Map<Character, Integer> result = countCharacter.charCount(input);
        System.out.println("String - Counts of each characters are: " +result);
    }

    // Substring Search

    SubstringSearch substringSearch = new SubstringSearch();
    public void substringSearchMethod(){
         //METHOD 1
//        String longStr = "lon loomg ojhomog";
//        String shortStr = "omg";
//        int count = substringSearch.subStringSearch(longStr, shortStr);
//        System.out.println("String - Count: " + count);
//    }

    // METHOD 2
        String longStr = "lon loomg ojhomog";
        String shortStr = "omg";
        boolean result = substringSearch.subStringSearch(longStr, shortStr);
        if(result) {
               System.out.println("String - Substring Found");
             }
        else {
               System.out.println("String - Not found");
        }

// METHOD 3
//    String longStr = "lon loomg ojhomog";
//    String shortStr = "omg";
//
//    int index = substringSearch.subStringSearch(longStr, shortStr);
//        if (index == -1) {
//        System.out.println("String - Substring Not found");
//    } else {
//        System.out.println("String - Substring Found at index: " + index);
//    }

 }
}
