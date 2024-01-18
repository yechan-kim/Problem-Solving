import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> deleted_list = Arrays.stream(delete_list).boxed().collect(Collectors.toList());
        List<Integer> list = new ArrayList();
        
        for(int i=0; i<arr.length; i++){
            if(!deleted_list.contains(arr[i]))
                list.add(arr[i]);
        }
        
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}