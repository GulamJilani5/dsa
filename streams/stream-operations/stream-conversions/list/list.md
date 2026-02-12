⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ⏺️ Converting List to Stream

## ➡️ stream()

- **list of String**

```java
 List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Spring");
        list.add("React");

        list.stream().forEach(System.out::println);
```

- **List of integer**

```java
List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        list.stream().forEach(System.out::println);
```

- **List of Objects → Stream**
- Employee class:

```java
class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return id + " " + name + " " + salary;
    }
}

```

- Create List of Objects + Convert to Stream

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        list.add(new Employee(101, "Ali", 50000));
        list.add(new Employee(102, "Ahmed", 60000));
        list.add(new Employee(103, "Sara", 55000));

        // Convert List<Employee> to Stream<Employee>
        list.stream().forEach(System.out::println);
    }
}

```

## ➡️ List.of() (java9+)

- completely immutable
- can throws `NullPointerException`

```java
Stream<Integer> stream = List.of(10, 20, 30).stream();

```

## ➡️ Arrays.asList

- fixed size list backed by array
- We can update element but can not add or remove

```java
List<Integer> list = Arrays.asList(10, 20, 30);

Stream<Integer> stream = list.stream();

```

## ➡️ Stream.of(list)

- Not recommended for elements

```java
List<Integer> list = Arrays.asList(10, 20, 30);
Stream<List<Integer>> stream = Stream.of(list);
```
