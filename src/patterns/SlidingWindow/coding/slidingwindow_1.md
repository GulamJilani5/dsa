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

# ⏺️ Given a binary array (containing only 0s and 1s), find the maximum number of consecutive 1s in the array.

```java
  Input:  [1,0,1,1,1,1,1,1,1,0,1,1,1,1]
  Output: 8
```

- Running Count Pattern
- Single Pass / Linear Scan
  - You maintain a current window size (count)
  - Reset the window when condition breaks (0)
  - Track the maximum window size (result)

```java
        int[] arr = {1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1};
        int result = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++){
            if(arr[i] == 1) {
                count++;
            //  System.out.println(count);
            }
            else{
               count = 0;
            }

           result = Math.max(count, result);
            //    if(count > result){
            //     result = count;
            //    }

        }

        System.out.println("Maximum 1's are: " + result);

```
