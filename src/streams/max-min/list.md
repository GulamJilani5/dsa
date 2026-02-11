⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ⏺️ Finding MAX in List

- 🔴for MIN also it works the same.

## ️➡️ List of Numbers (List<Integer>)

#### 🟦 Using Stream

```java
List<Integer> nums = List.of(10, 50, 20, 90, 40);

int max = nums.stream()
        .max(Integer::compareTo) // Method Reference
        // .max((a, b) -> a.compareTo(b))
        // .max(Integer::compare)
        // .max((a, b) -> Integer.compare(a, b)) //Lambda Expression
        .orElse(0);

System.out.println(max);  // 90

```

#### 🟦 Using Collections.max()

```java
int max = Collections.max(nums);

```

## ️➡️ List of Strings (List<String>)

#### 🟦 Lexicographical max

```java
List<String> words = List.of("java", "python", "go", "javascript");

String max = words.stream()
        .max(String::compareTo)
        // .max((a, b) -> String.compare(a, b))
        .orElse("Not Found");

System.out.println(max);

```

#### 🟦 Max string by length

```java
String maxLenWord = words.stream()
        .max(Comparator.comparingInt(String::length))
        // .max(Comparator.comparingInt(str -> str.length()))
        .orElse("Not Found");

System.out.println(maxLenWord);  // javascript

```

## ➡️ List of Objects (List<Employee>)

#### 🟦 Max object by salary

```java
List<Employee> list = List.of(
        new Employee(50000),
        new Employee(60000),
        new Employee(70000)
);

Employee maxEmp = list.stream()
        .max(Comparator.comparingInt(Employee::getSalary))
        // .max(Comparator.comparingInt(emp -> emp.getSalary()))
        .orElse(null);

System.out.println(maxEmp.getSalary());  // 70000

```

#### 🟦 Max salary directly (primitive result)

```java
int maxSalary = list.stream()
        .mapToInt(Employee::getSalary)
        // .mapToInt(emp -> emp.getSalary())
        .max()
        .orElse(0);

System.out.println(maxSalary);

```

- This is best because `mapToInt()` makes it **IntStream**, so **.max()** works without comparator.
