import java.util.*;

class Solution {
    public int solution(int[] nums) {
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<nums.length; i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
            }
        }
        
        return Math.min(nums.length/2,list.size());
    }
}