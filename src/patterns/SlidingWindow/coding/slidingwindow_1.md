🔵🟢🔴➡️⭕🟠🟦🟣🟥🟧✔️⏺️ ☑️ • ‣ → ⁕

# ⏺️

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
