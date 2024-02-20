class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        int turn = 1;
        
        for(int i=0; i<t*m; i++){
            String num = Integer.toString(i,n).toUpperCase();
            
            for(int j=0; j<num.length(); j++){
                if(turn % m == p || (m == p && turn % m == 0)){
                    answer += num.charAt(j);
                    
                    if(answer.length() == t){
                        return answer;
                    }
                }
                
                turn++;
            }
        }
        
        return answer;
    }
}