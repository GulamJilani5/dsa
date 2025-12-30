⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ➡️ Find the second highest salary of employee table

```java

import java.util.*;
import java.util.List;
import java.util.Comparator;
import java.util.Optional;

class Main {

    public static void main(String[] args) {

        System.out.println("Try programiz.pro");

        // Immutable list using List.of()

        List<Employee> employeeList = List.of(
            new Employee(101, "Alice Johnson", 75000, "Engineering"),
            new Employee(102, "Bob Smith", 68000, "Marketing"),
            new Employee(103, "Carol Lee", 82000, "Engineering"),
            new Employee(104, "David Brown", 55000, "HR")
        );

        int secondHighestSalary = employeeList.stream()
                                    .map(Employee::getSalary)
                                    .distinct()
                                    .sorted(Comparator.reverseOrder())
                                    .skip(1)
                                    .findFirst()
                                    .orElse(0);

        System.out.println(" Second highest salary: " + secondHighestSalary);
    }
}

class Employee {
    int empid;
    String name;
    int salary;      // Using int for simplicity (common in interviews but in real project it should bedouble)
    String department;
    public Employee(int empid, String name, int salary, String department) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }
    public String getDepartment() {
        return department;
    }
}
```

# ➡️ How to find the second highest salary from each group using Java 8 Streams?

- Employees grouped by department. Find the second highest salary in each department

```java
 Map<String, Optional<Integer>> secondHighestSalary =
    employees.stream()
        .collect(Collectors.groupingBy(
            Employee::getDepartment,
            Collectors.collectingAndThen(
                Collectors.mapping(Employee::getSalary, Collectors.toList()),
                salaries -> salaries.stream()
                        .distinct()
                        .sorted(Comparator.reverseOrder())
                        .skip(1)
                        .findFirst()
            )
        ));

```

# ➡️ How to find the average salary from each department using Java 8 Streams?

```java
 Map<String, Double> avgSalaryByDept = employeeList.stream()
                    .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingInt(Employee::getSalary)
                    ));

        System.out.println(avgSalaryByDept);
```
