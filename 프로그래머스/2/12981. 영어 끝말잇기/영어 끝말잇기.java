import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        List<String> list = new ArrayList<>();
        list.add(words[0]);
        
        for(int i=0; i<words.length - 1; i++){
            if(words[i].charAt(words[i].length() - 1) != words[i+1].charAt(0)){
                answer[0] = ((i+1) % n) + 1;
                answer[1] = ((i+1) / n) + 1;
                break;
            } else if(list.contains(words[i+1])){
                answer[0] = ((i+1) % n) + 1;
                answer[1] = ((i+1) / n) + 1;
                break;
            } else{
                list.add(words[i+1]);
            }
        }

        return answer;
    }
}