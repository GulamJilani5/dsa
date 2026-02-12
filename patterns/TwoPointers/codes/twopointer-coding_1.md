⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ⏺️ Placing all the zeros to the end

### ➡️ using while loop

```java

class Main {

    public static void main(String[] args) {

        int[] arr = {0, 2, 1, 0, 3};
        int len = arr.length - 1;

        int i = 0;
        int j = len;

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

### ➡️

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

### ➡️ Using for...loop

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
