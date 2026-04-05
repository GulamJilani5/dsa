⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ⏺️ Remove duplicates & Count Unique Values from an array

### ➡️ Remove duplicates

##### 🟦 Using While Loop

```java
public void removeDuplicatesMethod(int[] arr){
    if (arr.length == 0) {
        System.out.println("Array is empty.");
        return;
    }

    int i = 0;
    int j = 1;

    while (j < arr.length) {
        if (arr[j] != arr[i]) {
           i++;
           arr[i] = arr[j];
        }

        j++;

    }

    System.out.print("Unique elements: ");

    for (int k = 0; k <= i; k++) {
        System.out.println(arr[k] + " ");
    }

}
```

##### 🟦 Using For Loop

```java
    public void removeDuplicatesMethod(int[] arr) {

        int i = 0;

        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        System.out.println("Unique Elements: ");
        for (int k = 0; k < i; k++) {
            System.out.println(arr[k]);
        }

    }

```

### ➡️ Count Unique Values

##### 🟦 Using While Loop

```java
public int countUniqueElement(int[] arr) {
      if (arr.length == 0) return 0;

      int left = 0;
      int next = left + 1;

      while (next < arr.length) {
         if (arr[left] == arr[next]) {
            next++;
         } else {
            left++;
            arr[left] = arr[next]; // overwrite the duplicate position
            next++;
         }

      }

      return left + 1; // total count of unique values

      }
```

##### 🟦 Using For Loop

```java
   public int countUniqueElement(int[] arr) {
        if (arr.length == 0)
            return 0;

        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j]; // overwrite to group unique values at the beginning
            }
        }

     return i + 1; // number of unique values
 }
```
