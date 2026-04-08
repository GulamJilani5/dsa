⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ➡️ You are given a list of strings that may contain duplicates.

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
