⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ️ ➡️ Integer/Double Comparable

## 🟦 Natural Order (Ascending)

```java
List<Integer> nums = List.of(10, 50, 20, 5);

nums.stream()
    .sorted()
    .forEach(System.out::println);  // 5 10 20 50

```

## 🟦 Reverse Order (Descending)

```java
nums.stream()
    .sorted(Comparator.reverseOrder())
    .forEach(System.out::println);  // 50 20 10 5

```

## 🟦 max/min

```java
// Max/Min
System.out.println(Collections.min(nums)); // 5
System.out.println(Collections.max(nums)); // 50

```

#### 🔵 using **.compareTo()**

- Method Reference

```java
int max = nums.stream()
              .max(Integer::compareTo)
              .orElse(0);

int min = nums.stream()
              .min(Integer::compareTo)
              .orElse(0);
```

- Lambda Expression

```java
int max = nums.stream()
        .max((a, b) -> a.compareTo(b))
        .orElse(0);

int min = nums.stream()
        .min((a, b) -> a.compareTo(b))
        .orElse(0);

```

# ️ ➡️ String Comparable

## 🟦 Natural Order (Lexicographical / Dictionary Order)

```java
List<String> names = List.of("Zara", "Ali", "John", "Bob");

names.stream()
    .sorted()
    .forEach(System.out::println); // Ali Bob John Zara

```

## 🟦 Reverse Order

```java
names.stream()
    .sorted(Comparator.reverseOrder())
    .forEach(System.out::println); // Zara John Bob Ali

```

## 🟦 max/min

```java
System.out.println(Collections.min(names)); // Ali
System.out.println(Collections.max(names)); // Zara
```

#### 🔵 Using **.compareTo()**

- Method Reference

```java
String max = names.stream()
                  .max(String::compareTo)
                  .orElse("NA");

String min = names.stream()
                  .min(String::compareTo)
                  .orElse("NA");
```

- Lambda Expression

```java
String max = names.stream()
        .max((s1, s2) -> s1.compareTo(s2))
        .orElse("NA");

String min = names.stream()
        .min((s1, s2) -> s1.compareTo(s2))
        .orElse("NA");

```

# ️ ➡️ LocalDate Comparable

## 🟦 Natural Order (Oldest date first)

```java
import java.time.LocalDate;
import java.util.*;

List<LocalDate> dates = List.of(
        LocalDate.of(2024, 5, 10),
        LocalDate.of(2023, 12, 25),
        LocalDate.of(2025, 1, 1)
);



dates.stream()
    .sorted()
    .forEach(System.out::println);

//Output
2023-12-25
2024-05-10
2025-01-01

```

## 🟦 Reverse Order (Latest date first)

```java
dates.stream()
    .sorted(Comparator.reverseOrder())
    .forEach(System.out::println);

// Output
2025-01-01
2024-05-10
2023-12-25

```

## 🟦 max/min

```java
System.out.println(Collections.min(dates)); // 2023-12-25
System.out.println(Collections.max(dates)); // 2025-01-01
```

#### 🔵 Using **.compareTo()**

- Method Reference

```java
LocalDate max = dates.stream()
                     .max(LocalDate::compareTo)
                     .orElse(null);
LocalDate min = dates.stream()
                     .min(LocalDate::compareTo)
                     .orElse(null);
```

- Lambda Expression

```java
LocalDate max = dates.stream()
        .max((d1, d2) -> d1.compareTo(d2))
        .orElse(null);

LocalDate min = dates.stream()
        .min((d1, d2) -> d1.compareTo(d2))
        .orElse(null);

```
