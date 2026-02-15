⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ⏺️ Collectors.collectingAndThen(downstreamCollector, finisherFunction)

- collector wrapper
  - First collect elements using some collector
  - THEN apply a finishing function on the collected result
    - finisher function will transform the final collected result into something else
- 🔴 Can we inside `.collect()` or as a downstream collector inside `groupingBy()` etc...

## ➡️ Why was collectingAndThen introduced?

- Java wanted to solve this exact problem: `"Collect the stream, but after collecting, I want to modify the result."`
- **Example:**
  - Collect list and make it immutable
  - Collect set and convert into sorted list
  - Collect counting result and convert to int
  - Collect Optional and unwrap safely
  - Collect list and return its size
  - Collect max/min and return default value
- So it provides **post-processing** after collection.

## ➡️ collectingAndThen takes exactly two argument

`Collectors.collectingAndThen(downstreamCollector, finisherFunction)`

- **return types**
  - Downstream returns R
  - Finisher converts R → RR
  - Final collectingAndThen() returns RR

### 🟦 downstreamCollector

- Find `D:\Jilani\learning\dsa\streams\stream-operations\collectors\downstreamcollector.md`

### 🟦 finisher Function

- Function<R, RR>
  - This takes the downstream collector result (R) and converts it into another result (RR).
- Example finisher functions:
  - Collections::unmodifiableList
  - List::size
  - Optional::get
  - opt -> opt.orElse(defaultValue)
  - map -> new TreeMap<>(map)
  - set -> set.stream().sorted().toList()

  #### Example

  ```java
  Collector<String, ?, Integer> c2 =
    Collectors.collectingAndThen(
        Collectors.toList(),
        List::size
    );
  ```

- downstream returns `List<String> (R)`
- finisher converts `List<String> -> Integer (RR)`
- so `collectingAndThen` returns a Collector that produces Integer
