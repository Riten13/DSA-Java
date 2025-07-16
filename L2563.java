import java.util.Arrays;

public class L2563 {
    public static void main(String[] args) {
        // int[] num = {-5,-7,-5,-7,-5};
        int[] num = {1,7,9,2,5,3};
        long output = countFairPairs(num,3,6);
        System.out.println(output);
        // System.out.println(0);
    }
    // public static long countFairPairs(int[] nums, int lower, int upper) {
    //     long count = 0;
    //     int left =0,right = nums.length-1,middle =nums.length/2;
    //     Arrays.sort(nums);
    //     System.out.println(Arrays.toString(nums)+" lower= 3 and upper =6 "+nums[middle]);
    //     for(int i=0;i<nums.length-1;i++){
    //         for(int j=nums.length;j>0;j--){
    //             if(nums[left] + nums[middle]>upper){
    //                 middle = middle /2;
    //             }
    //             if(nums[left] + nums[middle]<upper){

    //             }
    //             if(nums[middle] + nums[right] > upper){
    //                 right--;
    //             }
    //             if(nums[left] + nums [right] >upper){
    //                 right--;
    //             }
    //         }
    //     }
    //     // 1,2,3,4,5,6 2 -  - 6
    //     return count;
    // }
    public static long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        int n = nums.length;
        long count = 0;

        for (int i = 0; i < n - 1; i++) {
            int left = lowerBound(nums, i + 1, n - 1, lower - nums[i]);
            int right = upperBound(nums, i + 1, n - 1, upper - nums[i]);
            if (left <= right) {
                count += (right - left + 1);
            }   
        }

        return count;
    }

    // Finds first index ≥ target
    private static int lowerBound(int[] nums, int start, int end, int target) {
        int l = start, r = end, ans = end + 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] >= target) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    // Finds last index ≤ target
    private static int upperBound(int[] nums, int start, int end, int target) {
        int l = start, r = end, ans = start - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] <= target) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }
}