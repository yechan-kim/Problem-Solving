import java.util.*;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        
        Map<Integer, Integer> olderMap = new HashMap<>();
        Map<Integer, Integer> youngerMap = new HashMap<>();
        
        for (int tmp : topping) {
            youngerMap.put(tmp, youngerMap.getOrDefault(tmp, 0) + 1);
        }
        
        for (int tmp : topping) {
            olderMap.put(tmp, olderMap.getOrDefault(tmp, 0) + 1);
            
            if (youngerMap.get(tmp) - 1 == 0)
                youngerMap.remove(tmp);
            else
                youngerMap.put(tmp, youngerMap.get(tmp) - 1);  
            
            if (olderMap.size() == youngerMap.size())
                answer++;
        }

        return answer;
    }
}
