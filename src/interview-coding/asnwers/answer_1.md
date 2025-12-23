⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ⏺️ Asnwer

## ➡️ Product of Array except self

```java
class Main {
    public static void main(String[] args) {

        int[] input = {1,2,3,4};
        int len = input.length;
        int[] result = new int[len];
        int i =0;
        while(i < len){
             System.out.println("...");
            int mult = 1;
            for (int j = 0; j <= len - 1; j++){
                if(j != i) {
                  mult = mult * input[j];
                }
            }
            result[i] = mult;
            i++;
        }

      for (int j = 0; j <= len - 1; j ++){
        System.out.println("Input Array " +input[j]);
    }
    System.out.println("==================");

    for (int j = 0; j <= len - 1; j ++){
        System.out.println("Output Array " +result[j]);
    }

    }
}
```

## ➡️ Find Unique Value count & print each value.

### 🟦 Unsorted Array

##### 🔵 Using Standard Java

- **Using HashMap**

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] arr = {2, 5, 1, 4, 3, 3, 2};

        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        List<Integer> uniqueList = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueList.add(entry.getKey());
            }
        }

        System.out.println("Unique count: " + uniqueList.size());
        System.out.println("Unique values:");
        uniqueList.forEach(System.out::println);
    }
}

```

- **Output**

```java
  Unique count: 3
  Unique values:
        5
        1
        4
```

- **Two Pointers**
  - It works when array is sorted.

```java
  import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] arr = {2, 5, 1, 4, 3, 3, 2};
        Arrays.sort(arr);   // REQUIRED

        int i = 0;

        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }

        System.out.println("Unique count: " + (i + 1));
        System.out.println("Unique values:");
        for (int k = 0; k <= i; k++) {
            System.out.println(arr[k]);
        }
    }
}

```

- **Using Set**

```java
int[] arr = {2, 5, 1, 4, 3, 3, 2};
// Random Order of the elements
Set<Integer> uniqueValues = new HashSet<>();
// Preserve the insertion order of the elements
Set<Integer> uniqueValues = new LinkedHashSet<>();
// always SORTED (natural ascending order)
Set<Integer> uniqueValues = new TreeSet<>();
for(int num : arr){
    uniqueValues.add(num);
}
// for(int i; i < arr.length; i++){
//  uniqueValues.add(arr[i]);
//}
```

##### 🔵 Using Java Stream

- Using **Set**.

```java
  import java.util.*;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 4, 3, 3, 2};

        // 1. HashSet (default — unordered)
        Set<Integer> hashSet = Arrays.stream(arr)
                                     .boxed()  // int --> Ineteger
                                     .collect(Collectors.toSet());
        System.out.println("HashSet (unordered):");
        hashSet.forEach(el -> System.out.print(el + " "));
        // Possible output: 1 2 3 4 5 (or any random order)

        System.out.println("\n");

        // 2. LinkedHashSet — preserves INSERTION ORDER (first appearance in array)
        Set<Integer> linkedHashSet = Arrays.stream(arr)
                                           .boxed()
                                           .collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println("LinkedHashSet (insertion order):");
        linkedHashSet.forEach(el -> System.out.print(el + " "));
        // Output: 2 5 1 4 3  (exact order of first occurrences)

        System.out.println("\n");

        // 3. TreeSet — always SORTED (natural ascending order)
        Set<Integer> treeSet = Arrays.stream(arr)
                                       .boxed()
                                       .collect(Collectors.toCollection(TreeSet::new));
        System.out.println("TreeSet (sorted):");
        treeSet.forEach(el -> System.out.print(el + " "));
        // Output: 1 2 3 4 5  (always sorted)
    }
}
```

- We can use List.of(values)
  - **List.of(arr)** will not work, because `arr` will not exapnd and consider as one value.
  - **List.of(arr).size()** is 1.
  - boxed is not require for it because elements type is directly be boxed with.

```java
 Set<Integer> hashSet =  List.of(2, 1, 4, 2, 3, 5, 4)
  .stream()
  .collect(Collectors.toList())

// We can use LinkedHashSet and TreeSet as above example
```

### 🟦 Sorted Array

##### 🔵 Using Standard Java

- Two Pointer
  - Check two pointer at `D:\Jilani\learning\dsa\src\patterns\TwoPointers\codes\CountUniqueValues.java`.

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] arr = {2, 5, 1, 4, 3, 3, 2};
        Arrays.sort(arr);   // REQUIRED

        int i = 0;

        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }

        System.out.println("Unique count: " + (i + 1));
        System.out.println("Unique values:");
        for (int k = 0; k <= i; k++) {
            System.out.println(arr[k]);
        }
    }
}

```

- - Using stream will same as for Sorted Array

## ➡️ Find Duplicate Value count & print each value.

### 🟦 Unsorted Array

##### 🔵 Using Standard Java

```java
  import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] arr = {2, 5, 1, 4, 3, 3, 2};

        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        List<Integer> duplicateList = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > 1) {
                duplicateList.add(entry.getKey());
            }
        }

        System.out.println("Duplicate count: " + duplicateList.size());
        System.out.println("Duplicate values:");
        duplicateList.forEach(System.out::println);
    }
}

```

##### 🔵 Using Stream

```java
 import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {

        int[] arr = {2, 5, 1, 4, 3, 3, 2};

        List<Integer> uniqueValues =
            Arrays.stream(arr)
                  .boxed()
                  .collect(Collectors.groupingBy(
                      n -> n,
                      Collectors.counting()
                  ))
                  .entrySet()
                  .stream()
                  .filter(e -> e.getValue() == 1)
                  .map(Map.Entry::getKey)
                  .toList();

        System.out.println("Unique count: " + uniqueValues.size());
        System.out.println("Unique values:");
        uniqueValues.forEach(System.out::println);
    }
}

```

### 🟦 Sorted Array

##### 🔵 Using Standard Java

- Using Two Pointer

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] arr = {2, 5, 1, 4, 3, 3, 2};
        Arrays.sort(arr);   // REQUIRED

        int duplicateCount = 0;

        System.out.println("Duplicate values:");

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {

                // print only once per duplicate group
                if (i == 1 || arr[i] != arr[i - 2]) {
                    System.out.println(arr[i]);
                    duplicateCount++;
                }
            }
        }

        System.out.println("Duplicate count: " + duplicateCount);
    }
}

```

- Using stream will same as fro Sorted Array
