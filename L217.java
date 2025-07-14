// LeetCode Problem 217. Contains Duplicate

import java.util.Arrays;

//Brute Force Approach
class containsDuplicate {
    public boolean mycontainsDuplicate(int[] nums) {
        Arrays.sort(nums); // O(n log n)

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;

    }
}
// Optimized Approach
class Solution {
    static{
        for(int i=0;i<=500;i++)
            containsDuplicate2(new int[]{0, 1, 0});
    }
    public static boolean containsDuplicate2(int[] nums) {
        for(int i = 1; i<nums.length; i++){
            int key = nums[i];
            int j = i - 1;
            while(j>=0 && nums[j] > key){
                nums[j+1] = nums[j];
                j--;
            }
            if(j>=0 && nums[j] == key)
                return true;
            nums[j+1] = key;
        }
        return false;
    }

}
/*
---

1. **Sorting the Array**

   * The array is sorted first using `Arrays.sort(nums)`, which takes **O(n log n)** time.
   * This makes any duplicate elements appear **next to each other**.

2. **Iterate Through the Sorted Array**

   * A loop starts from index 1 and checks each element with its previous one.

3. **Check for Duplicates**

   * If `nums[i] == nums[i - 1]`, it means a **duplicate is found**, so the method returns `true` immediately.

4. **Return Result**

   * If the loop finishes without finding any duplicates, the method returns `false`.

---

 */
