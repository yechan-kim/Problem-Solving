import java.util.*;

class Solution {
    public String solution(String s) {
        String[] arr = new String[s.length()];
        for(int i=0; i<s.length(); i++)
            arr[i] = String.valueOf(s.charAt(i));
        
        Arrays.sort(arr, Comparator.reverseOrder());
        
        String answer = "";
        for(int i=0; i<arr.length; i++)
            answer += arr[i];
        
        return answer;
    }
}