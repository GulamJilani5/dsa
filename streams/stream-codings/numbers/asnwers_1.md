⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ⏺️ Manipulating integer elements to find unique vlaues, duplicate values and find the distinct

- Input

```java
int[] arr = {1, 2, 3, 2, 4, 5, 5, 5, 6};
```

- Why boxed()🔴
  - `Arrays.stream(arr)` → gives IntStream (primitive)
  - So we need `.boxed()` to convert → Stream<Integer>
  - If we have List<Integer> instead of int array then `boxed()` is not required.
- classifier - `Function.identity()` is same as `x -> x`🔴

### ➡️ Unique elements (occur only once) + count

##### 🟦 Using Stream

```java
Map<Integer, Long> freqMap =
        Arrays.stream(arr)
              .boxed()
              .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

List<Integer> uniqueElements =
        freqMap.entrySet().stream()
               .filter(e -> e.getValue() == 1)
               .map(Map.Entry::getKey)
               .toList();

long uniqueCount = uniqueElements.size();

System.out.println("Unique Elements: " + uniqueElements);
System.out.println("Count: " + uniqueCount);
```

```java
Map<Integer, Long> freqMap =
        Arrays.stream(arr)
              .boxed()
              .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
              .entrySet()
              .stream()
              .filter(e -> e.getValue() == 1)
              .map(Map.Entry::getKey)
              .toList();

long uniqueCount = uniqueElements.size();

System.out.println("Unique Elements: " + uniqueElements);
System.out.println("Count: " + uniqueCount);
```

- Output

```text
Duplicate Elements: [1, 2, 5]
Count: 3
```

##### 🟦 Using HashMap()

```java
import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");

        int[] intArr = {1, 4, 2, 2, 7, 4, 7, 3, 4, 5};

        Map<Integer, Long> map = new HashMap<>();

        // Way 1 : Count frequency
        for(int i =0; i < intArr.length; i++){
            map.put(intArr[i], map.getOrDefault(intArr[i], 0l) + 1l);
        }
        /**
        // Way 2: Count frequency
        for(int num : intArr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        **/

        // Step 2: Find elements with frequency = 1
        for(Map.Entry<Integer, Long> entry : map.entrySet()){
            if(entry.getValue() == 1l){
                System.out.println(entry.getKey());
            }
        }


    }
}
```

### ➡️ Duplicate elements (occur >1) + count

```java
List<Integer> duplicateElements =
        freqMap.entrySet().stream()
               .filter(e -> e.getValue() > 1)
               .map(Map.Entry::getKey)
               .toList();

long duplicateCount = duplicateElements.size();

System.out.println("Duplicate Elements: " + duplicateElements);
System.out.println("Count: " + duplicateCount);
```

- Output

```text
Duplicate Elements: [2, 5]
Count: 2
```

### ➡️ Remove multiple occurrences → keep only ONE of each element

##### 🟦 Using Stream

- (Equivalent to DISTINCT)

```java
List<Integer> distinctElements =
        Arrays.stream(arr)
              .boxed()
              .distinct()
              .toList();

System.out.println("Distinct Elements: " + distinctElements);
```

- Output

```text
Distinct Elements: [1, 2, 3, 4, 5, 6]
```

##### 🟦 Using Set

```java
import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");

        int[] intArr = {1, 4, 2, 2, 7, 4, 7, 3, 4, 5};

        Set<Integer> set = new HashSet<>();

        for(int i =0; i < intArr.length; i++){
            set.add(intArr[i]);
        }

        for(Integer num : set){
            System.out.println(num);
        }

    }
}
```
