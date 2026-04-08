⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ➡️ Given a string consisting of consecutive repeating characters, compress the string by replacing each group of repeated characters with:

- Yash Technology 🔴

```java
Input: "AAABBACCDDBBA"
Output: A3B2A1C2D2B2A1

```

```java
String input = "AAABBACCDDBBA";

String result = IntStream.range(0, input.length())
        .boxed()
        .filter(i -> i == 0 || input.charAt(i) != input.charAt(i - 1))
        .map(i -> {
            char ch = input.charAt(i);
            long count = IntStream.range(i, input.length())
                    .takeWhile(j -> input.charAt(j) == ch)
                    .count();
            return "" + ch + count;
        })
        .collect(Collectors.joining());

System.out.println(result);
```
