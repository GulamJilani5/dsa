⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ⏺️ Finding the vowels

```java
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String input = "Hello World";

        String vowels = input.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> "aeiouAEIOU".indexOf(c) != -1)
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println(vowels); // eoo
    }
}
```

# ⏺️ find the first non-repeating (unique) character and its index

- TCS & Capegemini

##### 🟦 Using Hashmap and using for loop

```java
import java.util.*;

class Main {
    public static void main(String[] args) {
        String str = "hackaton";

        Map<Character, Integer> map = new HashMap<>();

        // Step 1: Count frequency
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Step 2: Traverse string to maintain order
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.get(c) == 1) {
                System.out.println("First Unique Character: " + c);
                System.out.println("Index: " + i);
                return;
            }
        }

        System.out.println("No unique character found");
    }
}
```

##### 🟦 LinkedHashMap

- insertion order (original sequence)

```java
import java.util.*;

class Main {
    public static void main(String[] args) {
        String str = "hackaton";

        Map<Character, Integer> map = new LinkedHashMap<>();

        // Count frequency (maintains order)
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                char ch = entry.getKey();
                System.out.println("First Unique Character: " + ch);
                System.out.println("Index: " + str.indexOf(ch));
                break;
            }
        }
    }
}
```
