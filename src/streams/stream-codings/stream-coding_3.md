⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

### ➡️ Find second highest word length using stream

##### 🟦

```java
import java.util.*;
import java.util.stream.*;

public class SecondHighestWordLength {
    public static void main(String[] args) {

        String sentence = "Java streams are very powerful and useful";

        int secondHighestLength = Arrays.stream(sentence.split("\\s+"))
                .map(String::length)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(-1);

        System.out.println("Second Highest Word Length: " + secondHighestLength);
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

### ➡️

```java

```

### ➡️

```java

```

### ➡️

```java

```

### ➡️

```java

```

### ➡️

```java

```

### ➡️

```java

```

### ➡️

```java

```
