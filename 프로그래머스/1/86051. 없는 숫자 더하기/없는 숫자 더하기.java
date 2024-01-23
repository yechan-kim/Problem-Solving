import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] numbers) {
         List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        int answer = 0;
        
        for(int i=0; i<=9; i++){
            if(!list.contains(i))
                answer += i;
        }
        
        return answer;
    }
}