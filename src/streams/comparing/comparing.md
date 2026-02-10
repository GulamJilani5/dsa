⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ️ ➡️ Comparable

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
