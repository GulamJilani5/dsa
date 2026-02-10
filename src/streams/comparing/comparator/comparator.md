⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ️ ➡️ Sort String by length (asc/desc) and find longest and shortest word

## 🟦 Sort String by length (ASC)

```java
 List<String> words = List.of("java", "python", "javascript", "go", "c");

 words.stream()
             .sorted(Comparator.comparingInt(String::length)) // Method Reference
            //.sorted(Comparator.comparingInt(word -> word.length())) // Lambda expression
             .forEach(System.out::println);
```

## 🟦 Sort String by length (DESC)

```java
words.stream()
     .sorted(Comparator.comparingInt(String::length).reversed())
     //.sorted(Comparator.comparingInt(word -> word.length()).reversed())
     .forEach(System.out::println);

```

## 🟦 max()/min()

```java
String longestWord/shortestWord = words.stream()
                              .max(Comparator.comparingInt(String::length)) // Method Reference
                            //   .max(Comparator.comparingInt(word -> word.length())) // Lambda expression
                            //   .min(Comparator.comparingInt(String::length)) // Method Reference
                            //   .min(Comparator.comparingInt(word -> word.length())) // Lambda expression
                              .orElse(null);
```

# ️ ➡️ Multiple fields sorting (salary, age, name case-insensitive)

```java

class Employee {
    private int salary;
    private int age;
    private String name;

    public int getSalary() { return salary; }
    public int getAge() { return age; }
    public String getName() { return name; }
}

```

## 🟦 Salary DESC, Age ASC, Name case-insensitive ASC

```java
Comparator<Employee> cmp =
        Comparator.comparingInt(Employee::getSalary).reversed()
                  .thenComparingInt(Employee::getAge)
                  .thenComparing(Employee::getName, String.CASE_INSENSITIVE_ORDER);

list.stream().sorted(cmp).forEach(System.out::println);

```

## 🟦 Salary ASC, Age DESC, Name ASC

```java
Comparator<Employee> cmp =
        Comparator.comparingInt(Employee::getSalary)
                  .thenComparing(Comparator.comparingInt(Employee::getAge).reversed())
                  .thenComparing(Employee::getName);

list.stream().sorted(cmp).forEach(System.out::println);

```

# ️➡️ Null safe sorting (elements or keys may be null)

## 🟦 Null strings first, then sort by length

```java
List<String> list = Arrays.asList("java", null, "go", "python", null);

list.stream()
    .sorted(
        Comparator.nullsFirst(
            Comparator.comparingInt(String::length)
        )
    )
    .forEach(System.out::println);

```

## 🟦 Null strings last + tie break lexicographically

```java
list.stream()
    .sorted(
        Comparator.nullsLast(
            Comparator.comparingInt(String::length)
                      .thenComparing(Comparator.naturalOrder())
        )
    )
    .forEach(System.out::println);

```

## 🟦 Null-safe sorting for Employee (Employee itself may be null)

### 🔵 Null employees last, sort by salary desc

```java
Comparator<Employee> cmp =
        Comparator.nullsLast(
            Comparator.comparingInt(Employee::getSalary).reversed()
        );

```

### 🔵 Null-safe sorting when field may be null (example name can be null)

```java
Comparator<Employee> cmp =
        Comparator.comparingInt(Employee::getSalary).reversed()
                  .thenComparing(
                      Employee::getName,
                      Comparator.nullsLast(String.CASE_INSENSITIVE_ORDER)
                  );

```

# ➡️ comparing() vs comparingInt()

## 🟦 comparing(Key)

- When **Key** is Object/non-primitive.
- Best for `String`, `LocalDate`, `custom objects`
- Boxing (int → Integer)
- slightly slower
-

## 🟦 comparingInt()/comparingLong()/comparingDouble()

- When **Key** is primitive(int/long/double)
- no boxing
- Best for `int/double` fields like `age`, `salary`
