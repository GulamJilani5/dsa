⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ⏺️ Maximum Sum Subarray of Size K

- Given an array, find the maximum sum of any subarray of size K
- Tests fixed window
- Checks if you avoid brute force O(n²)

### ➡️ Two-Phase Sliding Window

```java
    public int maxSumSubarray(int[] arr, int k) {
        int n = arr.length;

        // Edge case
        if (n < k) {
            System.out.println("Subarray size k is larger than array length.");
        }

        // Step 1: Compute sum of first k elements
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        // Step 2: Slide the window
        for (int i = k; i < n; i++) {
            windowSum += arr[i] - arr[i - k]; // add new element, remove old one element: only one addition and one subtraction per step.
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

```

### ➡️ Single Loop Sliding Window

```java
    public static int maxSubarraySumSliding(int[] arr, int k) {
      int windowSum = 0;
      int maxSum = Integer.MIN_VALUE;

      for (int i = 0; i < arr.length; i++) {
        windowSum += arr[i];

        if (i >= k - 1) {
            maxSum = Math.max(maxSum, windowSum);
            windowSum -= arr[i - k + 1];
        }
      }

      return maxSum;

  }
```

### ➡️ Calculating Average

```java
public double findMaxAverageSlidingWindow(int[] nums, int k) {
        int n = nums.length;

        // Compute the sum of the first 'k' elements
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        // Initialize maxSum as the sum of the first window
        int maxSum = windowSum;

        // Slide the window across the array
        for (int i = k; i < n; i++) {
            windowSum += nums[i]; // Add new element entering window
            windowSum -= nums[i - k]; // Remove element leaving window
            maxSum = Math.max(maxSum, windowSum); // Update maxSum
        }

        // Return maximum average
        return (double) maxSum / k;
    }
```

### ➡️ This Method used by Aditya Verma in youtube

```java
    public static void maxSumSubarray() {

        int[] arr = {4, 9, 8, 3, 1, 4, 5};
        int k = 3;
        int sum = 0;
        int max = sum;
        int i = 0;
        int j = 0;

        while(j < arr.length){
          sum = sum + arr[j];

            if(j - i + 1 < k){
                j++;
             }
             else if(j - i + 1 == k){
                max = Math.max(max, sum);

                sum = sum - arr[i];
                i++;
                j++;
             }
        }
        System.out.println("maximum sum subarray of size "+ k + " is: " + max);
    }
```
