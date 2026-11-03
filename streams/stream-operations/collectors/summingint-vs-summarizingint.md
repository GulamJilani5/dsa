⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ⏺️ summingInt() vs summarizingInt()

- **summingInt()** → Calculates only the total sum.
- **summarizingInt()** → Calculates complete statistics: count, sum, minimum, maximum and average.

### ➡️ summingInt()

- Suppose we want the total salary of employees in each department.

```java
Map<String, Integer> result =
    employees.stream()
        .collect(Collectors.groupingBy(
            Employee::getDepartment,
            Collectors.summingInt(Employee::getSalary)
        ));
```

- Output:

```text
IT       -> 150000
HR       -> 110000
Finance  -> 75000
```

- Return Type: `Map<String, Integer>`

### ➡️ summarizingInt()

- Suppose we want all salary statistics department-wise

```java
Map<String, IntSummaryStatistics> result =
    employees.stream()
        .collect(Collectors.groupingBy(
            Employee::getDepartment,
            Collectors.summarizingInt(Employee::getSalary)
        ));
```

- Now we can access five different statistics

```java
IntSummaryStatistics stats = result.get("IT");

stats.getCount();    // Number of employees
stats.getSum();      // Total salary
stats.getMin();      // Minimum salary
stats.getMax();      // Maximum salary
stats.getAverage();  // Average salary
```

- Return Type: `Map<String, IntSummaryStatistics>`
