⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ⏺️ map()

- `map()` is used to transform each element of a stream into another form.
- map() always returns a Stream of transformed elements.

##### Ways to write map()

- Method Reference

```java
stream.map(ClassName::methodName)
```

- lambda expression

```java
stream.map(element -> transformedElement)
```

### ➡️ Types of map in Streams

| Method          | Input Stream | Output Stream   |
| --------------- | ------------ | --------------- |
| `map()`         | Stream<T>    | Stream<R>       |
| `mapToInt()`    | Stream<T>    | IntStream       |
| `mapToLong()`   | Stream<T>    | LongStream      |
| `mapToDouble()` | Stream<T>    | DoubleStream    |
| `boxed()`       | IntStream    | Stream<Integer> |
