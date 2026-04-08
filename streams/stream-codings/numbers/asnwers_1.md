⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ⏺️ Manipulating integer elements to dinf unique vlaues, duplicate values and find the distinct

- Input

```java
int[] arr = {1, 2, 3, 2, 4, 5, 5, 5, 6};
```

- Why boxed()🔴
  - `Arrays.stream(arr)` → gives IntStream (primitive)
  - So we need `.boxed()` to convert → Stream<Integer>
  - If we have List<Integer> instead of int array then `boxed()` is not required.
- classifier - `Function.identity()` is same as `x -> x`🔴

### ➡️ Unique elements (occur only once) + count

```java
Map<Integer, Long> freqMap =
        Arrays.stream(arr)
              .boxed()
              .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

List<Integer> uniqueElements =
        freqMap.entrySet().stream()
               .filter(e -> e.getValue() == 1)
               .map(Map.Entry::getKey)
               .toList();

long uniqueCount = uniqueElements.size();

System.out.println("Unique Elements: " + uniqueElements);
System.out.println("Count: " + uniqueCount);
```

- Output

```text
Duplicate Elements: [2, 5]
Count: 2
```

### ➡️ Duplicate elements (occur >1) + count

```java
List<Integer> duplicateElements =
        freqMap.entrySet().stream()
               .filter(e -> e.getValue() > 1)
               .map(Map.Entry::getKey)
               .toList();

long duplicateCount = duplicateElements.size();

System.out.println("Duplicate Elements: " + duplicateElements);
System.out.println("Count: " + duplicateCount);
```

- Output

```text
Duplicate Elements: [2, 5]
Count: 2
```

### ➡️ Remove multiple occurrences → keep only ONE of each element

- (Equivalent to DISTINCT)

```java
List<Integer> distinctElements =
        Arrays.stream(arr)
              .boxed()
              .distinct()
              .toList();

System.out.println("Distinct Elements: " + distinctElements);
```

- Output

```text
Distinct Elements: [1, 2, 3, 4, 5, 6]
```
