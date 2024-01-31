import java.util.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int min = 0;
        
        for(int i=0; i<section.length; i++){
            if(min < section[i]){
                min = section[i];
                min += m-1;
                answer++;
            }
        }
        
        return answer;
    }
}