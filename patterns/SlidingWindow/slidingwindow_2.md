⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

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
