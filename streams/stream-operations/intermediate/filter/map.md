⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ⏺️ MAP

- Map is not a Stream directly
- We must stream:
  - `map.keySet().stream()`
  - `map.values().stream()`
  - `map.entrySet().stream()` ⭐ (MOST IMPORTANT)

## ➡️ filter() on Map Keys

#### 🟦 filter keys starting with "a"

```java
      Map<String, Integer> map = Map.of(
                "apple", 100,
                "banana", 200,
                "avocado", 300,
                "mango", 400
        );

        map.keySet().stream()
                .filter(k -> k.startsWith("a"))
                .forEach(System.out::println);
```

- Method reference version (custom method)

```java
public static boolean startsWithA(String s) {
    return s.startsWith("a");
}

map.keySet().stream()
        .filter(Main::startsWithA)
        .forEach(System.out::println);

```

#### 🟦

```java

```

- Method Reference version(custom method)

```java

```

## ➡️ filter() on Map Values

#### 🟦 filter values > 200

```java
map.values().stream()
        .filter(v -> v > 200)
        .forEach(System.out::println);

```

- Method Reference version(custom method)

```java
public static boolean greaterThan200(Integer v) {
    return v > 200;
}

map.values().stream()
        .filter(Main::greaterThan200)
        .forEach(System.out::println);

```

#### 🟦

```java

```

- Method Reference version(custom method)

```java

```

## ➡️ filter() on entrySet()/Map.Entry (MOST IMPORTANT)

#### 🟦 filter entries where value > 200

```java
Map<String, Integer> map = Map.of(
                "apple", 100,
                "banana", 200,
                "avocado", 300,
                "mango", 400
        );

        Map<String, Integer> result = map.entrySet().stream()
                .filter(e -> e.getValue() > 200)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue
                ));

        System.out.println(result);
```

- Method Reference version(custom method)

```java
public static boolean valueGreaterThan200(Map.Entry<String, Integer> e) {
    return e.getValue() > 200;
}

Map<String, Integer> result = map.entrySet().stream()
        .filter(Main::valueGreaterThan200)
        .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue
        ));

```

#### 🟦 Map<Integer, String> (Number:String)

```java
Map<Integer, String> map = Map.of(
                1, "java",
                2, "python",
                3, "go",
                4, "javascript"
        );

        Map<Integer, String> result = map.entrySet().stream()
                .filter(e -> e.getKey() > 2)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue
                ));

        System.out.println(result);
```

- Method Reference version(custom method)

```java
public static boolean keyGreaterThan2(Map.Entry<Integer, String> e) {
    return e.getKey() > 2;
}

Map<Integer, String> result = map.entrySet().stream()
        .filter(Main::keyGreaterThan2)
        .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue
        ));

```

#### 🟦 filter() with MULTIPLE CONDITIONS

##### 🔵 filter keys > 2

```java
Map<Integer, String> map = Map.of(
                1, "java",
                2, "python",
                3, "go",
                4, "javascript"
        );

        Map<Integer, String> result = map.entrySet().stream()
                .filter(e -> e.getKey() > 2)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue
                ));

        System.out.println(result);
```

- Method Reference version(custom method)

```java
public static boolean keyGreaterThan2(Map.Entry<Integer, String> e) {
    return e.getKey() > 2;
}

Map<Integer, String> result = map.entrySet().stream()
        .filter(Main::keyGreaterThan2)
        .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue
        ));

```

#### 🟦 filter() with MULTIPLE CONDITIONS

##### 🔵 salary > 50000 AND name starts with J

```java
List<Employee> result = employees.stream()
        .filter(emp -> emp.getSalary() > 50000 && emp.getName().startsWith("J"))
        .toList();

```

## ➡️ filter() with NULL Safety

#### 🟦 remove null values from list

```java
 List<String> list = List.of("java", null, "python", null, "go");

        List<String> result = list.stream()
                .filter(Objects::nonNull)   // method reference
                .toList();

        System.out.println(result);
```

- Method Reference version(custom method)

```java

```

#### 🟦

```java

```

- Method Reference version(custom method)

```java

```

#### 🟦

```java

```

#### 🟦

```java

```

- Method Reference version(custom method)

```java

```
