⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ⏺️ Best Time to Buy and Sell Stock

- You can:
  - Buy before selling
  - Buy only once
  - Sell only once

### ➡️ Method 1

```java

  public int maxProfit() {

      int[] prices = {7,1,5,3,6,4};
      int minSoFar = prices[0];
      int ans = 0;


      for(int i = 1; i < prices.length; i++) {

            int profit = prices[i] - minSoFar;

            if (profit > ans) {
                ans = profit;
            }

            minSoFar = Math.min(prices[i], minSoFar);
      }


       System.out.println(ans);

    }
```

### ➡️ Method 2

```java

    public static int maxProfit() {

        int[] prices = {7,1,5,3,6,4};

        int minPrice = Integer.MAX_VALUE;

        int maxProfit = 0;

        for (int price : prices) {

            // Find minimum buying price
            if (price < minPrice) {
                minPrice = price;
            }

            // Calculate profit
            int profit = price - minPrice;

            // Update maximum profit
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        System.out.println(maxProfit);

    }
```
