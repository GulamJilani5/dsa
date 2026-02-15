⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ⏺️ Collectors.mapping(mapper, downstream)

- `mapping()` is not a standalone terminal collector like `toList()`.
- It is designed to be used inside another collector pipeline (as a downstream collector).

## ➡️ map() vs mapper()

- Both the code equivalent

```java
employees.stream()
    .map(Employee::getName)
    .collect(Collectors.toList());
```

```java
employees.stream()
    .collect(Collectors.mapping(Employee::getName, Collectors.toList()));
```

- But inside another collector (like `groupingBy`, `partitioningBy`, `teeing`, etc.), you cannot directly call .`map()` because you are already inside a collect operation.

### 🟦 mapper() only used as a downstream collector in groupingBy()?

- Mostly yes, but not only.
- It is mainly useful when you need mapping inside collectors such as:

- `groupingBy(..., mapping(...))`
- `partitioningBy(..., mapping(...))`
- `toMap(..., mapping(...)) (rare but possible via downstream collectors)`
- `collectingAndThen(..., mapping(...))`
- `teeing(..., mapping(...), ...)`

## ➡️ Arguments

- It always requires 2 arguments
- Can not take 1 argument only.

### 🟦 mapper

- This is the function that converts each incoming stream element from type T to type U.

```java
Employee -> String
Employee::getDepartment
```

So mapper transforms: `Employee → "IT"`

### 🟦 downstream

- Find `D:\Jilani\learning\dsa\streams\stream-operations\collectors\downstreamcollector.md`

## ➡️ How mapping actually works internally

```java
Collectors.mapping(Employee::getName, Collectors.toList())
```

- Internally it behaves like:
  - create a list accumulator from downstream (ArrayList)
- for each Employee:
  - apply mapper → `getName()`
  - downstream accumulator adds it to list
  - downstream finisher returns final list

#### 🟦 Without mapping, we would write:

```java
employees.stream()
    .collect(Collectors.groupingBy(
        Employee::getDepartment,
        Collectors.toList()
    ));
```

- This gives:
  - `Map<String, List<Employee>>`
- But what if we want:
  ` Map<String, List<String>>` (dept → employee names)
- We cannot do `.map(Employee::getName)` inside `groupingBy`.
- So we use:

```java
Collectors.groupingBy(
    Employee::getDepartment,
    Collectors.mapping(Employee::getName, Collectors.toList())
)
```

#### 🟦 Important rule: mapping does NOT change grouping key

- Many people misunderstand this

```java
groupingBy(Employee::getDepartment,
    mapping(Employee::getName, toList())
)
```

- groupingBy decides key: department
- mapping changes value collected: name
- So mapping affects only `groupingBy's` **downstream collection** not it's **classifier**.

## ➡️ Practical examples (must know)

- Employee Class

```java
class Employee {
    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}

```

- mapping code goes here

```java
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = List.of(
        new Employee("Ali", "IT", 50000),
        new Employee("John", "IT", 70000),
        new Employee("Sara", "HR", 60000),
        new Employee("Zara", "HR", 60000),
        new Employee("Mike", "Finance", 80000)

);

    /////////**************
    /// Following Code Goes here
    /////////**************
    ///
    }
}
```

### 🟦 Group employees by department, collect their names

```java
Map<String, List<String>> map =
    employees.stream()
        .collect(Collectors.groupingBy(
            Employee::getDepartment,
            Collectors.mapping(Employee::getName, Collectors.toList())
        ));

// Output
{
  Finance=[Mike],
  HR=[Sara, Zara],
  IT=[Ali, John]
}

```

- Return type:
  - `Map<String, List<String>>`
- Because downstream is `toList()` → `List<String>`

### 🟦 Group by department, collect unique salaries

```java
Map<String, Set<Double>> map =
    employees.stream()
        .collect(Collectors.groupingBy(
            Employee::getDepartment,
            Collectors.mapping(Employee::getSalary, Collectors.toSet())
        ));

// Output
{
  Finance=[80000.0],
  HR=[60000.0],
  IT=[50000.0, 70000.0]
}
// Notice: HR has only one value 60000.0 because Set removes duplicates.
```

- Return type:
  - `Map<String, Set<Double>>`

### 🟦 Group by department, join employee names as a string

```java
Map<String, String> map =
    employees.stream()
        .collect(Collectors.groupingBy(
            Employee::getDepartment,
            Collectors.mapping(Employee::getName, Collectors.joining(", "))
        ));
// Output:
{
  Finance=Mike,
  HR=Sara, Zara,
  IT=Ali, John
}

```

- Return type:
  - `Map<String, String>`
- Downstream = `joining` → `String`

### 🟦 Group by department, count employees (mapping not needed but possible)

```java
Map<String, Long> map =
    employees.stream()
        .collect(Collectors.groupingBy(
            Employee::getDepartment,
            Collectors.mapping(e -> 1, Collectors.counting())
        ));
// Output
{
  Finance=1,
  HR=2,
  IT=2
}
```

- Here mapping `e -> 1` is useless, because `counting()` counts elements anyway.
  You could simply do:

Collectors.counting()

## ➡️ Where mapping is MOST used (important patterns)

- Employee Class

```java
class Employee {
    private String name;
    private String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }
}

```

- mapping code goes here

```java
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee("Ali", "IT"),
                new Employee("Sara", "HR"),
                new Employee("John", "IT"),
                new Employee("Zara", "HR"),
                new Employee("Mike", "Finance")
        );

    /////////**************
    /// Following Code Goes here
    /////////**************
    ///
    }
}

```

### 🟦 groupingBy + mapping

```java
Map<String, List<String>> result =
                employees.stream()
                     .collect(Collectors.groupingBy(
                         Employee::getDepartment,                    // classifier
                         Collectors.mapping(Employee::getName,       // mapper
                            Collectors.toList())                     // downstream collector
                        ));

        System.out.println(result);

// Output
{Finance=[Mike], HR=[Sara, Zara], IT=[Ali, John]}

```

### 🟦 partitioningBy + mapping

- partition employees into male/female, collect names.

```java
Map<Boolean, List<String>> map =
    employees.stream()
        .collect(Collectors.partitioningBy(
            e -> e.getGender().equals("Male"),
            Collectors.mapping(Employee::getName, Collectors.toList())
        ));
// Output
{
  true=[list of male employee names],
  false=[list of non-male employee names]
}
// {
//   true=[Ali, John],
//   false=[Sara, Zara]
// }


```

### 🟦 mapping + reducing

- group by department, find max salary.

```java
Map<String, Optional<Double>> map =
    employees.stream()
        .collect(Collectors.groupingBy(
            Employee::getDepartment,
            Collectors.mapping(Employee::getSalary, Collectors.maxBy(Double::compare))
        ));

// Output
{
  "IT"=Optional[highestSalaryInIT],
  "HR"=Optional[highestSalaryInHR],
  "Finance"=Optional[highestSalaryInFinance]
}
// {
//   IT=Optional[70000.0],
//   HR=Optional[60000.0]
// }

```
