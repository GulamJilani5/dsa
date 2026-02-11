⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ⏺️ Finding MAX in Map

- 🔴for MIN also it works the same.

## ️➡️ Max by Key and Value

- Assume

```java
Map<String, Integer> map = Map.of(
        "A", 10,
        "B", 50,
        "C", 30
);

```

### 🟦 Max by Key

##### 🔵 Using Stream

```java
String maxKey = map.keySet().stream()
        .max(String::compareTo)
        .orElse(null);

System.out.println(maxKey);

```

##### 🔵 Collection.max()

```java
String maxKey = Collections.max(map.keySet());

```

#### 🟦 Max by Value

##### 🔵 Using Stream

```java
int maxValue = map.values().stream()
        .max(Integer::compareTo)
        .orElse(0);

System.out.println(maxValue);  // 50

```

##### 🔵 Collection.max()

```java
int maxValue = Collections.max(map.values());

```

## ️➡️ Max Entry (returns key-value pair)

#### 🟦 Max Entry by Value

```java
Map.Entry<String, Integer> maxEntry = map.entrySet().stream()
        .max(Map.Entry.comparingByValue())
        .orElse(null);

System.out.println(maxEntry);  // B=50

```

#### 🟦 Max Entry by Key

```java
Map.Entry<String, Integer> maxEntry = map.entrySet().stream()
        .max(Map.Entry.comparingByKey())
        .orElse(null);

System.out.println(maxEntry);
```

## ️➡️ Max by Derived Attribute (custom logic)

#### 🟦

- Example: `Map<String, Employee>`

```java
Map<String, Employee> empMap = Map.of(
        "E1", new Employee(50000),
        "E2", new Employee(70000),
        "E3", new Employee(60000)
);

Map.Entry<String, Employee> maxSalaryEntry =
            empMap.entrySet().stream()
                    .max(Comparator.comparingInt(e -> e.getValue().getSalary()))
                    // 🔴.max(Comparator.comparingInt(Employee::getSalary)) This is correct for Emplyoee class but not for Map.Entry<String, Employee>.
                    .orElse(null);

System.out.println(maxSalaryEntry.getKey()); // E2
System.out.println(maxSalaryEntry.getValue().getSalary()); // 70000

```

- Derived attribute = `e.getValue().getSalary()`
