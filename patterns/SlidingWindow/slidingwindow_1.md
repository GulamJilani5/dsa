⏺️ ➡️ 🟦 🔵 🟢🔴⭕🟠🟣🟥🟧✔️ ☑️ • ‣ → ⁕

# ⏺️ Maximum Sum Subarray of Size K

- Given an array, find the maximum sum of any subarray of size K
- Tests fixed window
- Checks if you avoid brute force O(n²)

### ➡️ Two-Phase Sliding Window

```java
    public int maxSumSubarray(int[] arr, int k) {
        int n = arr.length;

        // Edge case
        if (n < k) {
            System.out.println("Subarray size k is larger than array length.");
        }

        // Step 1: Compute sum of first k elements
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        // Step 2: Slide the window
        for (int i = k; i < n; i++) {
            windowSum += arr[i] - arr[i - k]; // add new element, remove old one element: only one addition and one
                                              // subtraction per step.
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

```

### ➡️ Single Loop Sliding Window

```java
    public static int maxSubarraySumSliding(int[] arr, int k) {
      int windowSum = 0;
      int maxSum = Integer.MIN_VALUE;

      for (int i = 0; i < arr.length; i++) {
        windowSum += arr[i];

        if (i >= k - 1) {
            maxSum = Math.max(maxSum, windowSum);
            windowSum -= arr[i - k + 1];
        }
      }

      return maxSum;

  }
```

```java
public double findMaxAverageSlidingWindow(int[] nums, int k) {
        int n = nums.length;

        // Compute the sum of the first 'k' elements
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        // Initialize maxSum as the sum of the first window
        int maxSum = windowSum;

        // Slide the window across the array
        for (int i = k; i < n; i++) {
            windowSum += nums[i]; // Add new element entering window
            windowSum -= nums[i - k]; // Remove element leaving window
            maxSum = Math.max(maxSum, windowSum); // Update maxSum
        }

        // Return maximum average
        return (double) maxSum / k;
    }
```

# ⏺️ Length of Longest Substring Without Repeating Characters

### ➡️ Using HashSet

- Tests variable window + HashSet/Map
- UNDERSTANDING FLOW

```text
1. Expand window (right++)
2. Check if current character is already in set:
    - if YES:
        → remove s[left] from set
        → left++ (shrink window)
        → repeat until duplicate removed

3. Add current character to set

4. Update max length (right - left + 1)
```

```java

    public int lengthOfLongestSubstring() {
        String str = "abcbbd";
        int n = str.length();
        HashSet<Character> seen = new HashSet<>(); // Store characters in the current window
        int maxLength = 0;
        int left = 0;

        // Expand window by moving 'right'
        for (int right = 0; right < n; right++) {
            // If a duplicate is found, shrink the window from the left
            while (seen.contains(str.charAt(right))) {
                seen.remove(str.charAt(left));
                left++;
            }

            // Add current character to window and update max length
            seen.add(str.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

```

### ➡️ Using HashMap

- UNDERSTANDING FLOW

```text
1. Expand window (right++)
2. Check if current character already exists in map:
    - if YES:
        → move left = Math.max(left, lastIndex + 1)

3. Update map with current character's latest index

4. Update max length (right - left + 1)
```

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char current = s.charAt(right);

            // If duplicate found, move left pointer
            if (map.containsKey(current)) {
                left = Math.max(left, map.get(current) + 1);
                // map.get(current)  - will be the repeated values index(already exist values index)
                // So move the left counter to the one index ahead of the already exist value.
            }

            // Update latest index of character
            map.put(current, right);

            // Calculate max length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
