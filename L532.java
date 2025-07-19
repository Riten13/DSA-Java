import java.util.HashMap;

public class L532 {
    public static void main(String[] args) {
        int[] num = {3,1,4,1,5  };
        int output = findPairs(num,2);
        System.out.println(output);

    }
    public static int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> languages = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            languages.put(nums[i], 0);
        }
        byte count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                // if((languages.keySet()) == k && i!= j){
                //     count++;
                // }
            }
        }
        return count;
    }
}
