import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        List<Integer> list = Arrays.stream(win_nums).boxed().collect(Collectors.toList());
        int cnt = 0;
        int zero = 0;
        
        for(int i=0; i<lottos.length; i++){
            if(lottos[i] == 0){
                zero++;
            } else if(list.contains(lottos[i])){
                cnt++;
            }
        }
        
        if(cnt + zero < 2){
            answer[0] = 6;
        } else{
            answer[0] = 7 - (cnt + zero);
        }
         
        if(cnt < 2){
            answer[1] = 6;
        } else{
            answer[1] = 7 - cnt;
        }
        
        return answer;
    }
}