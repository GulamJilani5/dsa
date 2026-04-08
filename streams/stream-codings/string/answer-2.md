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
