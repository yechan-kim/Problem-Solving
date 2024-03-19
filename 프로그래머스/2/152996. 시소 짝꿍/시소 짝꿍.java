import java.util.*;

class Solution {
    public long solution(int[] weights) {
        HashMap<Double, Integer> map = new HashMap();
        Arrays.sort(weights);
        long answer = 0;
        
        for(int w : weights){
            if(map.containsKey((2.0/4)*w)){
                answer += map.get((2.0/4)*w);
            }
            if(map.containsKey((3.0/4)*w)){
                answer+= map.get((3.0/4)*w);
            }
            if(map.containsKey((2.0/3)*w)){
                answer += map.get((2.0/3)*w);
            }
            if(map.containsKey((1.0)*w)){
                answer += map.get((1.0)*w);
            }   
            map.put(1.0 * w, map.getOrDefault(1.0 * w, 0)+1);
        }
        
        return answer;
    }
}