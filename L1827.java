//1827. Minimum Operations to Make the Array Increasing 
public class L1827 {
    public int minOperations(int[] nums) {
        if(nums.length <=1){
            return 0;
        }
        int count=0;
        int num=nums[0];
        for(int i=1;i<nums.length;i++){
            if(num==nums[i]){
                count++;
                num++;
            }else if (num>nums[i]){
                num++;
                count +=num-nums[i];
            }else{
                num=nums[i];
            }
        }
        return count;
    }
}
