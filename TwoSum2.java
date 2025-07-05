// LeetCode Problem 167. Two Sum II - Input Array Is Sorted
public class TwoSum2 {
    public int[] twoSum(int[] numbers, int target) {
        int[] arr = new int[2];
        int ptr1=0,ptr2 = numbers.length-1;
        while(ptr1<ptr2){
            if(numbers[ptr1]+numbers[ptr2] == target){
                arr[0] = ptr1+1;
                arr[1] = ptr2+1;
                return arr;
            }else if(numbers[ptr1]+numbers[ptr2]<target){
                ptr1++;
            }else{
                ptr2--;
            }
        }
        return arr;
    }
}

/*
---

### 1. **Problem Type:**

* The array `numbers` is **sorted in non-decreasing order**.
* You need to find **two indices** such that `numbers[i] + numbers[j] == target`.
* Indices must be returned **1-based** (not 0-based).

---

### 2. **Approach Used: Two-Pointer Technique**

* Initialize two pointers:

  * `ptr1` at the **start** of the array
  * `ptr2` at the **end**
* Move pointers inward depending on the sum:

  * If sum is too small → move `ptr1` right.
  * If sum is too big → move `ptr2` left.
  * If sum matches target → return indices.

---

### 3. **Why This Works:**

* The array is **sorted**, so increasing or decreasing pointers adjusts the sum intelligently.
* It avoids unnecessary nested loops, achieving **O(n)** time complexity.

---

### 4. **Output Handling:**

* Returns the 1-based indices in an array.
* If no valid pair exists (though problem guarantees one), returns default `arr = [0, 0]`.

Let me know if you want test cases or edge-case analysis.
 */
