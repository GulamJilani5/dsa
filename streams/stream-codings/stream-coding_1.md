⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ➡️ You are given a list of strings that may contain duplicates.

- Your task is to:
  - Remove duplicate strings
  - Sort the unique strings by length in descending order
  - Select the top 2 longest strings
  - Return the result as a comma-separated single string

```java
Input: ["java", "stream", "api", "java", "code"]

output: stream, java

```

```java
List<String> names = Arrays.asList("java", "stream", "api", "java", "code");

String result = names.stream()
                     .distinct()
                     .sorted(Comparator.comparingInt (String::length).reversed())
                     .limit(2)
                     .collect(Collectors.joining(", "));

System.out.printIn(result);

```

# ➡️ Given a string consisting of consecutive repeating characters, compress the string by replacing each group of repeated characters with:

```java
Input: "AAABBACCDDBBA"
Output: A3B2A1C2D2B2A1

```

```java
String input = "AAABBACCDDBBA";

String result = IntStream.range(0, input.length())
        .boxed()
        .filter(i -> i == 0 || input.charAt(i) != input.charAt(i - 1))
        .map(i -> {
            char ch = input.charAt(i);
            long count = IntStream.range(i, input.length())
                    .takeWhile(j -> input.charAt(j) == ch)
                    .count();
            return "" + ch + count;
        })
        .collect(Collectors.joining());

System.out.println(result);
```

# ➡️ Given a list of employees where each employee has:

`empid`, `name` `gender`, `salary`, `department`

- Your task is to:
  - Filter female employees only
  - Group them by department
  - Count the number of female employees in each department
  - Find the department with the maximum number of female employees

```java
  Map.Entry<String, Long> result = employees.stream()
        .filter(emp -> "F".equalsIgnoreCase(emp.getGender()))
        // .filter(emp -> emp.getGender().equalsIgnoreCase(""Female))
        .collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.counting()
        ))
        .entrySet()
        .stream()
        .max(Map.Entry.comparingByValue())
        .orElse(null);

if(result != null){
    System.out.println("Department: " + result.getKey());
    System.out.println("Female Count: " + result.getValue());
}

```
