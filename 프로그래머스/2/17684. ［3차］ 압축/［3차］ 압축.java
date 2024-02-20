import java.util.*;

class Solution {
    public List<Integer> solution(String msg) {
        List<String> dic = new ArrayList<String>();
        List<Integer> answer = new ArrayList<Integer>();

        for(int i = 0 ; i < 26; i++) {
            dic.add(String.valueOf((char)('A'+i)));
        }

        for(int i = 0 ; i < msg.length() ; i++) {
            for(int j = dic.size()-1 ; j >= 0 ; j--) {
                if(msg.substring(i).startsWith(dic.get(j))) {
                    i += dic.get(j).length()-1;
                    answer.add(j+1);
                
                    if(i < msg.length() - 1){
                        dic.add(dic.get(j) + msg.charAt(i+1));
                    }
                
                 break;
                }
            }
        }
        return answer;  
    }
}