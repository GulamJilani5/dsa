⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ️➡️ mapToInt()

- returns an `IntStream`
- `map()` gives wrapper type `Integer` where as `mapToInt()` gives primitive type `int`

## 🟦 Why do we need mapToInt()

- Because normal streams (Stream<Integer>) use wrapper objects, but Java provides primitive streams:
  - IntStream
  - LongStream
  - DoubleStream
- Primitive streams are faster and provide extra methods like:
  - sum()
  - average()
  - min()
  - max()
  - count()

```java
List<String> words = List.of("java", "python", "go");

int totalLength = words.stream()
        .mapToInt(word -> word.length())
        .sum();

System.out.println(totalLength);

```

```java
int maxSalary = list.stream()
        .mapToInt(Employee::getSalary)
        .max()
        .orElse(0);
```

# ️➡️ mapToObject()

- `mapToObj()` is the opposite of `mapToInt()` / `mapToLong()` / `mapToDouble()`
- mapToObj() converts each primitive value into an object.

```java
IntStream salaries = IntStream.of(50000, 60000, 70000);

List<Employee> employees = salaries
        .mapToObj(sal -> new Employee(sal))   // Stream<Employee>
        .toList();

System.out.println(employees.size());

```
