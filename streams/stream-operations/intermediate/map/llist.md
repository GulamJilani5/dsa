⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ⏺️ List

## ➡️ LIST (Numbers)

### 🟦 List<Integer> → square

```java
List<Integer> nums = List.of(1, 2, 3, 4);

List<Integer> squares = nums.stream()
        .map(n -> n * n)
        .toList();
System.out.println(squares);

// No method reference possible for n*n.

```

### 🟦 List<Integer> → convert to String

```java
List<String> result = nums.stream()
        .map(n -> String.valueOf(n))
        // .map(String::valueOf)
        .toList();

```

### 🟦 List<Integer> → primitive IntStream (performance best)

```java
int sum = nums.stream()
        .mapToInt(n -> n)
        // .mapToInt(Integer::intValue)
        .sum();

```

## ➡️ LIST (Strings)

### 🟦 List<String> → uppercase

```java
List<String> names = List.of("java", "python", "go");

List<String> upper = names.stream()
        .map(s -> s.toUpperCase())
        // .map(String::toUpperCase)
        .toList();

```

### 🟦 List<String> → length

```java
List<Integer> lengths = names.stream()
        .map(str -> str.length())
        //  .map(String::length)
        .toList();

```

### 🟦 List<String> → first character

```java
List<Character> chars = names.stream()
        .map(s -> s.charAt(0))
        .toList();
// No direct method reference for charAt(0).
```

## ➡️ LIST (Objects)

- Employee Object

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

    public String toString() {
        return id + " " + name + " " + salary;
    }
}

```

### 🟦 List<Employee> → extract salary

```java
List<Employee> employees = List.of(
        new Employee(1, "A", 50000),
        new Employee(2, "B", 70000)
);
List<Integer> salaries = employees.stream()
        .map(e -> e.getSalary())
        // .map(Employee::getSalary)
        .toList();

```

### 🟦 List<Employee> → LongStream salary (best)

```java
int maxSalary = employees.stream()
        .mapToLong(e -> e.getSalary())
        // .mapToInt(Employee::getSalary)
        .max()
        .orElse(0);

```

### 🟦 List<Employee> → List<String> names

```java
List<String> names = employees.stream()
        .map(e -> e.getName())
        // .map(Employee::getName)
        .toList();
```

### 🟦 List<Employee> → List<EmployeeDTO>

```java
class EmployeeDTO {
    private String name;
    private int salary;

    public EmployeeDTO(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return name + " -> " + salary;
    }
}

```

```java
List<EmployeeDTO> dtos = employees.stream()
        .map(e -> new EmployeeDTO(e.getName(), e.getSalary()))
        // .map(e -> new EmployeeDTO(e.getName(), e.getSalary()))
        .toList();

```

### 🟦 Direct method reference like EmployeeDTO::new is possible only if constructor matches exactly:

- Example: EmployeeDTO(String name) if mapping only name.

- **Employee Class**

```java
class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
}

```

- **EmployeeDTO Class** (constructor matches exactly one String)

```java
class EmployeeDTO {
    private String name;

    public EmployeeDTO(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{name='" + name + "'}";
    }
}

```

##### 🔵 Stream mapping using Method Reference

```java
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee("Ali", 50000),
                new Employee("Ahmed", 60000),
                new Employee("Sara", 70000)
        );

        List<EmployeeDTO> dtoList = employees.stream()
                .map(Employee::getName)     // produces Stream<String>
                // .map(emp -> emp.getName())
                .map(EmployeeDTO::new)      // calls EmployeeDTO(String name)
                // .map(name -> new EmployeeDTO(name))
                .toList();

        System.out.println(dtoList);
    }
}

//// Output
//  [EmployeeDTO{name='Ali'}, EmployeeDTO{name='Ahmed'}, EmployeeDTO{name='Sara'}]

```
