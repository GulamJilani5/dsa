⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ⏺️ You are given a list of strings that may contain duplicates.

- Your task is to:
  - Remove duplicate strings
  - Sort the unique strings by length in descending order
  - Select the top 2 longest strings
  - Return the result as a comma-separated single string

```java
Input: ["java", "stream", "api", "java", "code"]

output: stream, java

```

```java
List<String> names = Arrays.asList("java", "stream", "api", "java", "code");

String result = names.stream()
                     .distinct()
                     .sorted(Comparator.comparingInt (String::length).reversed())
                     .limit(2)
                     .collect(Collectors.joining(", "));

System.out.printIn(result);

```

# ⏺️ Reversing words (not characters) in a string

#### 🟦 Java Solution (Simple & Clean)

```java
class Main {
    public static void main(String[] args) {
        String str = "  the sky   is blue  ";

        String[] words = str.trim().split("\\s+");

        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]).append(" ");
        }

        System.out.println(result.toString().trim());
    }
}
```

#### 🟦 Optimized (In-place style using Stack)

```java
import java.util.*;

class Main {
    public static void main(String[] args) {
        String str = "the sky is blue";

        Stack<String> stack = new Stack<>();
        for (String word : str.split("\\s+")) {
            stack.push(word);
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop()).append(" ");
        }

        System.out.println(result.toString().trim());
    }
}
```

#### 🟦 Basic Stream Solution

```java
import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {
        String str = "the sky is blue";

        String result = Arrays.stream(str.split("\\s+"))
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> {
                            Collections.reverse(list);
                            return String.join(" ", list);
                        }
                ));

        System.out.println(result);
    }
}
```

#### 🟦 Cleaner Stream Version

- Flow

```text
String
  ↓ split
["the","sky","is","blue"]
  ↓ index stream
[0,1,2,3]
  ↓ reverse index mapping
[3,2,1,0]
  ↓ map to words
["blue","is","sky","the"]
  ↓ join
"blue is sky the"
```

```java
import java.util.stream.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        String str = "the sky is blue";

        List<String> words = Arrays.asList(str.split("\\s+"));

        String result = IntStream.range(0, words.size())
                .mapToObj(i -> words.get(words.size() - 1 - i))
                .collect(Collectors.joining(" "));

        System.out.println(result);
    }
}
```
