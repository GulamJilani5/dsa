⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ⏺️ highest-paid employee in each department.

```java

ap<String, Employee> highestEarners = employees.stream()
    .collect(Collectors.groupingBy(
        Employee::getDepartment,
        Collectors.collectingAndThen(
            Collectors.maxBy(
                Comparator.comparingDouble(Employee::getSalary)
            ),
            Optional::get
        )
    ));
```