```

### ➡️ Using ASCII character frequency array

- Input: `"abcabcbb"`
- Output: `3`
- **Explanation:** Longest substring without repeating characters is "abc"

```java
    public int lengthOfLongestSubstringSlidingWindow_method2(String s) {
        int n = s.length();
        int[] freq = new int[128]; // ASCII character frequency array
        int maxLength = 0;
        int left = 0;

        // Expand window by moving 'right'
        for (int right = 0; right < n; right++) {
            char currentChar = s.charAt(right);
            freq[currentChar]++; // Increase frequency of the current character

            // If there is a duplicate, shrink the window from the left
            while (freq[currentChar] > 1) {
                freq[s.charAt(left)]--; // Remove character at left pointer
                left++; // Shrink window
            }

            // Update maximum window size
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
```

# ⏺️ Longest Substring with K Distinct Characters

- Find longest substring containing at most K distinct characters
- Tests HashMap frequency + window shrink logic
- Flow

```text
1. Expand window (right++)
2. Add current character to map (increase frequency)

3. While distinct characters > k:
    - take left character
    - decrease its frequency
    - if frequency becomes 0 → remove from map
    - move left++ (shrink window)

4. Update max length (right - left + 1)
```

```java
public int longestKDistinct(String s, int k) {
    Map<Character, Integer> map = new HashMap<>();
    int left = 0, max = 0;

    for (int right = 0; right < s.length(); right++) {
        map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);

        while (map.size() > k) {
            char ch = s.charAt(left);
            map.put(ch, map.get(ch) - 1);
            if (map.get(ch) == 0) map.remove(ch);
            left++;
        }

        max = Math.max(max, right - left + 1);
    }

    return max;
}
```

# ⏺️ Minimum Window Substring

- Find the smallest substring of s that contains all characters of t
- Hard level 🔴
- Tests deep understanding of sliding window

```java
public String minWindow(String s, String t) {
    Map<Character, Integer> map = new HashMap<>();
    for (char c : t.toCharArray())
        map.put(c, map.getOrDefault(c, 0) + 1);

    int left = 0, count = map.size();
    int minLen = Integer.MAX_VALUE, start = 0;

    for (int right = 0; right < s.length(); right++) {
        char ch = s.charAt(right);
        if (map.containsKey(ch)) {
            map.put(ch, map.get(ch) - 1);
            if (map.get(ch) == 0) count--;
        }

        while (count == 0) {
            if (right - left + 1 < minLen) {
                minLen = right - left + 1;
                start = left;
            }

            char leftChar = s.charAt(left);
            if (map.containsKey(leftChar)) {
                map.put(leftChar, map.get(leftChar) + 1);
                if (map.get(leftChar) > 0) count++;
            }
            left++;
        }
    }

    return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
}
```

# ⏺️ Count Occurrences of Anagrams

### ➡️ Using HashMap

```java
public static int countAnagrams() {
    String s = "abcab";
    String p = "ab";

    Map<Character, Integer> map = new HashMap<>();

    // Step 1: build frequency map
    for (char c : p.toCharArray()) {
        map.put(c, map.getOrDefault(c, 0) + 1);
    }

    int left = 0, right = 0;
    int count = p.length();
    int result = 0;

    while (right < s.length()) {
        char ch = s.charAt(right);

        // TAKE (right)
        if (map.containsKey(ch)) {
            if (map.get(ch) > 0) count--;
            map.put(ch, map.get(ch) - 1);
        }

        right++;

        // MATCH
        if (count == 0) result++;

        // REMOVE (left)
        if (right - left == p.length()) {
            char leftChar = s.charAt(left);

            if (map.containsKey(leftChar)) {
                if (map.get(leftChar) >= 0) count++;
                map.put(leftChar, map.get(leftChar) + 1);
            }

            left++;
        }
    }

    return result;
}
```

### ➡️ Using Character Counting through Hashing

- c(character) - 'a'

```
'a' → ASCII 97 → index 0
'b' → ASCII 98 → index 1
'c' → ASCII 99 → index 2
```

- p = "aab"

```
freq:
a → 2
b → 1
others(rest of the character) → 0
```

- Count how many substrings of string s are anagrams of string p
- Tests frequency array + fixed window
- Common in service-based companies

```java
public int countAnagrams(String s, String p) {
    int[] freq = new int[26];

    for (char c : p.toCharArray()) freq[c - 'a']++;

    int left = 0, right = 0, count = p.length(), result = 0;

    while (right < s.length()) {
        if (freq[s.charAt(right++) - 'a']-- > 0) count--;

        if (count == 0) result++;

        if (right - left == p.length() && freq[s.charAt(left++) - 'a']++ >= 0) {
            count++;
        }
    }

    return result;
}
```
