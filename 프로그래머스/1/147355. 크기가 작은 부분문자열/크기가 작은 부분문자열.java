import java.util.*;

class Solution {
    public int solution(String t, String p) {
        List<Long> list = new ArrayList<>();
        
        for(int i=0; i<=t.length()-p.length(); i++){
            String temp = "";
            
            for(int j=0; j<p.length(); j++)
                temp += t.charAt(i+j);
            
            list.add(Long.parseLong(temp));
        }
        
        int answer = 0;
        long tmp = Long.parseLong(p);
        
        for(int i=0; i<list.size(); i++){
            if(list.get(i) <= tmp)
                answer++;
        }
        
        return answer;
    }
}