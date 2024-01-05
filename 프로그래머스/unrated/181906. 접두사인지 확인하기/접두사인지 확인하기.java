import java.util.*;

class Solution {
    public int solution(String my_string, String is_prefix) {
        List<String> list = new ArrayList<>();
        
        for(int i=0; i<my_string.length(); i++){
            String temp = "";
            for(int j=0; j<=i; j++)
                temp += my_string.charAt(j);
            list.add(temp);
        }
        
        if(list.contains(is_prefix))
            return 1;
        else
            return 0;
    }
}