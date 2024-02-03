class Solution {
    public String solution(String new_id) {
        String answer = new_id.toLowerCase();
        
        answer = answer.replaceAll("[^a-z0-9-_.]", "");
        answer = answer.replaceAll("\\.{2,}", ".");
        
        answer = deletePoint(answer);
        
        if (answer.length() >= 16) {
            answer = answer.substring(0, 15);
        }
        
        answer = deletePoint(answer);
        
        while (answer.length() <= 2) {
            answer += answer.charAt(answer.length() - 1);
        }
        
        return answer;
    }
    
    public String deletePoint(String str) {
        if (str.charAt(0) == '.') {
            if (str.length() == 1) {
                str = "a";
            } else {
                str = str.substring(1);
            }
        }
        
        if (str.charAt(str.length() - 1) == '.') {
            if (str.length() == 1) {
                str = "a";
            } else {
                str = str.substring(0, str.length() - 1);
            }
        }
        
        return str;
    }
}