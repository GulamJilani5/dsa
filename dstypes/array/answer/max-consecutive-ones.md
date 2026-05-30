⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ⏺️ Max Consecutive 1's

- It is very much similar to maximum sum subarray(Kadan's algorithm)
- It is an special case of maximum sum subarray

### ➡️ Method 1

```java
public int findMaxConsecutiveOnes() {
        int[] nums = {1, 1, 0, 1, 1, 1};

        int ans = 0;
        int count = 0;

        for(int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count = 0;
            }
            else {
                count++;
            }
            if (count > ans) {
                ans = count;
            }
        }

        System.out.println(ans);
    }
```

### ➡️ Method 2

```java
 public static int findMaxConsecutiveOnes() {

        int[] nums = {1, 1, 0, 1, 1, 1};

        int count = 0;
        int max = 0;

        for (int num : nums) {

            if (num == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }

        System.out.println(max);

    }
```
