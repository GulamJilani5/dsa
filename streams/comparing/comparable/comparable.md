⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ⏺️ Comparable

- It has exactly one abstract method.
- 0 static methods, default/other instance methods

```java
public interface Comparable<T> {
    int compareTo(T o);
}
```

- It is used for Natural/default ordering

### ➡️ compareTo()

- **compareTo()** is abstract in Comparable
- But concrete instance method in the **All Wrapper** Classes, **String** and **LocalDate**.

#### 🟦 The String

- Natural ordering (alphabetical/lexicographical)

```java
String s1 = "Alice";
String s2 = "Bob";

int result = s1.compareTo(s2);
```

```java
List<String> names = List.of("Charlie", "Alice", "Bob");

names.stream()
     .sorted()
     .forEach(System.out::println);
```

#### 🟦 Number

- Natural ordering = numerical order.

```java
Integer n1 = 10;
Integer n2 = 20;

int result = n1.compareTo(n2);
```

```java
List<Integer> numbers = List.of(50, 10, 30, 20);

numbers.stream()
       .sorted()
       .forEach(System.out::println);
```

##### 🟦 Object - Employee

- Here we decided that an employee's natural ordering is by salary.

```java
class Employee implements Comparable<Employee> {

    private String name;
    private double salary;
    private LocalDate hireDay;

    @Override
    public int compareTo(Employee other) {
        return Double.compare(salary, other.salary);
    }
}
```

- `sorted()` uses the natural sorting order.

```java
employees.stream()
         .sorted()
         .forEach(e -> System.out.println(e.getName() + " " + e.getSalary()));
```
