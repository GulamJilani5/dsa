# ⏺️ Given an integer array, find the contiguous subarray with the maximum sum

```java
Input:  [-2, 1, -3, 4, -1, 2, 1, -5, 4]
Output: 6
Explanation: [4, -1, 2, 1] → sum = 6

```

```java
        int currentSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
```

# ⏺️ Maximum Product subarray

Given an integer array nums, find the contiguous subarray (containing at least one number) that has the maximum product, and return that product

- **Input:**

```java
nums = [2, 3, -2, 4]
```

- **Output:**

```java
6
```

- **Why Is This Problem Tricky?**

  - Because of negative numbers.
  - A negative × negative = positive
  - A large negative product can suddenly become maximum if multiplied by another negative number
  - So unlike maximum sum subarray (Kadane’s Algorithm), we must track two values.

- maxProductSoFar → maximum product ending at this index

minProductSoFar → minimum product ending at this index

```java
        int maxSoFar = nums[0];
        int minSoFar = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int curr = nums[i];

            // If current number is negative, swap max and min
            if (curr < 0) {
                int temp = maxSoFar;
                maxSoFar = minSoFar;
                minSoFar = temp;
            }

            maxSoFar = Math.max(curr, maxSoFar * curr);
            minSoFar = Math.min(curr, minSoFar * curr);

            result = Math.max(result, maxSoFar);
        }

        return result;
```

```java
        int maxSoFar = nums[0];
        int minSoFar = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > = 0) {
                maxSoFar = Math.max(nums[i], maxSoFar * nums[i]);
                minSoFar = Math.min(nums[i], minSoFar * nums[i]);
            }
            else{
                int temp = maxSoFar;
                maxSoFar = minSoFar;
                minSoFar = temp;
            }

          result = Math.max(result, maxSoFar);

        }
```
