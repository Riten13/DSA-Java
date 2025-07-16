public class L2176 {
    public static void main(String[] args) {
        int[] num = {3,1,2,2,2,1,3};
        int output = countPairs(num,2);
        System.out.println(output);
    }
    public static int countPairs(int[] nums, int k) {
        int count =0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j] && (i*j)%k == 0){
                    count++;
                }
            }
        }
        return count;
    }
}
