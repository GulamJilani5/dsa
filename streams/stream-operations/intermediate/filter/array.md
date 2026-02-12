⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ⏺️ ARRAY

## ➡️ Primitive Array (int[])

#### 🟦 Filter even number

```java
int[] nums = {10, 15, 20, 25, 30};

        int[] evenNums = Arrays.stream(nums)
                .filter(n -> n % 2 == 0)
                .toArray();

```

#### 🟦

```java

```

## ➡️ Non-Primitive Array (String[])

#### 🟦 filter strings starting with "j"

```java
String[] words = {"java", "python", "js", "go", "javascript"};

        String[] result = Arrays.stream(words)
                .filter(w -> w.startsWith("j"))
                .toArray(String[]::new);

        System.out.println(Arrays.toString(result));
```

- Method Reference version

```java

```

#### 🟦

```java

```

- Method Reference version
  - Method reference is possible only if you already have a method that returns boolean.

```java
public class Main {

    public static boolean startsWithJ(String s) {
        return s.startsWith("j");
    }

    public static void main(String[] args) {
        String[] words = {"java", "python", "js", "go", "javascript"};

        String[] result = Arrays.stream(words)
                .filter(Main::startsWithJ)   // method reference
                .toArray(String[]::new);

        System.out.println(Arrays.toString(result));
    }
}

```

#### 🟦

```java

```

#### 🟦

```java

```

- Method Reference version

```java

```

## ➡️

#### 🟦

```java

```

- Method Reference version

```java

```

#### 🟦

```java

```

- Method Reference version

```java

```

#### 🟦

```java

```

#### 🟦

```java

```

## ➡️

#### 🟦

```java

```

- Method Reference version

```java

```

#### 🟦

```java

```

#### 🟦

```java

```

#### 🟦

```java

```
