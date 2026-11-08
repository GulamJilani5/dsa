⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ⏺️ Comparable vs Comparator

## ️➡️ Comparable

Use Comparable when a single natural order makes sense (e.g., **String**, **Integer**, **LocalDate**, or your class manually defines `compareTo`) and implements `class Product implements Comparable<Class>`.

- All **Wrapper Classes**, **String** and **LocalDate** are having inbuilt `compareTo` natural order like simply `sorted()` or `comparator.naturalOrder()`
- for reverse order `.sorted(Comparator.reverseOrder())`

#### ️➡️ Highly Important 🟥🟧

- Learning all of that becomes little confusing so only focusing on **Comparator's** built-in methods would solve my most of the problems.🟢
- Instead of manually writing🔴
  - **compareTo()** of the **Comparable**
  - **compare()** of the **Comparator**
  - **Integer.compare()** / **Double.compare()** of the **Wrapper** classes
- we can use **Comparator's** built-in methods🟢 like **comparing()**, **comparingInt()**, **comparingDouble()**, **reversed()** and **thenComparing()** **thenComparingInt()** etc to solve most sorting requirements in Java Streams.🟥

## ➡️ Comparator

- It is used for the Custom Ordering.

## ️➡️ compareTo() vs compare()

#### 🟦 compareTo()

- Abstract Instance method, Belongs to the object
- Define in **Comparable** interface
- Called like this: `a.compareTo(b)`

```java
// Stream<String>:
.max(String::compareTo) // Method Reference
.max((a, b) -> a.compareTo(b)) // lambda Expression

//Stream<Integer>:
.max(Integer::compareTo) //Method Reference
.max((a, b) -> a.compareTo(b)) //Lambda Expression
```

#### 🟦 compare()

- It is **staic method** in the **All Wrapper Classes** and **Abstract Instance method** in the **Comparator** Interface. 🟥

###### 🔵 **For Wrapper Classes**

```java
Integer.compare(a, b)
Double.compare(a, b)
String.compare(a, b)   // Java 11+ 🔴
```

```java
// Stream<Integer>:
.max(Integer::compare) // Method reference
.max((a, b) -> Integer.compare(a, b)) // lambda Expression

// Stream<String>:  Java 11+
.max(String::compare)                 // method reference
.max((a, b) -> String.compare(a, b))  // lambda
```

###### 🔵 **For Comparator Interfaces**

- Abstract Instance method(single abstract method) belongs to Comparator object.
- It is used in lambda expressions.
