import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] temp = my_string.split(" ");
        List<String> list = new ArrayList<>();
        
        for(int i=0; i<temp.length; i++){
            if(!temp[i].equals(""))
                list.add(temp[i]);
        }
        
        String[] answer = list.stream().toArray(String[]::new);
        return answer;
    }
}