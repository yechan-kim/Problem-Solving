class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        for(int i=1; i<food.length; i++){
            for(int j=0; j<food[i]/2; j++)
                answer += String.valueOf(i);
        }
        
        int tmp = answer.length();
        
        answer += '0';
        
        for(int i = tmp - 1; i>=0; i--)
            answer += answer.charAt(i);
        
        return answer;
    }
}