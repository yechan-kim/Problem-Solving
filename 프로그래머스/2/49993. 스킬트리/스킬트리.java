import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i=0; i<skill.length(); i++){
            map.put(skill.charAt(i),i);
        }
        
        for(String str : skill_trees){
            boolean vaild = true;
            int cnt = 0;
            
            for(int i=0; i<str.length(); i++){
                int result = map.getOrDefault(str.charAt(i), -1);
                
                if(result == cnt){
                    cnt++;
                } else if(result == -1){
                    continue;
                } else {
                    vaild = false;
                    break;
                }
            }
            
            if(vaild){
                answer++;
            }
        }
        
        return answer;
    }
}