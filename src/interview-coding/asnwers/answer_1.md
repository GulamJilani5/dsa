⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ⏺️ Asnwer

### ➡️ Product of Array except self

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
