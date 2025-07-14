//Leetcode 128. Longest Consecutive Sequence

import java.util.Arrays;

public class L128 {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        Arrays.sort(nums);
        int count = 1, max = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1])
                continue;
            else if (nums[i] == nums[i - 1] + 1)
                count++;
            else {
                max = Math.max(max, count);
                count = 1;
            }
        }
        return Math.max(max, count);
    }
}
/*
 * LeetCode Problem 128. Longest Consecutive Sequence
 * 
 * Given an unsorted array of integers, find the length of the longest
 * consecutive elements sequence.
 * 
 * Your algorithm should run in O(n) complexity.
 * 
 * Example:
 * Input: [100, 4, 200, 1, 3, 2]
 * Output: 4
 * Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
 *

1. **Edge Case & Sorting**

   * If the array is empty, return 0 immediately.
   * Otherwise, sort the array to bring consecutive numbers together.

2. **Initialize Counters**

   * `count` tracks the current streak length.
   * `max` keeps the longest streak found so far. Both start at 1.

3. **Traverse the Array**

   * If the current number is a **duplicate**, skip it.
   * If it's **1 greater than the previous**, increment the streak (`count++`).
   * Else, reset the streak to 1 and update `max` if needed.

4. **Return Final Result**

   * After the loop, return the **maximum** of `max` and `count` to handle cases where the longest streak is at the end.

---

 */
