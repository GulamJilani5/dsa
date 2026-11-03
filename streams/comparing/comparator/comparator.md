⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ⏺️ Comparator

- It is Functional Interface which has exactly one abstract method.
- It has multiple usefull instance/defualt method and static methods.

```java
@FunctionalInterface
public interface Comparator<T> {
int compare(T o1, T o2);
...
...

}
```

```text
Comparator<T>  → INTERFACE
│
├── abstract instance
│   └── compare()
│
├── default instance
│   ├── reversed()
│   ├── thenComparing()
│   ├── thenComparingInt()
│   ├── thenComparingLong()
│   └── thenComparingDouble()
│
└── static
    ├── reverseOrder()
    ├── naturalOrder()
    ├── nullsFirst()
    ├── nullsLast()
    ├── comparing()
    ├── comparingInt()
    ├── comparingLong()
    └── comparingDouble()
```

### ➡️ All the Methods

```java
@FunctionalInterface
public interface Comparator<T> {

    // ABSTRACT INSTANCE METHOD
    int compare(T o1, T o2);


    // DEFAULT INSTANCE METHODS
    default Comparator<T> reversed();

    default Comparator<T> thenComparing(Comparator<? super T> other);

    default <U> Comparator<T> thenComparing(
            Function<? super T, ? extends U> keyExtractor);

    default <U> Comparator<T> thenComparing(
            Function<? super T, ? extends U> keyExtractor,
            Comparator<? super U> keyComparator);

    default Comparator<T> thenComparingInt(
            ToIntFunction<? super T> keyExtractor);

    default Comparator<T> thenComparingLong(
            ToLongFunction<? super T> keyExtractor);

    default Comparator<T> thenComparingDouble(
            ToDoubleFunction<? super T> keyExtractor);


    // STATIC METHODS
    static <T extends Comparable<? super T>>
    Comparator<T> reverseOrder();

    static <T extends Comparable<? super T>>
    Comparator<T> naturalOrder();

    static <T>
    Comparator<T> nullsFirst(Comparator<? super T> comparator);

    static <T>
    Comparator<T> nullsLast(Comparator<? super T> comparator);

    static <T, U extends Comparable<? super U>>
    Comparator<T> comparing(
            Function<? super T, ? extends U> keyExtractor);

    static <T, U>
    Comparator<T> comparing(
            Function<? super T, ? extends U> keyExtractor,
            Comparator<? super U> keyComparator);

    static <T>
    Comparator<T> comparingInt(
            ToIntFunction<? super T> keyExtractor);

    static <T>
    Comparator<T> comparingLong(
            ToLongFunction<? super T> keyExtractor);

    static <T>
    Comparator<T> comparingDouble(
            ToDoubleFunction<? super T> keyExtractor);
}
```

### ➡️ Object - Employee

- Here we decided that an employee's natural ordering is by salary.

```java
class Employee {

    private String name;
    private double salary;
    private LocalDate hireDay;
  // getters...
  // setters...
}
```

##### 🟦 sort employees by name

```java
Comparator<Employee> byName =
    (e1, e2) -> e1.getName().compareTo(e2.getName());

employees.stream()
         .sorted(byName)
         .forEach(e -> System.out.println(e.getName()));
```

##### 🟦 sort employees by hireDay

```java
Comparator<Employee> byHireDate =
    (e1, e2) -> e1.getHireDay().compareTo(e2.getHireDay());

employees.stream()
         .sorted(byHireDate)
         .forEach(e -> System.out.println(e.getName()));
```

##### 🟦 sort employees by salary

```java
Comparator<Employee> bySalary =
    (e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary());

employees.stream()
         .sorted(bySalary)
         .forEach(e -> System.out.println(e.getName()));
```
