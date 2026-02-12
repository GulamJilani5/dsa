⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ⏺️ Converting Array to Stream

## ➡️ Object Array → Stream

### 🟦

```java
String[] arr = {"Java", "Python", "C"};

Stream<String> stream = Arrays.stream(arr);

```

```java
Stream<String> stream = Stream.of(arr);

```

## ➡️ Primitive Array → Stream

### 🟦 int, long and double

```java
int[] arr = {10, 20, 30};

IntStream/LongStream/DoubleStream stream = Arrays.stream(arr);

```

### 🟦 Convert Array Stream to List

```java
String[] arr = {"A", "B", "C"};
List<String> list = Arrays.stream(arr).toList();
// If using Java 8
List<String> list = Arrays.stream(arr).collect(Collectors.toList());
```

### 🟦 Convert stream to sum

```java
int sum = Arrays.stream(arr).sum();
System.out.println(sum);

```

### 🟦 Return max/min

```java
int result = Arrays.stream(arr).max().orElse(-1);

```

## ➡️ Convert stream to array

```java
int[] newArr = Arrays.stream(arr).toArray();

```

## ➡️ Convert array to stream then List<Integer>

```java
List<Integer> list = Arrays.stream(arr)
                           .boxed()
                           .collect(Collectors.toList());

```
