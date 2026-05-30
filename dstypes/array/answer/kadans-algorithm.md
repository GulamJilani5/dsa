⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ⏺️ Kadan's Algorithm || Maximum sum subarray

- If Array elements are only positive values then maximum sum array is the sum of the array.
- We can use this approach to solve the maximum consecutive 1's in an array.

### ➡️ Method 1

```java
int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

int maxSum = arr[0];
int currentSum = arr[0];

for(int i = 1; i < arr.length; i++) {
    currentSum = Math.max(arr[i], currentSum + arr[i]);
    maxSum = Math.max(maxSum, currentSum);
}
System.out.println(maxSum); // 6
```

### ➡️ Method 2

```java
int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

int maxSum = arr[0];
int currentSum = 0;

for(int i = 0; i < arr.length; i++) {

    if(currentSum < 0)
        currentSum = 0;

    currentSum = currentSum + arr[i];

    // maxSum = Math.max(maxSum, currentSum);
    if(currentSum > maxSum){
        maxSum = currentSum;
    }
}

System.out.println(maxSum);
```
