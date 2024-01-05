import java.util.*;

class Solution {
    public int solution(String my_string, String is_suffix) {
        List<String> list = new ArrayList<>();
        
        for(int i=0; i<my_string.length(); i++){
            String temp = "";
            for(int j=0+i; j<my_string.length(); j++)
                temp += my_string.charAt(j);
            list.add(temp);
        }
        
        if(list.contains(is_suffix))
            return 1;
        else
            return 0;
    }
}