⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ⏺️ Finding MAX in Array

- 🔴for MIN also it works the same.

## ️➡️ Array of Primitive Types (int[], double[])

#### 🟦 Using loop (best performance)

```java
int[] arr = {10, 50, 20, 90, 40};

int max = arr[0];
for (int num : arr) {
    if (num > max) max = num;
}

System.out.println(max);  // 90

```

#### 🟦 Using Streams

- gives **IntStream**, so `.max()` works without comparator.

```java
int max = Arrays.stream(arr)
                .max()
                .orElse(Integer.MIN_VALUE);

```

## ️➡️ Array of Object Types (Integer[], String[], Employee[])

#### 🟦 Integer[]

```java
Integer[] arr = {10, 50, 20, 90, 40};

int max = Arrays.stream(arr)
        .max(Integer::compareTo)
        .orElse(0);

System.out.println(max);  // 90

```

#### 🟦 String[] (Lexicographical max)

```java
String[] names = {"java", "python", "go", "javascript"};

String max = Arrays.stream(names)
        .max(String::compareTo)
        .orElse("Not Found");

System.out.println(max);  // python

```

#### 🟦 Employee[] (max salary)

```java
class Employee {
    int salary;
    Employee(int salary) { this.salary = salary; }
    public int getSalary() { return salary; }
}

Employee[] employees = {
    new Employee(50000),
    new Employee(70000),
    new Employee(60000)
};

Employee maxEmp = Arrays.stream(employees)
        .max(Comparator.comparingInt(Employee::getSalary))
        // .max(Comparator.comparingInt(emp -> emp.getSalary()))
        .orElse(null);

System.out.println(maxEmp.getSalary());  // 70000

```

## ️➡️

#### 🟦

```java

```
