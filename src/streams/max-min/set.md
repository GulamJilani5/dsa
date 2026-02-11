⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ⏺️ Finding MAX in Set

- 🔴for MIN also it works the same.

## ️➡️ Set of Numbers

#### 🟦 Using Stream()

```java
Set<Integer> set = Set.of(10, 50, 20, 90, 40);

int max = set.stream()
        .max(Integer::compareTo)
        .orElse(0);

System.out.println(max);  // 90

```

#### 🟦 Using Collections.max()

```java
int max = Collections.max(set);

```

## ️➡️ Set of Strings

#### 🟦 Using Stream()

```java
Set<String> words = Set.of("java", "python", "go", "javascript");

String max = words.stream()
        .max(String::compareTo)
        .orElse("Not Found");

System.out.println(max);

```

#### 🟦 Using Collections.max()

```java
Set<String> words = Set.of("java", "python", "go", "javascript");

String max = Collections.max(words);  // lexicographical max
System.out.println(max);

```

## ️➡️ Set of Objects (Employee max salary)

```java
Set<Employee> employees = Set.of(
        new Employee(50000),
        new Employee(70000),
        new Employee(60000)
);

Employee maxEmp = employees.stream()
        .max(Comparator.comparingInt(Employee::getSalary))
        // .max(Comparator.comparingInt(emp -> emp.getSalary()))
        .orElse(null);

System.out.println(maxEmp.getSalary());

```
