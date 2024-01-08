import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int start = -1;
        int end = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==2){
                start = i;
                break;
            }
        }
        
        if(start == -1){
            int[] answer = {-1};
            return answer;
        }
        
        for(int i=arr.length - 1; i>=0; i--){
            if(arr[i]==2){
                end = i;
                break;
            }
        }
        
        for(int i=start; i<=end; i++)
            list.add(arr[i]);    
        
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}