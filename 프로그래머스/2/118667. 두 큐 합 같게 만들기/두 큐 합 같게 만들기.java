import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        int size = queue1.length;
        int answer = 0;
        int num = 0;
        long sum1 = 0L;
        long sum2 = 0L;
    
        for(int i=0; i<size; i++){
            q1.add(queue1[i]);
            sum1 += queue1[i];
            q2.add(queue2[i]);
            sum2 += queue2[i];
        }
        
        while(answer <= size * 4){
            if(sum1 > sum2){
                num = q1.poll();
                sum1 -= num;
                sum2 += num;
                q2.add(num);
            } else if(sum1 < sum2){
                num = q2.poll();
                sum2 -= num;
                sum1 += num;
                q1.add(num);
            } else{
                return answer;
            }
            
            answer++;
        }
    
        return -1;
    }
}