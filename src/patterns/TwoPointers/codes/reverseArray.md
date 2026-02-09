⏺️ ➡️ 🟦 🔵🔹🔷 🔵 ☑️ ✔️ 🔴 ⭕ • ‣ → ⁕

# ⏺️ Reverse the Array

```java

class Main {
    public static void main(String[] args) {

       int[] arr = {2, 5, 3, 1, 4};

       int left= 0;
       int right= arr.length - 1;

       while(left < right){
           int temp = arr[left];
          arr[left] = arr[right];
          arr[right] = temp;

          left++;
          right--;
       }

       for(int i = 0; i < arr.length; i++){
           System.out.println(arr[i]);
       }

    }
}
```

# ⏺️ Reverse the String Character

```java

class Main {
    public static void main(String[] args) {
        String str = "dream";

        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        while(left < right){
           char c = charArray[left];
           charArray[left] = charArray[right];
           charArray[right] = c;

           left++;
           right--;
        }

        for(int i = 0; i < charArray.length; i++){
            System.out.println(charArray[i]);
        }
    }
}
```

# ⏺️

```java

```

# ⏺️

```java

```
