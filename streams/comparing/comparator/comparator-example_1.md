⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ⏺️ Employee class

```java
class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;
    private int age;
    //getter
    //setter
}
```

### ➡️ Sort by salary (ascending)

```java
employees.stream()
    .sorted(Comparator.comparing(Employee::getSalary))
    .toList();
```

### ➡️ Sort by salary (descending)

```java
employees.stream()
    .sorted(Comparator.comparing(Employee::getSalary).reversed())
    .toList();
```

### ➡️ Sort by name (alphabetically)

```java
employees.stream()
    .sorted(Comparator.comparing(Employee::getName))
    .toList();
```

### ➡️ Sort by age (ascending)

```java
employees.stream()
    .sorted(Comparator.comparingInt(Employee::getAge))
    .toList();
```

### ➡️ Sort by department, then salary

```java
employees.stream()
    .sorted(
        Comparator.comparing(Employee::getDepartment)
                  .thenComparing(Employee::getSalary)
    )
    .toList();
```

### ➡️ Sort by salary, then name

```java
employees.stream()
    .sorted(
        Comparator.comparing(Employee::getSalary)
                  .thenComparing(Employee::getName)
    )
    .toList();
```

### ➡️ Sort by salary descending, then age ascending

```java
employees.stream()
    .sorted(
        Comparator.comparing(Employee::getSalary)
                  .reversed()
                  .thenComparingInt(Employee::getAge)
    )
    .toList();
```
