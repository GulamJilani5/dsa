⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ⏺️ Placing all the zeros to the end & Pair Sum Zero & Two Sum Pointer

### ➡️ Two Sum Pointer

```java
 public int[] twoSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                return new int[] { left, right }; // 0-based index
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[] { -1, -1 }; // no valid pair found
    }
```

### ➡️ Pair Sum Zero

```java
public static int[] findSumZeroPair(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == 0) {
                return new int[] { arr[left], arr[right] };
            } else if (sum > 0) {
                right--;
            } else {
                left++;
            }
        }

        return null; // No pair found
    }
```

### ➡️ Placing all the zeros to the end

##### 🟦 Method 1

```java

class Main {

    public static void main(String[] args) {

        int[] arr = {0, 2, 1, 0, 3};

        int i = 0;
        int j = arr.length - 1;

        while(i < j){

            if(arr[i] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }
            else{
                i++;
            }
        }


        for(int k = 0; k <= len; k++){
            System.out.print(arr[k]+" ");
        }

    }
}
```

##### 🟦 Method 2

```java

class Main {

    public static void main(String[] args) {

        int[] arr = {0, 2, 1, 0, 3};
        int len = arr.length - 1;

        int i = 0;
        int j = 0;

        while(i < arr.length){

            if(arr[i] != 0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }

           i++;

        }


        for(int k = 0; k <= len; k++){
            System.out.print(arr[k]+" ");
        }

    }
}
```

##### 🟦 Method 3 - Using for...loop

```java

class Main {

    public static void main(String[] args) {

        int[] arr = {0, 2, 1, 0, 3};
        int len = arr.length - 1;

        int j = 0;
        for(int i = 0; i < arr.length; i++){
             if(arr[i] != 0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }

        for(int k = 0; k <= len; k++){
            System.out.print(arr[k]+" ");
        }

    }
}
```
