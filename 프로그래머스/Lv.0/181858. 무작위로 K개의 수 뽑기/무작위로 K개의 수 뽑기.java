import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            if(!list.contains(arr[i]))
                list.add(arr[i]);
            else
                continue;
            
            if(list.size() == k)
                break;
        }
        
        if(list.size() < k){
            for(int i=list.size(); i<k; i++)
                list.add(-1);
        }
        
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}