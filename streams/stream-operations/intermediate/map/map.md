⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ⏺️ MAP

- A Map is not directly streamable because it is key-value pairs.
- So we stream:
  - 1. map.keySet().stream()
  - 2. map.values().stream()
  - 3. map.entrySet().stream() ✅ best way

## ➡️ Map<String, Integer>

```java
Map<String, Integer> map = Map.of(
        "Java", 100,
        "Python", 80,
        "Go", 60
);

```

### 🟦 Stream keys and uppercase

```java
List<String> keys = map.keySet().stream()
        .map(k -> k.toUpperCase())
        // .map(String::toUpperCase)
        .toList();

```

### 🟦 Stream values and add 10

```java
List<Integer> values = map.values().stream()
        .map(v -> v + 10)
        .toList();
// No method reference possible.
```

## ➡️ entrySet() (Map.Entry<K,V>) 🔴 MOST USED

### 🟦 Convert entries into string format "key=value"

```java
List<String> result = map.entrySet().stream()
        .map(e -> e.getKey() + "=" + e.getValue())
        .toList();

```

### 🟦 Extract keys from entrySet()

```java
List<String> keys = map.entrySet().stream()
        .map(e -> e.getKey())
        // .map(Map.Entry::getKey)
        .toList();

```

### 🟦 Extract values from entrySet()

```java
List<Integer> values = map.entrySet().stream()
        .map(e -> e.getValue())
        // .map(Map.Entry::getValue)
        .toList();

```

## ➡️ entrySet()/Map.Entry<K,V> transformation (key/value change)

### 🟦 Convert Map<String,Integer> → Map<String,Integer> (increase value)

```java
Map<String, Integer> updated = map.entrySet().stream()
        .collect(Collectors.toMap(
                e -> e.getKey(), // Map.Entry::getKey,
                e -> e.getValue() + 50
        ));

```

### 🟦 Swap key and value (Map<String,Integer> → Map<Integer,String>)

```java
Map<Integer, String> swapped = map.entrySet().stream()
        .collect(Collectors.toMap(
                e -> e.getValue(), // Map.Entry::getValue,
                e -> e.getKey()  // Map.Entry::getKey
        ));

```

## ➡️ entrySet()/Map.Entry<K,V> with Object Values

```java
Map<String, Employee> empMap = Map.of(
        "E1", new Employee(1, "A", 50000),
        "E2", new Employee(2, "B", 70000)
);

```

### 🟦 Extract Employee names from Map

```java
List<String> names = empMap.entrySet().stream()
        .map(e -> e.getValue().getName())
        .toList();

    //  .map(e -> e.getValue())
    //  .map(Employee::getName)

```

### 🟦 Extract salaries from Map<String,Employee>

```java
List<Integer> salaries = empMap.entrySet().stream()
        .map(e -> e.getValue().getSalary())
        // .map(Employee::getSalary)
        .toList();

```

### 🟦 Map.Entry max using map()

- Find max salary employee entry.

```java
Map.Entry<String, Employee> maxEntry =
        empMap.entrySet().stream()
                .max(Comparator.comparingInt(e -> e.getValue().getSalary()))
                // .max(Map.Entry.comparingByValue(Comparator.comparingInt(Employee::getSalary)))
                .orElse(null);

```

### 🟦 Most Powerful map() Concept: One object → multiple values (flatMap needed)

- Example: List<String> → words → characters

```java
List<String> words = List.of("java", "go");

List<String> chars = words.stream()
        .flatMap(w -> w.chars().mapToObj(c -> String.valueOf((char)c)))
        .toList();

System.out.println(chars);

```

- This is NOT possible with map alone because map produces stream inside stream.

## ➡️ Real-Life Uses of map()

### 1. Entity → DTO conversion

Employee → EmployeeDTO
(map is used in Spring Boot everywhere)

### 2. Extract field

Employee → salary
Employee → name

### 3. Convert type

Integer → String
String → Integer
String → length

### 4. Map transformations

Map.Entry → key
Map.Entry → value
Map.Entry → custom object

### 5. API response conversion

List<UserEntity> → List<UserResponse>
