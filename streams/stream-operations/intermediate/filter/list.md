⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ⏺️ LIST

## ➡️ List of Numbers (Integer)

#### 🟦 filter even numbers

```java
 List<Integer> nums = List.of(10, 15, 20, 25, 30);

        List<Integer> even = nums.stream()
                .filter(n -> n % 2 == 0)
                .toList();

```

- Method Reference version

```java
public static boolean isEven(int n) {
    return n % 2 == 0;
}

List<Integer> even = nums.stream()
        .filter(Main::isEven)
        .toList();

```

#### 🟦

```java

```

- Method Reference version

```java

```

## ➡️ List of Strings

#### 🟦 filter length > 4

```java
 List<String> words = List.of("java", "python", "go", "javascript");

        List<String> result = words.stream()
                .filter(w -> w.length() > 4)
                .toList();

        System.out.println(result);
```

- Method Reference version

```java
public static boolean lengthGreaterThan4(String s) {
    return s.length() > 4;
}

List<String> result = words.stream()
        .filter(Main::lengthGreaterThan4)
        .toList();

```

#### 🟦

```java

```

- Method Reference version

```java

```

## ➡️ List of Objects (Employee)

- Employee class

```java
class Employee {
    private int id;
    private String name;
    private int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getSalary() { return salary; }

    @Override
    public String toString() {
        return id + "-" + name + "-" + salary;
    }
}

```

#### 🟦 filter employees salary > 50000

```java
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee(1, "Ali", 40000),
                new Employee(2, "Sara", 60000),
                new Employee(3, "John", 80000)
        );

        List<Employee> result = employees.stream()
                .filter(emp -> emp.getSalary() > 50000)
                .toList();

        System.out.println(result);
    }
}

```

- Method Reference version

```java
public static boolean highSalary(Employee emp) {
    return emp.getSalary() > 50000;
}

List<Employee> result = employees.stream()
        .filter(Main::highSalary)
        .toList();

```

#### 🟦 Filter Female Employees by Department

- Employee + Department Classes

```java
class Employee {
    private int id;
    private String name;
    private String gender;
    private String department;
    private int salary;

    public Employee(int id, String name, String gender, String department, int salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.department = department;
        this.salary = salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getGender() { return gender; }
    public String getDepartment() { return department; }
    public int getSalary() { return salary; }

    @Override
    public String toString() {
        return id + " - " + name + " - " + gender + " - " + department + " - " + salary;
    }
}

```

- Data(filter logic also here)

```java
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee(1, "Ali", "Male", "IT", 50000),
                new Employee(2, "Sara", "Female", "HR", 60000),
                new Employee(3, "Ayesha", "Female", "IT", 75000),
                new Employee(4, "John", "Male", "Finance", 80000),
                new Employee(5, "Hina", "Female", "Finance", 90000),
                new Employee(6, "Mary", "Female", "IT", 65000)
        );

        // 🔴 filter logic will be here
    }
}

```

#### 🟦 Filter Female Employees

```java
List<Employee> femaleEmployees = employees.stream()
        .filter(emp -> emp.getGender().equalsIgnoreCase("Female"))
        .toList();

System.out.println(femaleEmployees);

```

#### 🟦 Filter Female Employees in IT Department

```java
List<Employee> femaleITEmployees = employees.stream()
        .filter(emp -> emp.getGender().equalsIgnoreCase("Female")
                && emp.getDepartment().equalsIgnoreCase("IT"))
        .toList();

System.out.println(femaleITEmployees);

```

- Method Reference version

```java
public static boolean isFemaleInIT(Employee emp) {
    return emp.getGender().equalsIgnoreCase("Female")
            && emp.getDepartment().equalsIgnoreCase("IT");
}


List<Employee> femaleITEmployees = employees.stream()
        .filter(Main::isFemaleInIT)
        .toList();

System.out.println(femaleITEmployees);

```

#### 🟦 Highest & 2nd Highest Salary Female Employee

