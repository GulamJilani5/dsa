⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ⏺️ Converting Values to Collection(List) then Stream

## ➡️ List.of() (java9+)

- completely immutable
- can throws `NullPointerException`

```java
Stream<Integer> stream = List.of(10, 20, 30).stream();

```

## ➡️ Arrays.asList

- fixed size list backed by array
- We can update element but can not add or remove

```java
List<Integer> list = Arrays.asList(10, 20, 30);

Stream<Integer> stream = list.stream();

```
