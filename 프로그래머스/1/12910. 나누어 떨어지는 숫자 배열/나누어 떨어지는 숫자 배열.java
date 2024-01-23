import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {-1};
        Arrays.sort(arr);
        
        List<Integer> list =new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] % divisor == 0)
                list.add(arr[i]);
                
        }
        
        if(list.size() != 0)
            answer = list.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}