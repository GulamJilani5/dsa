⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ⏺️ Map to stream conversion

- Map itself is not a Stream, but you can convert its entrySet / keySet / values into a stream.

## ➡️ Stream of Map Entries

- stream of key-value pairs
- `map.entrySet()` returns key & value of the set.

```java
Map<Integer, String> map = new HashMap<>();
map.put(1, "Java");
map.put(2, "Spring");
map.put(3, "React");

map.entrySet().stream()
   .forEach(System.out::println);
```

- output

```
1=Java
2=Spring
3=React

```

## ➡️ Stream of Keys

```java
map.keySet().stream()
   .forEach(System.out::println);

```

## ➡️ Stream of Values

```java
map.values().stream()
   .forEach(System.out::println);

```
