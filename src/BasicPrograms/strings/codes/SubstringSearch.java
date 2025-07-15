package BasicPrograms.strings.codes;

public class SubstringSearch {

    // METHOD 1
//    public int subStringSearch(String longStr, String shortStr) {
//        int count = 0;
//
//        for (int i = 0; i <= longStr.length() - shortStr.length(); i++) {
//            int j;
//            for (j = 0; j < shortStr.length(); j++) {
//                if (longStr.charAt(i + j) != shortStr.charAt(j)) {
//                    break;
//                }
//            }
//            if (j == shortStr.length()) {
//                count++;
//            }
//        }
//
//        return count;
//    }

    // METHOD 2
    public boolean subStringSearch(String longStr, String shortStr) {
        return longStr.contains(shortStr);
    }


    // METHOD 3
//    public int subStringSearch(String longStr, String shortStr) {
//        return longStr.indexOf(shortStr);
//    }

}
