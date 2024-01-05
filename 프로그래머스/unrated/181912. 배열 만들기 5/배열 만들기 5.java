import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<intStrs.length; i++){
            String temp = "";
            
            for(int j=s; j<s+l; j++)
                temp += intStrs[i].charAt(j);
            
            int num = Integer.parseInt(temp);
            if(num > k)
                list.add(num);
        }
        
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}