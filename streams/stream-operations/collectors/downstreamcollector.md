⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ⏺️ ALL major downstream collectors

- how to accumulate stream elements
- intermediate container type (A)
- collected result type (R)

### ➡️ Collectors.toList()

```java
groupingBy(Employee::getDept, toList())
// Result:
Map<Dept, List<Employee>>
```

### ➡️ Collectors.toSet()

```java
groupingBy(Employee::getDept, toSet())
// Result:
Map<Dept, Set<Employee>>
```

### ➡️ Collectors.counting()

```java
groupingBy(Employee::getDept, counting())
// Result:
Map<Dept, Long>
```

### ➡️ Collectors.summingInt()/Collectors.summingLong()/Collectors.summingDouble()

```java
groupingBy(Employee::getDept, summingInt(Employee::getAge))
//Result:
Map<Dept, Integer>
```

```java
groupingBy(Employee::getDept, summingLong(Employee::getId))
// Result:
Map<Dept, Long>
```

```java
groupingBy(Employee::getDept, summingDouble(Employee::getSalary))
// Result:
Map<Dept, Double>
```

### ➡️ Collectors.averagingInt()/Collectors.averagingLong()/Collectors.averagingDouble()

```java
groupingBy(Employee::getDept, averagingInt(Employee::getAge))
// Result:
Map<Dept, Double>
```

```java
groupingBy(Employee::getDept, averagingLong(Employee::getId))
// Result:
Map<Dept, Double>
```

```java
groupingBy(Employee::getDept, averagingDouble(Employee::getSalary))
// Result:
Map<Dept, Double>
```

```java

```

### ➡️ Collectors.maxBy()/Collectors.minBy()

```java
groupingBy(Employee::getDept,
           maxBy(Comparator.comparing(Employee::getSalary)))
// Result:
Map<Dept, Optional<Employee>>
```

```java
groupingBy(Employee::getDept,
           minBy(Comparator.comparing(Employee::getSalary)))

//Result:
Map<Dept, Optional<Employee>>
```

### ➡️ Collectors.summarizingInt()/Collectors.summarizingLong()/Collectors.summarizingDouble()

```java
groupingBy(Employee::getDept,
           summarizingInt(Employee::getAge))
// Result:
Map<Dept, IntSummaryStatistics>
```

```java
groupingBy(Employee::getDept,
           summarizingLong(Employee::getId))

// Result:
Map<Dept, LongSummaryStatistics>
```

```java
groupingBy(Employee::getDept,
           summarizingDouble(Employee::getSalary))

//Result:
Map<Dept, DoubleSummaryStatistics>
```

### ➡️ Collectors.joining()

- only works if stream is String OR mapping is used

```java
groupingBy(Employee::getDept,
           mapping(Employee::getName, joining(",")))

// Result:
Map<Dept, String>
```

### ➡️ Collectors.filtering() (Java 9+)

- Filters elements inside each group.

```java
groupingBy(Employee::getDept,
           filtering(e -> e.getSalary() > 50000, toList()))

// Result:
Map<Dept, List<Employee>>
```

### ➡️ Collectors.reducing()

- Used for custom reduction.

```java
groupingBy(Employee::getDept,
           reducing(0.0, Employee::getSalary, Double::sum))
// Result:
Map<Dept, Double>
```

### ➡️ Collectors.collectingAndThen()

- Post-processing after collecting.

```java
groupingBy(Employee::getDept,
           collectingAndThen(toList(), List::size))
// Result:
Map<Dept, Integer>
```

### ➡️ Collectors.partitioningBy()

- Can be used inside groupingBy (rare but possible)

```java
groupingBy(Employee::getDept,
           partitioningBy(e -> e.getSalary() > 50000))

//Result:
Map<Dept, Map<Boolean, List<Employee>>>
```

### ➡️ Collectors.groupingBy() itself (Nested Grouping)

- Yes, groupingBy can be downstream of groupingBy.

```java
groupingBy(Employee::getDept,
           groupingBy(Employee::getGender))

//Result:
Map<Dept, Map<Gender, List<Employee>>>
```

### ➡️ Collectors.mapping()

- Used to transform elements before collecting.

```java
groupingBy(Employee::getDept,
           mapping(Employee::getName, toList()))
// Result:
Map<Dept, List<String>>
```

### ➡️ Collectors.toCollection(Supplier)

```java
groupingBy(Employee::getDept, toCollection(LinkedList::new))
//Result:
Map<Dept, LinkedList<Employee>>
```

### ➡️

```java

```

### ➡️

```java

```

### ➡️

```java

```
