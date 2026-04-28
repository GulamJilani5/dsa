⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

⏺️ Frequency count in Array

### ➡️ Most Common

##### 🟦 Find 1st, 2nd and 3rd Unique element in an array

```java
public static Integer findNthUnique(int[] arr, int n) {
    Map<Integer, Integer> map = new LinkedHashMap<>();

    for (int num : arr) {
        map.put(num, map.getOrDefault(num, 0) + 1);
    }

    int count = 0;

    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        if (entry.getValue() == 1) {
            count++;
            if (count == n) return entry.getKey();
        }
    }

    return null;
}
```

- **Input**

```java
int[] arr = {4, 5, 6, 4, 7, 5, 8};

findNthUnique(arr, 1); // 6
findNthUnique(arr, 2); // 7
findNthUnique(arr, 3); // 8
```

##### 🟦 Find 1st, 2nd and 3rd Duplicate / Repeating element in an array

```java
public static Integer findNthRepeating(int[] arr, int n) {
    Map<Integer, Integer> map = new LinkedHashMap<>();

    for (int num : arr) {
        map.put(num, map.getOrDefault(num, 0) + 1);
    }

    int count = 0;

    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        if (entry.getValue() > 1) {
            count++;
            if (count == n) return entry.getKey();
        }
    }

    return null;
}
```

- **Input**

```java
int[] arr = {4, 5, 6, 4, 7, 5, 8, 6};

findNthRepeating(arr, 1); // 4
findNthRepeating(arr, 2); // 5
findNthRepeating(arr, 3); // 6
```
