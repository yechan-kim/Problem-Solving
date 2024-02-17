import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        int answer = 1;
        
        for(String[] info : clothes){
            map.put(info[1], map.getOrDefault(info[1],1) + 1);
        }
        
        Collection<Integer> col = map.values();
        
        for(int cnt : col){
            answer *= cnt;
        }

        return answer - 1;
    }
}