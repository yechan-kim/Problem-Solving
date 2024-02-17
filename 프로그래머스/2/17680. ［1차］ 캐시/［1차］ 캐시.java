import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        List<String> list = new ArrayList<>();
        int answer = 0;
        
        if(cacheSize == 0){
            return cities.length * 5;
        }
        
        for(String str : cities){
            str = str.toLowerCase();
            
            if(list.contains(str) && list.size() < cacheSize){
                list.add(str);
                answer++;
            } else if(list.contains(str)){
                list.remove(list.indexOf(str));
                list.add(str);
                answer ++;
            }else if(list.size() < cacheSize){
                list.add(str);
                answer += 5;
            } else{
                list.remove(0);
                list.add(str);
                answer += 5;
            }
        }
        
        return answer;
    }
}