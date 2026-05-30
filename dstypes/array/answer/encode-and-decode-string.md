⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ⏺️ Encode and Decode a String

### ➡️ Method 1

- This approach uses:
  - `;` as delimiter
  - `/` as escape character
- So:
  - `;` becomes `/;`
  - `/` becomes `//`

##### 🟦 How Encoding Works

- Example: `["ab;c", "x/y"]`
- Encoding:

```text
ab;c → ab/;c
x/y  → x//y
```

- Final encoded string: `ab/;c;x//y;`

##### 🟦 How Decoding Works

- While decoding:
  - If `/` found
    - take next character literally
  - If `;` found
    - current string completed

```java
public class Codec {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            int i = 0;
            while (i < s.length()) {
                if (s.charAt(i) == ';') {
                    sb.append("/;");
                }
                else if (s.charAt(i) == '/') {
                    sb.append("//");
                }
                else {
                    sb.append(s.charAt(i));
                }
                i++;
            }
            sb.append(";");
        }

        return sb.toString();
    }

    public List<String> decode(String s) {
        List<String> decodedStrings = new ArrayList<>();

        StringBuilder currentString = new StringBuilder();

        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '/') {
                currentString.append(s.charAt(i + 1));
                i += 2;
            }
            else if (s.charAt(i) != ';') {
                currentString.append(s.charAt(i));
                i++;
            }
            else {
                decodedStrings.add(currentString.toString());
                currentString.setLength(0);
                i++;
            }
        }

        return decodedStrings;
    }
}
```

```text
Original List:
[hello, ab;c, x/y]

Encoded String:
hello;ab/;c;x//y;

Decoded List:
[hello, ab;c, x/y]
```

### ➡️ Method 2

- Input: `["hello", "java", "world"]`

##### 🟦 Encoded String:

- length + delimiter + string
- `5#hello4#java5#world`

##### 🟦 Decoded Output:

- `["hello", "java", "world"]`

```java
import java.util.*;

public class Main {

    // ENCODE
    public static String encode(List<String> strs) {

        StringBuilder sb = new StringBuilder();

        for (String str : strs) {

            sb.append(str.length())
              .append("#")
              .append(str);
        }

        return sb.toString();
    }

    // DECODE
    public static List<String> decode(String s) {

        List<String> result = new ArrayList<>();

        int i = 0;

        while (i < s.length()) {

            int j = i;

            // Find delimiter #
            while (s.charAt(j) != '#') {
                j++;
            }

            // Length before #
            int length = Integer.parseInt(s.substring(i, j));

            // Actual string
            String word = s.substring(j + 1, j + 1 + length);

            result.add(word);

            // Move pointer
            i = j + 1 + length;
        }

        return result;
    }

    public static void main(String[] args) {

        List<String> input = Arrays.asList("hello", "java", "world");

        String encoded = encode(input);

        System.out.println("Encoded: " + encoded);

        List<String> decoded = decode(encoded);

        System.out.println("Decoded: " + decoded);
    }
}
```