```java
Employee highestSalaryFemale =
        employees.stream()
                .filter(e -> e.getGender().equalsIgnoreCase("Female"))
                .sorted((e1, e2) -> Integer.compare(e2.getSalary(), e1.getSalary()))
                .findFirst()
                .orElse(null);

Employee secondHighestSalaryFemale =
        employees.stream()
                .filter(e -> e.getGender().equalsIgnoreCase("Female"))
                .sorted((e1, e2) -> Integer.compare(e2.getSalary(), e1.getSalary()))
                .skip(1)
                .findFirst()
                .orElse(null);

System.out.println("Highest Salary Female: " + highestSalaryFemale);
System.out.println("Second Highest Salary Female: " + secondHighestSalaryFemale);

```

#### 🟦 Highest Female Count and Highest female count in Department

- **Way 1**
  - just finds the maximum in one pass
  - better in terms of performance
  - O(n)

```java
Long highestCount =
        employees.stream()
                .filter(e -> e.getGender().equalsIgnoreCase("Female"))
                .map(Employee::getDepartment)
                .collect(Collectors.groupingBy(
                        dept -> dept,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .map(Map.Entry::getValue)
                .findFirst()
                .orElse(0L);

System.out.println("Highest Female Count: " + highestCount);


String highestDeptName =
        employees.stream()
                .filter(e -> e.getGender().equalsIgnoreCase("Female"))
                .map(Employee::getDepartment)
                .collect(Collectors.groupingBy(
                        dept -> dept,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

System.out.println("Highest Female count Department Name: " + highestDeptName);

```

- **Way 2**
  - `sorted(...).findFirst()` sorts all entries
  - Sorting is expensive: **O(n log n)**

```java
Long highestCount =
        employees.stream()
                .filter(e -> e.getGender().equalsIgnoreCase("Female"))
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                         Collectors.counting())
                )
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getValue)
                .orElse(0L);
System.out.println("Highest Female Count: " + highestCount);

Long highestCount =
        employees.stream()
                .filter(e -> e.getGender().equalsIgnoreCase("Female"))
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                         Collectors.counting())
                )
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(0L);
System.out.println("Highest Female count Department Name: " + highestDeptName);
```

#### 🟦 Second Highest Female Count and Second Highest female count in Department

- **Way 1**

```java
Long secondHighestCount =
        employees.stream()
                .filter(e -> e.getGender().equalsIgnoreCase("Female"))
                .map(Employee::getDepartment)
                .collect(Collectors.groupingBy(
                        dept -> dept,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .map(Map.Entry::getValue)
                .skip(1)
                .findFirst()
                .orElse(0L);

System.out.println("Second Highest Female Count: " + secondHighestCount);


String secondHighestDeptName =
        employees.stream()
                .filter(e -> e.getGender().equalsIgnoreCase("Female"))
                .map(Employee::getDepartment)
                .collect(Collectors.groupingBy(
                        dept -> dept,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .map(Map.Entry::getKey)
                .skip(1)
                .findFirst()
                .orElse(null);

System.out.println("Second Highest Female Count Department Name: " + secondHighestDeptName);

```

- **Way 2**

```java
import java.util.*;
import java.util.stream.Collectors;

List<Map.Entry<String, Long>> top2Departments =
        employees.stream()
                .filter(e -> e.getGender().equalsIgnoreCase("Female"))
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .sorted((e1, e2) -> Long.compare(e2.getValue(), e1.getValue()))
                .limit(2)
                .toList();

Map.Entry<String, Long> highestDept =
        top2Departments.size() > 0 ? top2Departments.get(0) : null;

Map.Entry<String, Long> secondHighestDept =
        top2Departments.size() > 1 ? top2Departments.get(1) : null;

System.out.println("Highest Female Count Dept: " + highestDept);
System.out.println("Second Highest Female Count Dept: " + secondHighestDept);

```

## ➡️

#### 🟦

```java

```

- Method Reference version

```java

```
