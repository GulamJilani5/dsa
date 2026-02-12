⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ⏺️ SET

## ➡️ Set of Numbers

#### 🟦 Even number

```java
Set<Integer> nums = Set.of(10, 15, 20, 25, 30);

        Set<Integer> even = nums.stream()
                .filter(n -> n % 2 == 0)
                .collect(java.util.stream.Collectors.toSet());

        System.out.println(even);
```

- Method Reference version

```java
public static boolean isEven(Integer n) {
    return n % 2 == 0;
}

Set<Integer> even = nums.stream()
        .filter(Main::isEven)
        .collect(Collectors.toSet());

```

#### 🟦

```java

```

- Method Reference version

```java

```

## ➡️ Set of Strings

#### 🟦 filter words containing "java"

```java
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Set<String> words = Set.of("java", "python", "go", "javascript");

        Set<String> result = words.stream()
                .filter(w -> w.contains("java"))
                .collect(Collectors.toSet());

        System.out.println(result);
    }
}

```

- Method Reference version (custom method)

```java
public static boolean containsJava(String s) {
    return s.contains("java");
}

Set<String> result = words.stream()
        .filter(Main::containsJava)
        .collect(Collectors.toSet());

```

#### 🟦

```java

```

- Method Reference version

```java

```

## ➡️

#### 🟦

```java

```

- Method Reference version

```java

```

#### 🟦

```java

```
