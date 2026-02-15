⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ⏺️ Collectors.groupingBy()

## ➡️ groupingBy(classifier) = groupingBy(classifier, Collectors.toList())

- 1 argument only classfier
- `classifier` → a function that extracts the grouping key.
- return type `Collector<T, ?, Map<K, List<T>>>`
  - Java automatically uses a default downstream collector internally which is `Collectors.toList()`
- Groups stream elements into a **Map**
  - `Key` = grouping key
  - `Value` = list of grouped elements( default downstream collector internally which is `Collectors.toList()`)

```java
Map<String, List<String>> map =
        Stream.of("Apple", "Avocado", "Banana", "Ball")
              .collect(Collectors.groupingBy(word -> word.substring(0,1)));

System.out.println(map);
// Output
// key = A
// Value = List of names starting with A
// key = B
// Value = List of names starting with B
{A=[Apple, Avocado], B=[Banana, Ball]}

```

## ➡️ groupingBy(classifier, downstreamCollector)

- **2 Arguments:**
  - `classifier`
  - `downstream collector` (like counting(), summingInt(), mapping(), etc.)
- return type
  - Collector<T, ?, Map<K, D>>
  - returns default map with key(classifier) & value(downstream collector).

- Instead of storing List<T>, you can store something else like:
  - count
  - sum
  - average
  - set
  - max/min
  - mapped list

- Example: Count employees in each department

```java

Map<String, Long> deptCount =
        employees.stream()
                 .collect(Collectors.groupingBy(
                     Employee::getDepartment,
                     Collectors.counting()
                 ));
```

## ➡️ groupingBy(classifier, mapFactory, downstreamCollector)

- **3 Arguments**
  - classifier
  - mapFactory (HashMap, TreeMap, LinkedHashMap etc.)
  - downstream collector
- Return Type: `Collector<T, ?, M>`
  - returns the mentioned map with key(classifier) & value(downstream collector).

- **Example: Sorted TreeMap grouping**
  - Output Map will be sorted

```java
Map<String, Long> deptCount =
        employees.stream()
                 .collect(Collectors.groupingBy(
                     Employee::getDepartment,
                     TreeMap::new,
                     Collectors.counting()
                 ));
```

## ➡️ ALL major downstream collectors

#### 🟦 Collectors.toList()

```java
groupingBy(Employee::getDept, toList())
// Result:
Map<Dept, List<Employee>>
```

#### 🟦 Collectors.toSet()

```java
groupingBy(Employee::getDept, toSet())
// Result:
Map<Dept, Set<Employee>>
```

#### 🟦 Collectors.counting()

```java
groupingBy(Employee::getDept, counting())
// Result:
Map<Dept, Long>
```

#### 🟦 Collectors.summingInt()/Collectors.summingLong()/Collectors.summingDouble()

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

#### 🟦 Collectors.averagingInt()/Collectors.averagingLong()/Collectors.averagingDouble()

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

#### 🟦 Collectors.maxBy()/Collectors.minBy()

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

#### 🟦 Collectors.summarizingInt()/Collectors.summarizingLong()/Collectors.summarizingDouble()

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

#### 🟦 Collectors.joining()

- only works if stream is String OR mapping is used

```java
groupingBy(Employee::getDept,
           mapping(Employee::getName, joining(",")))

// Result:
Map<Dept, String>
```

#### 🟦 Collectors.filtering() (Java 9+)

- Filters elements inside each group.

```java
groupingBy(Employee::getDept,
           filtering(e -> e.getSalary() > 50000, toList()))

// Result:
Map<Dept, List<Employee>>
```

#### 🟦 Collectors.reducing()

- Used for custom reduction.

```java
groupingBy(Employee::getDept,
           reducing(0.0, Employee::getSalary, Double::sum))
// Result:
Map<Dept, Double>
```

#### 🟦 Collectors.collectingAndThen()

- Post-processing after collecting.

```java
groupingBy(Employee::getDept,
           collectingAndThen(toList(), List::size))
// Result:
Map<Dept, Integer>
```

#### 🟦 Collectors.partitioningBy()

- Can be used inside groupingBy (rare but possible)

```java
groupingBy(Employee::getDept,
           partitioningBy(e -> e.getSalary() > 50000))

//Result:
Map<Dept, Map<Boolean, List<Employee>>>
```

#### 🟦 Collectors.groupingBy() itself (Nested Grouping)

- Yes, groupingBy can be downstream of groupingBy.

```java
groupingBy(Employee::getDept,
           groupingBy(Employee::getGender))

//Result:
Map<Dept, Map<Gender, List<Employee>>>
```

#### 🟦 Collectors.mapping()

- Used to transform elements before collecting.

```java
groupingBy(Employee::getDept,
           mapping(Employee::getName, toList()))
// Result:
Map<Dept, List<String>>
```

#### 🟦 Collectors.toCollection(Supplier)

```java
groupingBy(Employee::getDept, toCollection(LinkedList::new))
//Result:
Map<Dept, LinkedList<Employee>>
```

#### 🟦

```java

```

#### 🟦

```java

```

#### 🟦

```java

```
