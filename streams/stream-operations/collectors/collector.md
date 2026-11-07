⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ⏺️ Collectors

- They are neither intermediate or terminal operation.
- They are mostly used inside the terminal operations(e.g: collect()).

### ➡️ Collectors

##### 🟦 1. Basic Collectors

- toList()
- toSet()
- toMap()
- toCollection()

##### 🟦 2. Grouping & Partitioning

- groupingBy()
- groupingByConcurrent()
- partitioningBy()

##### 🟦 3. Transformation Collectors

- mapping()
- flatMapping()
- filtering()

##### 🟦 4. Post-processing Collectors

- collectingAndThen()

##### 🟦 5. Statistical & Numeric Collectors

- counting()
- summingInt()
- summingLong()
- summingDouble()
- averagingInt()
- averagingLong()
- averagingDouble()
- summarizingInt()
- summarizingLong()
- summarizingDouble()

##### 🟦 6. Min & Max Collectors

- maxBy()
- minBy()

##### 🟦 7. String Collector

- joining()

##### 🟦 8. Other Useful Collectors

- reducing()

### ➡️ Downstream Collectors

- A **downstream collector** is simply a **collector** used inside another collector to perform additional operations, So usually they are same.
- All **downstream collectors** are **collectors**, but not all collectors are necessarily downstream collectors.
