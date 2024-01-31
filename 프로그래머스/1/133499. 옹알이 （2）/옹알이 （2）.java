import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] able = {"aya", "ye", "woo", "ma"};
        String[] disable = {"ayaaya", "yeye", "woowoo", "mama"};
        
        for (String b : babbling) {
            if (isValid(b, disable)) {
                for (String a : able) {
                    b = b.replace(a, " ");
                }
                
                if (b.trim().isEmpty()) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
    
    private boolean isValid(String babbling, String[] disable) {
        return Arrays.stream(disable).noneMatch(babbling::contains);
    }
}