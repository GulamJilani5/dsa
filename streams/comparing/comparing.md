⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ️➡️ Comparable

Use Comparable when a single natural order makes sense (e.g., **String**, **Integer**, **LocalDate**, or your class manually defines `compareTo`) or implements `class Product implements Comparable<Class>`.

- **Integer**, **Double**, **Long**, **String** and **LocalDate** are having inbuilt `compareTo` - natural order like simply `sorted()` or `comparator.naturalOrder()`
- for reverse order `.sorted(Comparator.reverseOrder())`

# ➡️ Comparator

Use Comparator when you need:

- Derived keys (`comparingInt`, `comparingDouble`, `comparing`)
- Multiple fields (`thenComparing()`)
- Reverse of your custom rule (`.reversed()`)
- Descending natural order (`Comparator.reverseOrder()`)
- Null-safe order (nullsFirst/Last)
- Custom logic (lambdas)

# ️➡️ compareTo() vs compare()

### 🟦 compareTo()

- Instance method, Belongs to the object
- Comes from Comparable interface
- Called like this: `a.compareTo(b)`

```java
// Stream<String>:
.max(String::compareTo) // Method Reference
.max((a, b) -> a.compareTo(b)) // lambda Expression

//Stream<Integer>:
.max(Integer::compareTo) //Method Reference
.max((a, b) -> a.compareTo(b)) //Lambda Expression
```

### 🟦 compare()

- Static method, Belongs to the class
- Called like this:

```java
Integer.compare(a, b)
Double.compare(a, b)
String.compare(a, b)   // Java 11+
```

```java
// Stream<Integer>:
.max(Integer::compare) // Method reference
.max((a, b) -> Integer.compare(a, b)) // lambda Expression


// Stream<String>:  Java 11+
.max(String::compare)                 // method reference
.max((a, b) -> String.compare(a, b))  // lambda

```
