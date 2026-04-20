⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ⏺️ Find all permutations of a string "abc"

- A permutation means all possible arrangements of characters.
- For "abc" → total permutations => `3! = 6`

```java
public class PermutationExample {

    public static void permute(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            permute(remaining, ans + ch);
        }
    }

    public static void main(String[] args) {
        permute("abc", "");
    }
}
```
