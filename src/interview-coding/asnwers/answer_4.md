⏺️ ➡️ 🟦 🔵 🟢 🔴 ⭕ 🟠 🟣 🟥 🟧 ✔️ ☑️ • ‣ → ⁕

# ⏺️ Asnwer

## ➡️ Product of Array except self

```java
class Main {
    public static void main(String[] args) {

        int[] input = {1,2,3,4};
        int len = input.length;
        int[] result = new int[len];
        int i =0;
        while(i < len){
             System.out.println("...");
            int mult = 1;
            for (int j = 0; j <= len - 1; j++){
                if(j != i) {
                  mult = mult * input[j];
                }
            }
            result[i] = mult;
            i++;
        }

      for (int j = 0; j <= len - 1; j ++){
        System.out.println("Input Array " +input[j]);
    }
    System.out.println("==================");

    for (int j = 0; j <= len - 1; j ++){
        System.out.println("Output Array " +result[j]);
    }

    }
}
```

## ➡️ Find Missing Number

```java
class Main {
    public static void main(String[] args) {

        int[] arr = {3, 1, 6, 4, 2};
        int missingValue = findMissingInt(arr);
        System.out.println("missing value is: " + missingValue);
    }

    public static int findMissingInt(int[] arr){
        int len = arr.length + 1;
        /// Sum of the array from 1 to n
        // Way 1
        // int totalSum = 0;
        // for(int i = 1; i <= len; i++){
        //     totalSum += i;
        // }
        ///Way 2
        int totalSum = len * (len + 1) / 2;
        System.out.println("total Sum: " + totalSum);

        int currentArraytotalSum = 0;
        for(int i = 0; i < len - 1; i++){
            currentArraytotalSum += arr[i];
        }
       System.out.println("current array total Sum: " + currentArraytotalSum);

        return totalSum - currentArraytotalSum;
    }
}
```
