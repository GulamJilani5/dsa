⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

⏺️ Reverse / Rotate an Array k times to the Right

- **Logic (3 Reversals)** - (time - O(n), space - O(1))
  - Reverse entire array
  - Reverse first k elements
  - Reverse remaining n-k elements

```java
 Input:  arr = [1, 2, 3, 4, 5, 6, 7]
k = 3

Output: [5, 6, 7, 1, 2, 3, 4]

```

- **Step-by-Step Visualization**

```java
Original:   [1, 2, 3, 4, 5, 6, 7]
Reverse all → [7, 6, 5, 4, 3, 2, 1]
Reverse k   → [5, 6, 7, 4, 3, 2, 1]
Reverse rest (n-k) → [5, 6, 7, 1, 2, 3, 4]

```

```java

    public static void rotateRight(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // handle k > n
        reverse(arr, 0, n - 1);     // Step 1
        reverse(arr, 0, k - 1);     // Step 2
        reverse(arr, k, n - 1);     // Step 3
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }


```
