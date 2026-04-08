⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ⏺️ Second Highest Salary in the Employee table

- Employee Class

```java
class Employee {
    int empid;
    String name;
    double salary;      // Using int for simplicity (common in interviews but in real project it should be double)
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

- Main class where our code goes

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
            new Employee(103, "Carol Lee", 90000, "Engineering"),
            new Employee(103, "Carol Lee", 80000, "Engineering"),
            new Employee(104, "David Brown", 50000, "HR")
            new Employee(104, "David Brown", 60000, "HR")
        );

       /*****************
       ********
       **** Code Logic Goes Here
       ********
       *****************/
    }
}

```

### ➡️ Find the second highest salary of Employee table

```java
 int secondHighestSalary = employeeList.stream()
                                .map(Employee::getSalary)
                                .distinct()
                                .sorted(Comparator.reverseOrder())
                                .skip(1)
                                .findFirst()
                                .orElse(0);

        System.out.println(" Second highest salary: " + secondHighestSalary);
```

### ➡️ How to find the second highest salary per department using Java 8 Streams?

- Employees grouped by department. Find the second highest salary in each department

- **Returning Optional double**

```java
Map<String, Optional<Double>> secondHighestSalary =
    employees.stream()
        .collect(Collectors.groupingBy(
            Employee::getDepartment,
            Collectors.mapping(
                Employee::getSalary,   // must return Double
                Collectors.collectingAndThen(
                    Collectors.toList(),     // ✔ downstream collector
                    list -> list.stream()    // ✔ finisher function
                        .distinct()
                        .sorted(Comparator.reverseOrder())
                        .skip(1)
                        .findFirst()
                )
            )
        ));

```

- **Returning directly double no optional**

```java
Map<String, Double> secondHighestSalaryByDept =
        employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.mapping(
                                Employee::getSalary,  // mapper for mapping()
                                Collectors.collectingAndThen(  // downstream collector for mapping()
                                        Collectors.toList(),   // ✔ downstream collector for collectingAndThen()
                                        list -> list.stream()  // ✔ finisher function for collectingAndThen()
                                                .distinct()
                                                .sorted(Comparator.reverseOrder())
                                                .skip(1)
                                                .findFirst()
                                                .orElse(null)
                                )
                        )
                ));

```

- In my notes I am haivng this code, I am having `Collectors.mapping()` inside `Collectors.collectingAndThen()`

```java
Map<String, Optional<Double>> map =
        employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.mapping(Employee::getSalary, Collectors.toList()), // mapping(mapper, Downstream Collector)// ✔ downstream collector for collectingAndThen()
                                salaries -> salaries.stream() // ✔ finisher function for collectingAndThen()
                                        .distinct()
                                        .sorted(Comparator.reverseOrder())
                                        .skip(1)
                                        .findFirst()
                        )
                ));

```

### ➡️ How to find the average salary from each department using Java 8 Streams?

```java
 Map<String, Double> avgSalaryByDept = employeeList.stream()
                    .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingInt(Employee::getSalary)
                    ));

        System.out.println(avgSalaryByDept);
```

### ➡️ Highest Paid Employee per Department (Employee Object)

```java
Map<String, Optional<Employee>> highestPaidEmployeePerDept =
    employees.stream()
        .collect(Collectors.groupingBy(
            Employee::getDepartment,
            Collectors.maxBy(
                Comparator.comparing(Employee::getSalary)
            )
        ));

```

- If Multiple Employees Can Have Same Highest Salary

```java
Map<String, List<Employee>> highestPaidEmployeesPerDept =
    employees.stream()
        .collect(Collectors.groupingBy(
            Employee::getDepartment,
            Collectors.collectingAndThen(
                Collectors.toList(),
                list -> {
                    int maxSalary = list.stream()
                            .mapToInt(Employee::getSalary)
                            .max()
                            .orElse(0);

                    return list.stream()
                            .filter(e -> e.getSalary() == maxSalary)
                            .collect(Collectors.toList());
                }
        )));

```

```java

```

# ⏺️ Given a list of employees where each employee has:

- Infosys 🔴
- `empid`, `name` `gender`, `salary`, `department`

- Your task is to:
  - Filter female employees only
  - Group them by department
  - Count the number of female employees in each department
  - Find the department with the maximum number of female employees

```java
  Map.Entry<String, Long> result = employees.stream()
        .filter(emp -> "F".equalsIgnoreCase(emp.getGender()))
        // .filter(emp -> emp.getGender().equalsIgnoreCase(""Female))
        .collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.counting()
        ))
        .entrySet()
        .stream()
        .max(Map.Entry.comparingByValue())
        .orElse(null);

if(result != null){
    System.out.println("Department: " + result.getKey());
    System.out.println("Female Count: " + result.getValue());
}

```
