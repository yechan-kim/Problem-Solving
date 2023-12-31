import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int temp = k;
        int cnt = 0;
        int answer = 0;
        
        Arrays.sort(score);
        
        for(int i = score.length - 1; i >= 0; i--){
            if(temp >= score[i])
                temp = score[i];
            
            cnt++;
            
            if(cnt % m == 0){
                answer += temp * m;
                temp = k;
            }
        }
        
        return answer;
    }
}