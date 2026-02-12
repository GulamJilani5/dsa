⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ⏺️ Array

## ➡️ Primitive

### 🟦 Numbers

- Lambda

```java
List<Integer> nums = List.of(1, 2, 3, 4);
List<Integer> squares = nums.stream()
        .map(n -> n * n)
        .toList();
System.out.println(squares);

// No method reference possible for n*n.
```

### 🟦 List<Integer> → convert to String

```java
List<String> result = nums.stream()
        .map(n -> String.valueOf(n)) // Lambda Expression
        // .map(String::valueOf) //method reference
        .toList();

```

## ➡️ Non-Primitive / Object Array

### 🟦 String[] → uppercase

```java
String[] words = {"java", "spring", "stream"};

List<String> result = Arrays.stream(words)
        .map(w -> w.toUpperCase())
        // .map(String::toUpperCase) //method reference
        .toList();

System.out.println(result);

```
