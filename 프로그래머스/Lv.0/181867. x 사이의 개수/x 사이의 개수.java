import java.util.*;

class Solution {
    public int[] solution(String myString) {
        List<Integer> list = new ArrayList<>();
        String[] str = myString.split("x");
        
        for(int i=0; i<str.length; i++)
            list.add(str[i].length());
        
        if(myString.charAt(myString.length()-1) == 'x')
            list.add(0);
        
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}