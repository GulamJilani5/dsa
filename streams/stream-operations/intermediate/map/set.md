⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ⏺️ SET

Set works same as List.

## ➡️ SET (Numbers / Strings)

- Set<Integer> → multiply by 10

```java
Set<Integer> nums = Set.of(1, 2, 3);

Set<Integer> result = nums.stream()
        .map(n -> n * 10)
        .collect(Collectors.toSet());

System.out.println(result);

```

- Set<String> → lowercase

```java
Set<String> langs = Set.of("JAVA", "PYTHON");

Set<String> result = langs.stream()
        .map(s -> s.toLowerCase())
        //  .map(String::toLowerCase)
        .collect(Collectors.toSet());

```
