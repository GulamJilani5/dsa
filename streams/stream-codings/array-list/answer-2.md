⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ⏺️ Highest Word

- 🔴 Here we can find the highest word and then find it's length as well

##### 🟦 Using .mx(Comparator.comparing())

##### 🟦 `.map(String::length)` & `.sorted(Comparator.reverseOrder())`

```java
import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {

        List<String> sentence = List.of("java", "python", "javascript", "C", "go");

        int longestWordLength = sentence.stream()
                .map(String::length)
                //.map(word -> word.length())
                .sorted(Comparator.reverseOrder())
                .findFirst()
                .orElse(0);

        System.out.println(longestWordLength);

    }
}
```

```java

import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {

        List<String> sentence = List.of("java", "python", "javascript", "C", "go");

        String longestWord = sentence.stream()
                .max(Comparator.comparing(String::length))
                // .min(Comparator.comparing(String::length))
                .orElse("Not found");

        System.out.println(longestWord);

    }
}
```

##### 🟦 Using .sorted()

```java

import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {

        List<String> sentence = List.of("java", "python", "javascript", "C", "go");

        String longestWord = sentence.stream()
                .sorted((a, b) -> b.length() - a.length())
                // .sorted((a, b) -> a.length() - b.length()) // min
                .findFirst()
                .orElse("Not found");

        System.out.println(longestWord);

    }
}
```

##### 🟦 Using Comparator.groupingBy()

- group by length

```java
import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {

        List<String> sentence = List.of("java", "python", "javascript", "C", "go");

        int longestWordLength = sentence.stream()
                .collect(Collectors.groupingBy(
                      String::length,
                      //.map(word -> word.length())
                      Collectors.counting()
                    ))
                    .keySet()
                    .stream()
                    .max(Integer::compareTo)
                    .orElse(0);

        System.out.println(longestWordLength);

    }
}
```

- groupingBy + max length

```java
import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {

        List<String> sentence = List.of("java", "python", "javascript", "C", "go");

        int longestWordLength = sentence.stream()
                .collect(Collectors.groupingBy(
                      word -> word,
                      Collectors.summingInt(String::length)
                      // Collectors.summingInt(word -> word.length())
                    ))
                    .values()
                    .stream()
                    .max(Integer::compareTo)
                    .orElse(0);

        System.out.println(longestWordLength);

    }
}
```

##### 🟦 Using .map()

```java

import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {

        List<String> sentence = List.of("java", "python", "javascript", "C", "go");

        int longestWordLength = sentence.stream()
                // .map(String::length)
                .map(word -> word.length())
                // .max(Integer::compareTo)
                .max((a, b) -> a.compareTo(b))
                .orElse(0);

        System.out.println(longestWordLength);

    }
}
```

##### 🟦 Using .mapToInt()

```java
import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {

        List<String> sentence = List.of("java", "python", "javascript", "C", "go");

        int longestWordLength = sentence.stream()
                .mapToInt(String::length)
                // .mapToInt(word -> word.length())
                .max()
                .orElse(0);

        System.out.println(longestWordLength);

    }
}
```

##### 🟦 Using .reduce()

```java

import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {

        List<String> sentence = List.of("java", "python", "javascript", "C", "go");

        String longestWord = sentence.stream()
                .reduce((word1, word2)-> word1.length() >= word2.length() ? word1 : word2)
                // .reduce((word1, word2)-> word1.length() <= word2.length() ? word1 : word2) // for min
                .orElse("Not found");

        System.out.println(longestWord);

    }
}
```

# ⏺️ Find second highest word length using stream

##### 🟦 Using .map()

```java
import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {
        String sentence = "going to Mumbai for purchasing beautiful clothes";

        int secondHighestWordlength = findSecondHighestWordLength(sentence);

        System.out.println("Second highest word's length: " +secondHighestWordlength);
    }

    public static int findSecondHighestWordLength(String sentence){

        // List<String> wordList = Arrays.stream(sentence.split("\\s+"))
        //                               .collect(Collectors.toList())
        //  wordList.forEach(word -> System.out.print(word + " "));

        int secondHighestWordlength = Arrays.stream(sentence.split("\\s+"))
                                      .map(String::toLowerCase)
                                    //   .map(String::length)
                                      .map(word -> word.length())
                                      .distinct()
                                      .sorted(Comparator.reverseOrder())
                                      .skip(1)
                                      .findFirst()
                                      .orElse(0);

        return secondHighestWordlength;

    }
}

```

##### 🟦 Using groupingby

```java
import java.util.*;
import java.util.stream.*;

public class SecondHighestWordLength {
    public static void main(String[] args) {

        String sentence = "Java streams are very powerful and useful";

        int secondHighestLength = Arrays.stream(sentence.split("\\s+"))
                .collect(Collectors.groupingBy(String::length))   // group by length
                .collect(Collectors.groupingBy(word -> word.length()))   // group by length
                .keySet()                                         // take only lengths
                .stream()
                .sorted(Comparator.reverseOrder())                // sort desc
                .skip(1)                                          // skip highest
                .findFirst()
                .orElse(-1);

        System.out.println("Second Highest Word Length: " + secondHighestLength);
    }
}

```

# ⏺️ capitalize the first character of every word

##### 🟦 Get the answer in the List of string and then print it

```java
import java.util.*;

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");

        String str = "I am going to Mumbai";

        // List<String> strList = Arrays.stream(str.split(" "))
        List<String> strList = Arrays.stream(str.split("\\s+"))
                                   .map( word -> String.valueOf(Character.toUpperCase(word.charAt(0))) + word.substring(1))
                                   .toList();

                strList.forEach(word->System.out.println(word));
    }
}
```

##### 🟦 Get the answer in the string format

```java
import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {

        String str = "I am going to Mumbai";

        String result = Arrays.stream(str.split("\\s+"))
                .map(word -> Character.toUpperCase(word.charAt(0)) + word.substring(1))
                .collect(Collectors.joining(" "));

        System.out.println(result);
    }
}

```
