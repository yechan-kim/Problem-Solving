import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {-1};
        
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        list.remove(list.indexOf(Arrays.stream(arr).min().getAsInt()));
        
        if(list.size() != 0)
            answer = list.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}