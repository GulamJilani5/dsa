⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ⏺️ Maximum Product Subarray

- Maximum Product Subarray problem mainly belongs to the:
  - Dynamic Programming (DP) pattern
  - More specifically: Kadane’s Algorithm variation

### ➡️ Method 1

- This method used in the Udemy course and little easier to understand

- At every index, we track:
  - maxProduct → maximum product ending at current index
  - minProduct → minimum product ending at current index

```java
public int maxProduct() {

        int nums[] = {2, 3, -2, 4};

        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxProduct = nums[0];
        int minProduct = nums[0];

        int result = nums[0];

        for(int i = 1; i < nums.length; i++) {

            if (nums[i] >= 0) {
                maxProduct = Math.max(nums[i], maxProduct * nums[i]);
                minProduct = Math.min(nums[i], minProduct * nums[i]);
            }
            else {
                int temp = maxProduct;
                maxProduct = Math.max(nums[i], minProduct * nums[i]);
                minProduct = Math.min(nums[i], temp * nums[i]);
            }

            result = Math.max(result, maxProduct);
        }

        System.out.println(result);
    }

```

### ➡️ Method 2

```java
public int maxProduct(int[] nums) {

    int currMax = nums[0];
    int currMin = nums[0];
    int result = nums[0];

    for (int i = 1; i < nums.length; i++) {

        int num = nums[i];

        int tempMax = currMax;

        currMax = Math.max(num,
                    Math.max(num * currMax, num * currMin));

        currMin = Math.min(num,
                    Math.min(num * tempMax, num * currMin));

        result = Math.max(result, currMax);
    }

    return result;
}
```
