import java.util.*;

class Solution {
    public long solution(long n) {
        String s = Long.toString(n);
        char[] temp = new char[s.length()];
        
        for(int i=0; i<s.length(); i++)
            temp[i] = s.charAt(i);
        Arrays.sort(temp);
        
        String result = "";
        for(int i=0; i<s.length(); i++)
            result += temp[s.length()-1-i];
        
        long answer = Long.parseLong(result);
        return answer;
    }
}