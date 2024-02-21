import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] scoville, int K) {
        Queue<Integer> q = new PriorityQueue<>();
        for(int i : scoville){
            q.offer(i);
        }
        
        int answer = 0;
        
        while(q.peek() < K){
            q.offer(q.poll() + q.poll() * 2);
            
            if(q.size() < 1 || (q.size() < 2 && q.peek() < K)){
                return -1;
            }
            
            answer++;
        }
        
        return answer;
    }
}