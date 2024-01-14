import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] temp = myStr.split("a|b|c");
        String[] answer = Arrays.stream(temp).filter(str -> !str.isEmpty()).toArray(String[]::new);
        
        if(answer.length == 0){
            String[] empty = new String[1];
            empty[0] = "EMPTY";
            return empty;
        }
            
        else
            return answer;
    }
}