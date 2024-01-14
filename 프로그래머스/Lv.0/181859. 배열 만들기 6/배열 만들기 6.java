import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            if(stk.isEmpty() || stk.get(stk.size()-1) != arr[i])
                stk.add(arr[i]);
            else
                stk.remove(stk.size()-1);
        }
        if(stk.isEmpty()){
            int[] empty = new int[1];
            empty[0] = -1;
            return empty;
        }
        
        int[] answer = stk.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}