import java.util.*;

class Solution {
    public boolean check(String tmp){
        for(int j=0; j<tmp.length(); j++){
                if(tmp.charAt(j) != '0' && tmp.charAt(j) != '5')
                    return false;
            }
        
        return true;
    }
    
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        
        for(int i=l; i<=r; i++){
            String tmp =  Integer.toString(i);
            if(check(tmp))
                list.add(i);
        }
        
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        int[] empty = {-1};
        
        if(answer.length == 0)
            return empty;
        else
            return answer;
    }
}