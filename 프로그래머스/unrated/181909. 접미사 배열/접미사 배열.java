import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        List<String> list = new ArrayList<>();
        
        for(int i=0; i<my_string.length(); i++){
            String temp = "";
            for(int j=0+i; j<my_string.length(); j++)
                temp += my_string.charAt(j);
            list.add(temp);
        }
        
        Collections.sort(list);
        String[] answer = list.stream().toArray(String[]::new);
        return answer;
    }
}