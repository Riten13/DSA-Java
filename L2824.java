// 2824. Count Pairs Whose Sum is Less than Target

import java.util.Arrays;
import java.util.List;

public class L2824 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(-1,1,2,3,1);
        int output = countPairs(list,2);
        System.out.println(output);
    }
    public static int countPairs(List<Integer> nums, int target) {
        int count =0;
        for(int i=0;i<nums.size()-1;i++){
            for(int j=i+1;j<nums.size();j++){
                if((nums.get(i)+nums.get(j)) < target){
                    count++;
                } 
            }
        }
        return count;
    }
}