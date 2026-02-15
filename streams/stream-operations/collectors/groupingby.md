⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ⏺️ Collectors.groupingBy()

### 🟦 downstreamCollector

- Find `D:\Jilani\learning\dsa\streams\stream-operations\collectors\downstreamcollector.md`

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
