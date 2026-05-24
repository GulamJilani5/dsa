⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ⏺️ Kadan's Algorithm

- If Array elements are only positive values then maximum sum array is the sum of the array.

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

# ⏺️ Greedy Algorithm(Greedy + Running Minimum) - Best Time to Buy and Sell Stock

### ➡️ Method 1

```java
int[] prices = {7,1,5,3,6,4};

int minPrice = prices[0];
int maxProfit = 0;

for(int i = 1; i < prices.length; i++) {

    int profit = prices[i] - minPrice;

    // maxProfit = Math.max(maxProfit, profit);
    if(profit > maxProfit){
        maxProfit = profit;
    }

    // minPrice = Math.min(minPrice, prices[i]);
    if(prices[i] < minPrice>){
        minPrice = prices[i];
    }

}

System.out.println(maxProfit); // 5

```

### ➡️ Method 2

```java
int[] prices = {7,1,5,3,6,4};

int minPrice = prices[0];
int maxProfit = 0;

for(int i = 1; i < prices.length; i++) {

    int profit = prices[i] - minPrice;

    minPrice = Math.min(minPrice, prices[i]);

    maxProfit = Math.max(maxProfit, profit);

}

System.out.println(maxProfit); // 5
```
