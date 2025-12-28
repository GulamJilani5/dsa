🔵🟢🔴➡️⭕🟠🟦🟣🟥🟧✔️⏺️ ☑️ • ‣ → ⁕

# ⏺️ Best time to buy and sell stock

- You are given an integer array prices where prices[i] represents the price of a stock on day i.
- You are allowed to buy one stock and sell it later.
- You must buy before you sell.
- You can complete only one transaction.
- Return the maximum profit you can achieve.
- If no profit is possible, return 0

- **input**

```java
int[] prices = {7, 1, 5, 3, 2, 6, 4};

```

- **Output**
- 6 -1 = 5

```java
 5
```

```java
        int minSoFar = prices[0]; // minimum buying price
        int maxProfit = 0;        // maximum profit

        for (int i = 1; i < prices.length; i++) {

            // Profit if we sell on day i
            int profit = prices[i] - minSoFar;

            // Update max profit
            if (profit > maxProfit) {
                maxProfit = profit;
            }

            // Update minimum price so far
            // minSoFar = Math.min(prices[i], minSoFar);
            if (prices[i] < minSoFar) {
                minSoFar = prices[i];
            }
        }

        System.out.println("Maximum Profit: " + maxProfit);
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
