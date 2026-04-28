⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ⏺️ String nth unique and duplicate character in a string

### ➡️ Find 1st, 2nd and 3rd Unique character in a string

```java
public static Character findNthUnique(String str, int n) {
    Map<Character, Integer> map = new LinkedHashMap<>();

    for (char c : str.toCharArray()) {
        map.put(c, map.getOrDefault(c, 0) + 1);
    }

    int count = 0;

    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        if (entry.getValue() == 1) {
            count++;
            if (count == n) return entry.getKey();
        }
    }

    return null;
}
```

```java
findNthUnique("swiss", 1); // // w
```

### ➡️ Find 1st, 2nd and 3rd Unique character in a string

```java
public static Character findNthRepeating(String str, int n) {
    Map<Character, Integer> map = new LinkedHashMap<>();

    for (char c : str.toCharArray()) {
        map.put(c, map.getOrDefault(c, 0) + 1);
    }

    int count = 0;

    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        if (entry.getValue() > 1) {
            count++;
            if (count == n) return entry.getKey();
        }
    }

    return null;
}
```

```java
findNthRepeating("swiss", 1);  // s
```
