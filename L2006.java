// 2006. Count Number of Pairs With Absolute Difference K

import java.util.HashMap;

public class L2006 {
    public static void main(String[] args) {
        int[] num = {3,2,1,5,4};
        int output = countKDifference(num,2);
        System.out.println(output);
        // System.out.println(0);
    }
    //Brute Force Method
    public static int countKDifference1(int[] nums, int k) {
        int count =0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(Math.abs(nums[i]-nums[j]) == k){
                    count++;
                }
            }
        }
        return count;
    }
    // Optimized Approach with array
    public static int countKDifference(int[] nums, int k) {
        int[] freq = new int[101]; // Since nums[i] is between 1 and 100
        int count = 0;

        for (int num : nums) {
            if (num - k >= 1) count += freq[num - k];
            if (num + k <= 100) count += freq[num + k];
            freq[num]++;
        }

        return count;
    }

    // This is the perfect and most optimal approach but using hashmap
    public int countKDifference2(int[] nums, int k) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            count += map.getOrDefault(num - k, 0);
            count += map.getOrDefault(num + k, 0);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return count;
    }
}
